package service.Impl;

import Dao.Impl.administerDaoImpl;
import entity.administer;
import service.administerService;

public class administerServiceImpl implements administerService {


    @Override
    public String findPassword(long aid) {
        administerDaoImpl administerDaoImpl1 = new administerDaoImpl();
       administer a=administerDaoImpl1.getOneById(aid);
       if(a!=null) {
           return a.getApwd();
       }
       return null;
    }

    @Override
    public String findName(long aid) {
        administerDaoImpl administerDaoImpl1 = new administerDaoImpl();
        administer a=administerDaoImpl1.getOneById(aid);
        if(a!=null) {
            return a.getAname();
        }
        return null;
    }

    @Override
    public int update(long aid,String apwd, String aname) {
        apwd=apwd.equals("")?findPassword(aid):apwd;
        aname=aname.equals("")?findName(aid):aname;

        administerDaoImpl administerDaoImpl1 = new administerDaoImpl();
        administer a=new administer();
        a.setAid(aid);
        a.setApwd(apwd);
        a.setAname(aname);
       int row=administerDaoImpl1.update(a);
        row = row==1?0:-1;
        return row;
    }
}
