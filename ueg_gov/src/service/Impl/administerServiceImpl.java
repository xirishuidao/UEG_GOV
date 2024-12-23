package service.Impl;

import Dao.Impl.administerDaoImpl;
import entity.administer;
import service.administerService;

public class administerServiceImpl implements administerService {


    @Override
    public String findPassword(long aid) {
        administerDaoImpl administerDaoImpl1 = new administerDaoImpl();
       administer a=administerDaoImpl1.getOneById(aid);
        return a.getApwd();
    }

    @Override
    public String findName(long aid) {
        administerDaoImpl administerDaoImpl1 = new administerDaoImpl();
        administer a=administerDaoImpl1.getOneById(aid);
        return a.getAname();
    }

    @Override
    public int update(long aid,String apwd, String aname) {
        if(apwd==""){
            apwd=findPassword(aid);
        }
        if(aname==""){
            aname=findName(aid);
        }
        administerDaoImpl administerDaoImpl1 = new administerDaoImpl();
        administer a=new administer();
        a.setAid(aid);
        a.setApwd(apwd);
        a.setAname(aname);
       int row=administerDaoImpl1.update(a);
       if(row==1){
           return 0;
       } else {
           return -1;
       }
    }
}
