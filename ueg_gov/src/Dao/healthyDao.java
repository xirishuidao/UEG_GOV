package Dao;

import entity.healthy;

import java.util.List;

public interface healthyDao extends BaseDao{
    int insert(healthy p);

    int update(healthy p);

    int deleteById(long cid);

    healthy getOneById(long cid);

   List<healthy> getOneByMohu(String a, String b);

    List<healthy> getOneByMohu(String a, int b);

}
