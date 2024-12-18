package Dao.Impl;

import Dao.workDao;
import entity.work;

import java.util.Collections;
import java.util.List;

public class workDaoImpl implements workDao {
    @Override
    public int insert(work p) {
        return 0;
    }

    @Override
    public int update(work p) {
        return 0;
    }

    @Override
    public int deleteById(String cid) {
        return 0;
    }

    @Override
    public work getOneById(String cid) {
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
