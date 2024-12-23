package service.Impl;

import Dao.Impl.drivingDaoImpl;
import entity.driving;
import service.drivingService;

import java.sql.Date;
import java.util.Collections;
import java.util.List;

public class drivingServiceImpl implements drivingService {
    @Override
    public int insert(long did, String dtype, Date dtime, long cid, int daddress) {
        drivingDaoImpl dDI1 = new drivingDaoImpl();
        driving d=new driving(did,dtype,dtime, cid, daddress);
        int row=dDI1.insert(d);
        return row;
    }

    @Override
    public int deleteByDid(long did) {
        drivingDaoImpl dDI1 = new drivingDaoImpl();
        int row=dDI1.deleteByDid(did);
        return 0;
    }

    @Override
    public int deleteByCid(long cid) {
        drivingDaoImpl dDI1 = new drivingDaoImpl();
        int row=dDI1.deleteByCid(cid);
        return 0;
    }

    @Override
    public int update(long did, String dtype, Date dtime, long cid, int daddress) {
        drivingDaoImpl dDI1 = new drivingDaoImpl();
        driving d=new driving(did,dtype,dtime, cid, daddress);
        int row=dDI1.insert(d);
        return row;
    }

    @Override
    public driving getByDid(long did) {
        drivingDaoImpl dDI1 = new drivingDaoImpl();
        driving d1=dDI1.getOneById(did);
        return d1;
    }

    @Override
    public List<driving> getByDtype(String dtype) {
        drivingDaoImpl dDI1 = new drivingDaoImpl();
        List<driving> dlist1=dDI1.getPart3("dtype",dtype);
        return dlist1;
    }

    @Override
    public List<driving> getByCid(long cid) {
        drivingDaoImpl dDI1 = new drivingDaoImpl();
        List<driving> dlist1=dDI1.getPart1(cid);
        return dlist1;
    }

    @Override
    public List<driving> getByDtime(String dtime) {
        drivingDaoImpl dDI1 = new drivingDaoImpl();
        List<driving> dlist1=dDI1.getPart3("dtime",dtime);
        return dlist1;
    }

    @Override
    public List<driving> getByDaddress(int daddress) {
        drivingDaoImpl dDI1 = new drivingDaoImpl();
        List<driving> dlist1=dDI1.getPart1(daddress);
        return dlist1;
    }
}
