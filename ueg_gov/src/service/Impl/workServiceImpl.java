package service.Impl;
import Dao.Impl.citizenDaoImpl;
import Dao.Impl.workDaoImpl;
import entity.work;
import service.workService;
public class workServiceImpl implements workService {



    @Override
    public int insert(long cid, String wname, String wlevel, String waddress, String wcompany) {
        wname = wname.equals("") ? findwname(cid) : wname;
        wlevel = wlevel.equals("") ? findwlevel(cid) : wlevel;
        waddress = waddress.equals("") ? findwaddress(cid) : waddress;
        wcompany = wcompany.equals("") ? findwcompany(cid) : wcompany;


        work c = new work();
        c.setCid(cid);
        c.setWname(wname);
        c.setWlevel(wlevel);
        c.setWaddress(waddress);
        c.setWcompany(wcompany);

        workDaoImpl impl = new workDaoImpl();
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
    public int update(long cid, String wname, String wlevel, String waddress, String wcompany) {
        wname = wname.equals("") ? findwname(cid) : wname;
        wlevel = wlevel.equals("") ? findwlevel(cid) : wlevel;
        waddress = waddress.equals("") ? findwaddress(cid) : waddress;
        wcompany = wcompany.equals("") ? findwcompany(cid) : wcompany;


        work c = new work();
        c.setCid(cid);
        c.setWname(wname);
        c.setWlevel(wlevel);
        c.setWaddress(waddress);
        c.setWcompany(wcompany);

        workDaoImpl impl = new workDaoImpl();
        int row=impl.update(c);
        row = row==1?0:-1;
        return row;
    }

    @Override
    public String findwname(long cid) {
        workDaoImpl impl = new workDaoImpl();
        work c=impl.getOneById(cid);
        if(c!=null){
            return c.getWname();
        }
        return null;
    }


    @Override
    public String findwlevel(long cid) {
        workDaoImpl impl = new workDaoImpl();
        work c=impl.getOneById(cid);
        if(c!=null){
            return c.getWlevel();
        }
        return null;
    }

    @Override
    public String findwaddress(long cid) {
        workDaoImpl impl = new workDaoImpl();
        work c=impl.getOneById(cid);
        if(c!=null){
            return c.getWaddress();
        }
        return null;
    }

    @Override
    public String findwcompany(long cid) {
        workDaoImpl impl = new workDaoImpl();
        work c=impl.getOneById(cid);
        if(c!=null){
            return c.getWcompany();
        }
        return null;
    }
}
