package Dao.Impl;

import Dao.BaseDao;
import util.DataBaseUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BaseDaoImpl implements BaseDao {
    @Override
    public int executeUpdate(String sql, Object... params) {

        // 对于可变参数，像数组一样操作即可，参数名（如这里的params）就是数组名
        // 如果想获取第一个可变参数的值，使用params[0]即可，第二个是params[1]，以此类推
        Connection con = null;
        PreparedStatement ps = null;

        int rows = 0; // 定义一个变量，存储受影响的行数

        try {
            con = DataBaseUtil.getConnection();
            ps = con.prepareStatement(sql);

            for (int i = 0; i < params.length; i++) {
                // 设置第i+1个参数的值为数组中的第i+1个值
                // 数组的索引从0开始，sql语句的?的索引从1开始
                // 遍历一下传入的每个sql语句需要的参数的值，设置为对应的?的值
                ps.setObject(i + 1, params[i]);
            }
            rows = ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            DataBaseUtil.close(null, ps, con);
        }
        return rows;
    }

    @Override
    public Object[] getOne(String sql, Object... params) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        // 定义一个列表，存储查询到的多个成绩记录

        con = DataBaseUtil.getConnection();

        Object[] data = null; //定义一个数组用于存储查询结果

        try {
            ps = con.prepareStatement(sql);

            for (int i = 0; i < params.length; i++) {
                // 设置第i+1个参数的值为数组中的第i+1个值
                // 数组的索引从0开始，sql语句的?的索引从1开始
                // 遍历一下传入的每个sql语句需要的参数的值，设置为对应的?的值
                ps.setObject(i + 1, params[i]);
            }

            // 执行查询，获得结果集
            rs = ps.executeQuery();

            //获取查询到的列的数量
            int count=rs.getMetaData().getColumnCount();
            data=new Object[count];

            // 循环读取每一行记录
            if (rs.next()) {
                for(int i=0;i<count;i++) {
                    data[i]=rs.getObject(i+1); //获取对应列的数据，存入数组
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DataBaseUtil.close(rs, ps, con);
        }

        return data; //将存储了查询结果的数组返回
    }

    @Override
    public List<Object[]> getMany(String sql, Object... params) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        con = DataBaseUtil.getConnection();

        List<Object[]> list=new ArrayList<>();

        try {
            ps = con.prepareStatement(sql);

            for (int i = 0; i < params.length; i++) {
                // 设置第i+1个参数的值为数组中的第i+1个值
                // 数组的索引从0开始，sql语句的?的索引从1开始
                // 遍历一下传入的每个sql语句需要的参数的值，设置为对应的?的值
                ps.setObject(i + 1, params[i]);
            }

            // 执行查询，获得结果集
            rs = ps.executeQuery();

            int count=rs.getMetaData().getColumnCount(); //获取查询到的列的数量

            // 循环读取每一行记录
            while (rs.next()) {

                Object[] data=new Object[count];

                for(int i=0;i<count;i++) {
                    data[i]=rs.getObject(i+1); //获取对应列的数据，存入数组
                }

                list.add(data);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DataBaseUtil.close(rs, ps, con);
        }

        return list; //将存储了查询结果的数组列表返回
    }

}
