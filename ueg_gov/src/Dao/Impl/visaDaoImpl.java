package Dao.Impl;

import Dao.visaDao;
import entity.visa;

import java.util.Collections;
import java.util.List;

public class visaDaoImpl  extends BaseDaoImpl  implements visaDao {
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
        String sql = "select * from visa where vid = ?";
        visa[] visa1=(visa[]) getOne(sql,vid);
        return visa1[0];
    }

    @Override
    public List<visa> getPartc(long cid) {

        return Collections.emptyList();
    }

    @Override
    public List<visa> getParts(int vstate) {
        return Collections.emptyList();
    }


}
