package Dao;

import entity.administer;

import java.util.List;

public interface administerDao extends BaseDao{

    int update(administer p);

    administer getOneById(long aid);

}
