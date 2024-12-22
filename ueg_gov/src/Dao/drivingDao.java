package Dao;

import entity.driving;

import java.util.List;

public interface drivingDao extends BaseDao {
    int insert(driving p);

    int update(driving p);

    int deleteByDid(long did);

    int deleteByCid(long did);

    driving getOneById(long did);

    List<driving> getPart1(long cid);

    List<driving> getPart2(int daddress);

    List<driving> getPart3(String a,String  b);



}
