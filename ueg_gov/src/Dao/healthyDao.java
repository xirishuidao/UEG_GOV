package Dao;

import entity.healthy;

public interface healthyDao extends BaseDao{
    int insert(healthy p);

    int update(healthy p);

    int deleteById(long cid);

    healthy getOneById(long cid);

    healthy getOneByMohu(String a,String b);

}
