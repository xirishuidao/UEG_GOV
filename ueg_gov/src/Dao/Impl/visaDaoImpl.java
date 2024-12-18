package Dao.Impl;

import Dao.visaDao;
import entity.visa;

import java.util.Collections;
import java.util.List;

public class visaDaoImpl implements visaDao {
    @Override
    public int insert(visa p) {
        return 0;
    }

    @Override
    public int update(visa p) {
        return 0;
    }

    @Override
    public int deleteByCid(long cid) {
        return 0;
    }

    @Override
    public int deleteByVid(long vid) {
        return 0;
    }

    @Override
    public visa getOneById(long vid) {
        return null;
    }

    @Override
    public List<visa> getPartc(long cid) {
        return Collections.emptyList();
    }

    @Override
    public List<visa> getParts(int vstate) {
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
