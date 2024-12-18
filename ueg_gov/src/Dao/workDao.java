package Dao;

import entity.work;

import java.util.List;

public interface workDao  extends BaseDao{
    int insert(work p);

    int update(work p);

    int deleteById(String cid);

    work getOneById(String cid);




}
