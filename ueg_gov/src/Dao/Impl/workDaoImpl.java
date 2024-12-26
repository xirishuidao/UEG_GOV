package Dao.Impl;

import Dao.workDao;
import entity.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class workDaoImpl  extends BaseDaoImpl  implements workDao {
    @Override
    public int insert(work p) {
        String sql="insert into work values(?,?,?,?,?)";
        int row=executeUpdate(sql,p.getWname(),p.getWlevel(),p.getCid(),p.getWaddress(),p.getWcompany());
        return row;
    }

    @Override
    public int update(work p) {
        String sql="update work set wname=?,wlevel=?,waddress=?,wcompany=? where cid=?";
        int row=executeUpdate(sql,p.getWname(),p.getWlevel(),p.getWaddress(),p.getWcompany(),p.getCid());
        return row;
    }




    @Override
    public int deleteById(long cid) {
        String sql="delete from work where cid=?";
        int row=executeUpdate(sql,cid);
        return row;
    }

    @Override
    public work getOneById(long cid) {
        String sql = "select * from work where cid = ?";
       work work1=new work();
       Object [] ob1=getOne(sql,cid);
       if(ob1==null){
           return null;
       }else {
           for (int i = 0; i < ob1.length; i++) {
               switch (i) {
                   case 0:
                       work1.setCid(Long.valueOf(ob1[i].toString()));
                       break;
                   case 1:
                       work1.setWname(ob1[i].toString());
                       break;
                   case 2:
                       work1.setWlevel(ob1[i].toString());
                       break;
                   case 3:
                       work1.setWaddress(ob1[i].toString());
                       break;
                   case 4:
                       work1.setWcompany(ob1[i].toString());
                       break;
               }
           }
           return work1;
       }
    }




    @Override
    public List<work> getOneByMohu(String a, String b) {
        String sql="select * from work where ?=?";

        List<work> workList=new ArrayList<>();
        List<Object []> obList=getMany(sql,a,"%"+b+"%");
        for(Object [] ob1:obList){
            work work1=new work();
            for(int i=0;i<ob1.length;i++){
                switch (i){
                    case 0:work1.setCid(Long.valueOf(ob1[i].toString()));break;
                    case 1:work1.setWname(ob1[i].toString());break;
                    case 2:work1.setWlevel(ob1[i].toString());break;
                    case 3:work1.setWaddress(ob1[i].toString());break;
                    case 4:work1.setWcompany(ob1[i].toString());break;
                }
            }
            workList.add(work1);
        }
        return workList;
    }


}
