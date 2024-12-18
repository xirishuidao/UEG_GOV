package Dao;

import entity.healthy;

import java.util.List;

public interface healthyDao extends BaseDao{
    int insert(healthy p);

    int update(healthy p);

    int deleteById(String cid);

    healthy getOneById(String cid);


}
