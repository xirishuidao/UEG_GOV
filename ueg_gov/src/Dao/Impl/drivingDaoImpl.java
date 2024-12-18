package Dao.Impl;

import Dao.drivingDao;
import entity.driving;

import java.util.Collections;
import java.util.List;

public class drivingDaoImpl implements drivingDao {
    @Override
    public int insert(driving p) {
        return 0;
    }

    @Override
    public int update(driving p) {
        return 0;
    }

    @Override
    public int deleteByDid(String did) {
        return 0;
    }

    @Override
    public int deleteByCid(String did) {
        return 0;
    }

    @Override
    public driving getOneById(String did) {
        return null;
    }

    @Override
    public List<driving> getPart(long cid) {
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
