package Dao;

import entity.visa;

import java.util.List;

public interface visaDao extends BaseDao{
    int insert(visa p);

    int update(visa p);

    int deleteByCid(long cid);

    int deleteByVid(long vid);

    visa getOneById(long vid);

    List<visa> getPartc(long cid);

    List<visa> getParts(int vstate);
}
