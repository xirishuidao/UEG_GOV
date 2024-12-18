package Dao;

import entity.citizen;

import java.util.List;

public interface citizenDao extends BaseDao{
    int insert(citizen p);

    int update(citizen p);

    int deleteById(String cid);

    citizen getOneById(String cid);

    List<citizen> getPart(String tiaojian);
}
