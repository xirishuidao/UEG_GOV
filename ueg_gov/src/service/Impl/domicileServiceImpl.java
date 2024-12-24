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
        cgender = cgender.equals("") ? getcgender(cid):cgender;
        cdatetime = cdatetime.equals("") ? getcdatetime(cid) : cdatetime;
        cdegree = cdegree.equals("") ? getcdegree(cid) : cdegree;
        ccountry = ccountry == 0 ? getccountry(cid) : ccountry;
        caddress = caddress.equals("") ? getcaddress(cid) : caddress;
        cname = cname.equals("") ? getcname(cid) : cname;

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
        row = row==1?0:-1;
        return row;
    }

    @Override
    public int update(String cgender, Date cdatetime, String cdegree, int ccountry, String caddress, String cname, long cid) {
        cgender = cgender.equals("") ? getcgender(cid):cgender;
        cdatetime = cdatetime.equals("") ? getcdatetime(cid) : cdatetime;
        cdegree = cdegree.equals("") ? getcdegree(cid) : cdegree;
        ccountry = ccountry == 0 ? getccountry(cid) : ccountry;
        caddress = caddress.equals("") ? getcaddress(cid) : caddress;
        cname = cname.equals("") ? getcname(cid) : cname;


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
        row = row==1?0:-1;
        return row;
    }

    @Override
    public int delete(long cid) {
        domicileDaoImpl dao = new domicileDaoImpl();
        int row=dao.deleteById(cid);
        row = row==1?0:-1;
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
        domicileDaoImpl dao = new domicileDaoImpl();
        List<domicile> dl1=dao.getmanyByCountry(country);
        return dl1;
    }

    @Override
    public String getcname(long cid) {
        domicileDaoImpl dao = new domicileDaoImpl();
        domicile d1=dao.getOneById(cid);
        return d1.getCname();
    }

    @Override
    public String getcaddress(long cid) {
        domicileDaoImpl dao = new domicileDaoImpl();
        domicile d1=dao.getOneById(cid);
        return d1.getCaddress();
    }

    @Override
    public int getccountry(long cid) {
        domicileDaoImpl dao = new domicileDaoImpl();
        domicile d1=dao.getOneById(cid);
        return d1.getCcountry();
    }

    @Override
    public String getcdegree(long cid) {
        domicileDaoImpl dao = new domicileDaoImpl();
        domicile d1=dao.getOneById(cid);
        return d1.getCdegree();
    }

    @Override
    public String getcgender(long cid) {
        domicileDaoImpl dao = new domicileDaoImpl();
        domicile d1=dao.getOneById(cid);
        return d1.getCgender();
    }

    @Override
    public Date getcdatetime(long cid) {
        domicileDaoImpl dao = new domicileDaoImpl();
        domicile d1=dao.getOneById(cid);
        return d1.getCdatetime();
    }
}
