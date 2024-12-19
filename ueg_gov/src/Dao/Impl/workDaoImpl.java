package Dao.Impl;

import Dao.workDao;
import entity.work;

import java.util.Collections;
import java.util.List;

public class workDaoImpl  extends BaseDaoImpl  implements workDao {
    @Override
    public int insert(work p) {
        String sql="insert into work values(?,?,?,?,?,?,?,?)";
        int row=executeUpdate(sql,p.getCid(),p.getWname(),p.getWlevel(),p.getWaddress(),p.getWcompany());
        return row;
    }

    @Override
    public int update(work p) {
        return 0;
    }

    @Override
    public int deleteById(String cid) {
        return 0;
    }

    @Override
    public work getOneById(String cid) {
        String sql = "select * from work where cid = ?";
        work [] work1=(work[]) getOne(sql,cid);
        return work1[0];
    }



}
