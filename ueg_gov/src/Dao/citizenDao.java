package Dao;

import entity.citizen;

import java.util.List;

public interface citizenDao extends BaseDao{
    int insert(citizen p);

    int update(citizen p);

    int deleteById(long cid);

    citizen getOneById(long cid);

    List<citizen> getPartByTiaojian(String Tiaojian);
}
