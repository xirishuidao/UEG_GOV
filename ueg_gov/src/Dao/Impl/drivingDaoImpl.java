package Dao.Impl;

import Dao.drivingDao;
import entity.driving;

import java.util.Collections;
import java.util.List;

public class drivingDaoImpl  extends BaseDaoImpl  implements drivingDao {
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
        String sql = "select * from driving where did = ?";
        driving[] driving1 = (driving[]) getOne(sql,did);
        return driving1[0];
    }

    @Override
    public List<driving> getPart(long cid) {
        return Collections.emptyList();
    }

}
