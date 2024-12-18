package Dao.Impl;

import Dao.citizenDao;
import entity.citizen;

import java.util.Collections;
import java.util.List;

public class citizenDaoImpl implements citizenDao {
    @Override
    public int insert(citizen p) {
        return 0;
    }

    @Override
    public int update(citizen p) {
        return 0;
    }

    @Override
    public int deleteById(String cid) {
        return 0;
    }

    @Override
    public citizen getOneById(String cid) {
        return null;
    }

    @Override
    public List<citizen> getPart(String tiaojian) {
        return Collections.emptyList();
    }

    @Override
    public int executeUpdate(String sql, Object... params) {
        return 0;
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
