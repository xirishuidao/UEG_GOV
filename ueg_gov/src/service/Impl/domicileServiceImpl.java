package service.Impl;

import Dao.Impl.domicileDaoImpl;
import entity.domicile;
import service.domicileService;

import java.sql.Date;
import java.util.Collections;
import java.util.List;

public class domicileServiceImpl implements domicileService {
    @Override
    public int insert(long cid, String cgender, Date cdatetime, String cdegree, int ccountry, String caddress, String cname) {
        domicileDaoImpl dao = new domicileDaoImpl();
        domicile domicile = new domicile();
        domicile.setCid(cid);
        domicile.setCgender(cgender);
        domicile.setCdatetime(cdatetime);
        domicile.setCdegree(cdegree);
        domicile.setCcountry(ccountry);
        domicile.setCaddress(caddress);
        domicile.setCname(cname);
      int row=dao.insert(domicile);
        return row;
    }

    @Override
    public int update(String cgender, Date cdatetime, String cdegree, int ccountry, String caddress, String cname, long cid) {
        domicileDaoImpl dao = new domicileDaoImpl();
        domicile domicile = new domicile();
        domicile.setCid(cid);
        domicile.setCgender(cgender);
        domicile.setCdatetime(cdatetime);
        domicile.setCdegree(cdegree);
        domicile.setCcountry(ccountry);
        domicile.setCaddress(caddress);
        domicile.setCname(cname);
        int row=dao.update(domicile);
        return row;
    }

    @Override
    public int delete(long cid) {
        domicileDaoImpl dao = new domicileDaoImpl();
        int row=dao.deleteById(cid);
        return row;
    }

    @Override
    public List<domicile> findByName(String b) {
        domicileDaoImpl dao = new domicileDaoImpl();
        List<domicile> dl=dao.getmanyByMohu("cname",b);
        return dl;
    }

    @Override
    public List<domicile> findByAddress(String b) {
        domicileDaoImpl dao = new domicileDaoImpl();
        List<domicile> dl=dao.getmanyByMohu("caddress",b);
        return dl;
    }

    @Override
    public List<domicile> findByDate(String b) {
        domicileDaoImpl dao = new domicileDaoImpl();
        List<domicile> dl=dao.getmanyByMohu("cdatetime",b);
        return dl;
    }


    @Override
    public domicile findById(long cid) {
        domicileDaoImpl dao = new domicileDaoImpl();
        domicile d1=dao.getOneById(cid);
        return d1;
    }

    @Override
    public List<domicile> findByName(int country) {
        return Collections.emptyList();
    }
}
