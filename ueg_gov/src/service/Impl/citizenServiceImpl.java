package service.Impl;

import Dao.Impl.citizenDaoImpl;
import entity.citizen;
import service.citizenService;

public class citizenServiceImpl implements citizenService {
    @Override
    public int insert(long cid, String cpwd, String cname) {
        citizen c = new citizen();
        c.setCid(cid);
        c.setCpwd(cpwd);
        c.setCname(cname);
        citizenDaoImpl impl = new citizenDaoImpl();
        int row=impl.insert(c);
        if(row==1){
            return 0;
        }else{
            return -1;
        }
    }

    @Override
    public int delete(long cid) {
        citizenDaoImpl impl = new citizenDaoImpl();
        int row=impl.deleteById(cid);
        if(row==1){
            return 0;
        }else{
            return -1;
        }
    }

    @Override
    public int update(long cid, String cpwd, String cname) {
        if(cpwd==null){
            cpwd=findname(cid);
        }
        if(cname==null){
            cname=findname(cid);
        }
        citizen c = new citizen();
        c.setCid(cid);
        c.setCpwd(cpwd);
        c.setCname(cname);
        citizenDaoImpl impl = new citizenDaoImpl();
        int row=impl.update(c);
        if(row==1){
            return 0;
        }else{
            return -1;
        }
    }

    @Override
    public String findpasswd(long cid) {
        citizenDaoImpl impl = new citizenDaoImpl();
    citizen c= impl.getOneById(cid);
    return c.getCpwd();
    }

    @Override
    public String findname(long cid) {
        citizenDaoImpl impl = new citizenDaoImpl();
        citizen c= impl.getOneById(cid);
        return c.getCname();
    }
}
