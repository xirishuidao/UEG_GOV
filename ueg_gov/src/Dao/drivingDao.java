package Dao;

import entity.driving;

import java.util.List;

public interface drivingDao extends BaseDao {
    int insert(driving p);

    int update(driving p);

    int deleteByDid(String did);

    int deleteByCid(String did);

    driving getOneById(String did);

    List<driving> getPart(long cid);
}
