package Dao.Impl;

import Dao.healthyDao;
import entity.healthy;

import java.util.Collections;
import java.util.List;

public class healthyDaoImpl  extends BaseDaoImpl  implements healthyDao {
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
        String sql = "select * from healthy where cid = ?";
        healthy[] healthy1=(healthy[]) getOne(sql, cid);
        return null;
    }

}
