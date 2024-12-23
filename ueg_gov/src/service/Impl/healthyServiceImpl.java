package service.Impl;

import Dao.Impl.healthyDaoImpl;
import entity.healthy;
import service.healthyService;

import java.util.Collections;
import java.util.List;

public class healthyServiceImpl implements healthyService {
    @Override
    public int insert(long cid, char Cgender, String Cblood, double height, double veight, int ccode, int Chandicapped, String Cdisease1, String Cdisease2) {
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
        return row;
    }

    @Override
    public int update(long cid, char Cgender, String Cblood, double height, double veight, int ccode, int Chandicapped, String Cdisease1, String Cdisease2) {
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
        return row;
    }

    @Override
    public int delete(long cid) {
        healthyDaoImpl hdi1 = new healthyDaoImpl();
       int row=hdi1.deleteById(cid);
        return row;
    }

    @Override
    public healthy getOnByCid(long cid) {
        healthyDaoImpl hdi1 = new healthyDaoImpl();
        healthy h1 =hdi1.getOneById(cid);
        return h1;
    }

    @Override
    public List<healthy> getAllByblood(String blood) {
        healthyDaoImpl hdi1 = new healthyDaoImpl();
        List<healthy> hlist1 =hdi1.getOneByMohu("cblood",blood);
        return hlist1;
    }

    @Override
    public List<healthy> getAllByCcode(int ccode) {
        healthyDaoImpl hdi1 = new healthyDaoImpl();
        List<healthy> hlist1 =hdi1.getOneByMohu("cblood",ccode);
        return hlist1;
    }

    @Override
    public List<healthy> getAllByChandicapped(int chandicapped) {
        healthyDaoImpl hdi1 = new healthyDaoImpl();
        List<healthy> hlist1 =hdi1.getOneByMohu("chandicapped",chandicapped);
        return hlist1;
    }
    //暂议
    @Override
    public List<healthy> getAllByCheight(double cheight) {
        return Collections.emptyList();
    }

    @Override
    public List<healthy> getAllByCveight(double cveight) {
        return Collections.emptyList();
    }


}
