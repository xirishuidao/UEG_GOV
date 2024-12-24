package Dao;

import entity.domicile;

import java.util.List;

public interface domicileDao extends BaseDao{
    int insert(domicile p);

    int update(domicile p);

    int deleteById(long cid);

    domicile getOneById(long cid);

    List<domicile> getmanyByMohu(String type,String ocntext);

    List<domicile> getmanyByCountry(int country);


}
