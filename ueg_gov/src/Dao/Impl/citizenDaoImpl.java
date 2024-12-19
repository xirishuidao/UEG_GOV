package Dao.Impl;

import Dao.citizenDao;
import entity.citizen;

import java.util.Collections;
import java.util.List;

public class citizenDaoImpl  extends BaseDaoImpl implements citizenDao {
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
        String sql = "select * from citizen where cid=?";
        citizen[] citizen1=(citizen[]) getOne(sql, cid);
        return citizen1[0];
    }

    @Override
    public List<citizen> getPart(String tiaojian) {
        return Collections.emptyList();
    }


}
