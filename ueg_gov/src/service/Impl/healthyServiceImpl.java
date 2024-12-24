package service.Impl;

import Dao.Impl.healthyDaoImpl;
import entity.healthy;
import service.healthyService;

import java.util.Collections;
import java.util.List;

public class healthyServiceImpl implements healthyService {
    @Override
    public int insert(long cid, String Cgender, String Cblood, double height, double veight, int ccode, int Chandicapped, String Cdisease1, String Cdisease2) {
        Cgender = Cgender.equals("")?getCgender(cid):Cgender;
        Cblood=Cblood.equals("")?getCboold(cid):Cblood;
        height=height==0.0?getCheight(cid):height;
        veight=veight==0.0?getCheight(cid):veight;
        ccode=ccode==0?getCcode(cid):ccode;
        Chandicapped=Chandicapped==0?getChandicapped(cid):Chandicapped;

        healthyDaoImpl hdi1 = new healthyDaoImpl();
        healthy h1 = new healthy();
        h1.setCid(cid);
        h1.setCgender(Cgender);
        h1.setCblood(Cblood);
        h1.setCheight(height);
        h1.setCveight(veight);
        h1.setCcode(ccode);
        h1.setChandicapped(Chandicapped);
        h1.setCdisease1(Cdisease1);
        h1.setCdisease2(Cdisease2);
        int row=hdi1.insert(h1);
        row = row==1?0:-1;
        return row;
    }

    @Override
    public int update(long cid, String Cgender, String Cblood, double height, double veight, int ccode, int Chandicapped, String Cdisease1, String Cdisease2) {
        Cgender = Cgender.equals("")?getCgender(cid):Cgender;
        Cblood=Cblood.equals("")?getCboold(cid):Cblood;
        height=height==0.0?getCheight(cid):height;
        veight=veight==0.0?getCheight(cid):veight;
        ccode=ccode==0?getCcode(cid):ccode;
        Chandicapped=Chandicapped==0?getChandicapped(cid):Chandicapped;

        healthyDaoImpl hdi1 = new healthyDaoImpl();
        healthy h1 = new healthy();
        h1.setCid(cid);
        h1.setCgender(Cgender);
        h1.setCblood(Cblood);
        h1.setCheight(height);
        h1.setCveight(veight);
        h1.setCcode(ccode);
        h1.setChandicapped(Chandicapped);
        h1.setCdisease1(Cdisease1);
        h1.setCdisease2(Cdisease2);
        int row=hdi1.update(h1);
        row = row==1?0:-1;
        return row;
    }

    @Override
    public int delete(long cid) {
        healthyDaoImpl hdi1 = new healthyDaoImpl();
       int row=hdi1.deleteById(cid);
        row = row==1?0:-1;
        return row;
    }

    @Override
    public healthy findOnByCid(long cid) {
        healthyDaoImpl hdi1 = new healthyDaoImpl();
        healthy h1 =hdi1.getOneById(cid);
        return h1;
    }

    @Override
    public List<healthy> findAllByblood(String blood) {
        healthyDaoImpl hdi1 = new healthyDaoImpl();
        List<healthy> hlist1 =hdi1.getOneByMohu("cblood",blood);
        return hlist1;
    }

    @Override
    public List<healthy> findAllByCcode(int ccode) {
        healthyDaoImpl hdi1 = new healthyDaoImpl();
        List<healthy> hlist1 =hdi1.getOneByMohu("cblood",ccode);
        return hlist1;
    }

    @Override
    public List<healthy> findAllByChandicapped(int chandicapped) {
        healthyDaoImpl hdi1 = new healthyDaoImpl();
        List<healthy> hlist1 =hdi1.getOneByMohu("chandicapped",chandicapped);
        return hlist1;
    }
    //暂议------------------------------------------------------------------
    @Override
    public List<healthy> findAllByCheight(double cheight) {
        return Collections.emptyList();
    }

    @Override
    public List<healthy> findAllByCveight(double cveight) {
        return Collections.emptyList();
    }
    //--------------------------------------------------------------------

    @Override
    public String getCboold(long cid) {
        healthyDaoImpl hdi1 = new healthyDaoImpl();
        healthy h1 =hdi1.getOneById(cid);
        return h1.getCblood();
    }

    @Override
    public String getCdisease1(long cid) {
        healthyDaoImpl hdi1 = new healthyDaoImpl();
        healthy h1 =hdi1.getOneById(cid);
        return h1.getCdisease1();
    }

    @Override
    public String getCdisease2(long cid) {
        healthyDaoImpl hdi1 = new healthyDaoImpl();
        healthy h1 =hdi1.getOneById(cid);
        return h1.getCdisease2();
    }

    @Override
    public int getCcode(long cid) {
        healthyDaoImpl hdi1 = new healthyDaoImpl();
        healthy h1 =hdi1.getOneById(cid);
        return h1.getCcode();
    }

    @Override
    public int getChandicapped(long cid) {
        healthyDaoImpl hdi1 = new healthyDaoImpl();
        healthy h1 =hdi1.getOneById(cid);
        return h1.getChandicapped();
    }

    @Override
    public double getCheight(long cid) {
        healthyDaoImpl hdi1 = new healthyDaoImpl();
        healthy h1 =hdi1.getOneById(cid);
        return h1.getCheight();
    }

    @Override
    public double getCveight(long cid) {
        healthyDaoImpl hdi1 = new healthyDaoImpl();
        healthy h1 =hdi1.getOneById(cid);
        return h1.getCveight();
    }

    @Override
    public String getCgender(long cid) {
        healthyDaoImpl hdi1 = new healthyDaoImpl();
        healthy h1 =hdi1.getOneById(cid);
        return h1.getCgender();
    }


}
