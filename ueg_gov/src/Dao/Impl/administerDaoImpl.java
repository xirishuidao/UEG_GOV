package Dao.Impl;

import Dao.administerDao;
import entity.administer;
import main.pages.errPage;
import util.DataBaseUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class administerDaoImpl implements administerDao {

    @Override
    public int update(administer p) {

    }



    @Override
    public administer getOneById(String aid) {
        return null;
    }

    @Override
    public int executeUpdate(String sql, Object... params) {
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
            //errPage.show("123","123");
        } finally {
            DataBaseUtil.close(null, ps, con);
        }
        return rows;
    }

    @Override
    public Object[] getOne(String sql, Object... params) {
        return new Object[0];
    }

    @Override
    public List<Object[]> getMany(String sql, Object... params) {
        return Collections.emptyList();
    }
}
