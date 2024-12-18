package Dao.Impl;

import Dao.domicileDao;
import entity.domicile;

import java.util.Collections;
import java.util.List;

public class domicileDaoImpl implements domicileDao {
    @Override
    public int insert(domicile p) {
        return 0;
    }

    @Override
    public int update(domicile p) {
        return 0;
    }

    @Override
    public int deleteById(String cid) {
        return 0;
    }

    @Override
    public domicile getOneById(String cid) {
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
