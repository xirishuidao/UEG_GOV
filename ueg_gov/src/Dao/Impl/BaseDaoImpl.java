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

        int rows = 0;

        try {
            con = DataBaseUtil.getConnection();
            ps = con.prepareStatement(sql);

            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1, params[i]);
            }
            rows = ps.executeUpdate();
        } catch (Exception ex) {
            return -1;
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

        con = DataBaseUtil.getConnection();

        Object[] data = null;

        try {
            ps = con.prepareStatement(sql);

            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1, params[i]);
            }

            rs = ps.executeQuery();

            int count=rs.getMetaData().getColumnCount();
            data=new Object[count];

            if (rs.next()) {
                for(int i=0;i<count;i++) {
                    data[i]=rs.getObject(i+1);
                }
            }
        } catch (SQLException e) {
           return null;
        } finally {
            DataBaseUtil.close(rs, ps, con);
        }

        return data;
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
                ps.setObject(i + 1, params[i]);
            }

            rs = ps.executeQuery();

            int count=rs.getMetaData().getColumnCount();

            while (rs.next()) {

                Object[] data=new Object[count];

                for(int i=0;i<count;i++) {
                    data[i]=rs.getObject(i+1); //获取对应列的数据，存入数组
                }

                list.add(data);
            }
        } catch (SQLException e) {
            return null;
        } finally {
            DataBaseUtil.close(rs, ps, con);
        }

        return list; //将存储了查询结果的数组列表返回
    }

}
