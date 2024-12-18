package Dao;

import entity.domicile;

import java.util.List;

public interface domicileDao extends BaseDao{
    int insert(domicile p);

    int update(domicile p);

    int deleteById(String cid);

    domicile getOneById(String cid);

}
