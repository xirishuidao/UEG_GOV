package Dao.Impl;

import Dao.healthyDao;
import entity.healthy;

import java.util.Collections;
import java.util.List;

public class healthyDaoImpl implements healthyDao {
    @Override
    public int insert(healthy p) {
        return 0;
    }

    @Override
    public int update(healthy p) {
        return 0;
    }

    @Override
    public int deleteById(String cid) {
        return 0;
    }

    @Override
    public healthy getOneById(String cid) {
        return null;
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
