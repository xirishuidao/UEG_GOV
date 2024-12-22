package Dao;

import entity.work;

import java.util.List;

public interface workDao  extends BaseDao{
    int insert(work p);

    int update(work p);

    int deleteById(long cid);

    work getOneById(long cid);

    List<work> getOneByMohu(String a,String b);

}
