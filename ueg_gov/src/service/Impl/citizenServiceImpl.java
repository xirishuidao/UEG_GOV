package service.Impl;

import Dao.Impl.citizenDaoImpl;
import entity.citizen;
import service.citizenService;

public class citizenServiceImpl implements citizenService {
    @Override
    public int insert(long cid, String cpwd, String cname) {
        cpwd = cpwd.equals("") ? findpasswd(cid) : cpwd;
        cname = cname.equals("") ? findname(cid) : cname;

        citizen c = new citizen();
        c.setCid(cid);
        c.setCpwd(cpwd);
        c.setCname(cname);
        citizenDaoImpl impl = new citizenDaoImpl();
        int row=impl.insert(c);
        row = row==1?0:-1;
        return row;
    }

    @Override
    public int delete(long cid) {
        citizenDaoImpl impl = new citizenDaoImpl();
        int row=impl.deleteById(cid);
        row = row==1?0:-1;
        return row;
    }

    @Override
    public int update(long cid, String cpwd, String cname) {
        cpwd = cpwd.equals("") ? findpasswd(cid) : cpwd;
        cname = cname.equals("") ? findname(cid) : cname;


        citizen c = new citizen();
        c.setCid(cid);
        c.setCpwd(cpwd);
        c.setCname(cname);
        citizenDaoImpl impl = new citizenDaoImpl();
        int row=impl.update(c);
       row = row==1?0:-1;
       return row;
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
