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
        dtype = dtype.equals("")?getDtype(did):dtype;
        dtime = dtime.equals("")?getDtime(did):dtime;
        cid=cid==0?getCid(did):cid;
        daddress = daddress==0?getDaddress(did):daddress;
        drivingDaoImpl dDI1 = new drivingDaoImpl();
        driving d=new driving(did,dtype,dtime, cid, daddress);
        int row=dDI1.insert(d);
        row = row==1?0:-1;
        return row;
    }

    @Override
    public int deleteByDid(long did) {
        drivingDaoImpl dDI1 = new drivingDaoImpl();
        int row=dDI1.deleteByDid(did);
        row = row==1?0:-1;
        return row;
    }

    @Override
    public int deleteByCid(long cid) {
        drivingDaoImpl dDI1 = new drivingDaoImpl();
        int row=dDI1.deleteByCid(cid);
        row = row>=0?0:-1;
        return row;
    }

    @Override
    public int update(long did, String dtype, Date dtime, long cid, int daddress) {
        dtype = dtype.equals("")?getDtype(did):dtype;
        dtime = dtime.equals("")?getDtime(did):dtime;
        cid=cid==0?getCid(did):cid;
        daddress = daddress==0?getDaddress(did):daddress;
        drivingDaoImpl dDI1 = new drivingDaoImpl();
        driving d=new driving(did,dtype,dtime, cid, daddress);
        int row=dDI1.insert(d);
        row = row==1?0:-1;
        return row;
    }

    @Override
    public driving findByDid(long did) {
        drivingDaoImpl dDI1 = new drivingDaoImpl();
        driving d1=dDI1.getOneById(did);
        return d1;
    }

    @Override
    public List<driving> findByDtype(String dtype) {
        drivingDaoImpl dDI1 = new drivingDaoImpl();
        List<driving> dlist1=dDI1.getPart3("dtype",dtype);
        return dlist1;
    }

    @Override
    public List<driving> findByCid(long cid) {
        drivingDaoImpl dDI1 = new drivingDaoImpl();
        List<driving> dlist1=dDI1.getPart1(cid);
        return dlist1;
    }

    @Override
    public List<driving> findByDtime(String dtime) {
        drivingDaoImpl dDI1 = new drivingDaoImpl();
        List<driving> dlist1=dDI1.getPart3("dtime",dtime);
        return dlist1;
    }

    @Override
    public List<driving> findByDaddress(int daddress) {
        drivingDaoImpl dDI1 = new drivingDaoImpl();
        List<driving> dlist1=dDI1.getPart1(daddress);
        return dlist1;
    }

    @Override
    public String getDtype(long did) {
        drivingDaoImpl dDI1 = new drivingDaoImpl();
        driving d1=dDI1.getOneById(did);
        return d1.getDtype();
    }

    @Override
    public long getCid(long did) {
        drivingDaoImpl dDI1 = new drivingDaoImpl();
        driving d1=dDI1.getOneById(did);
        return d1.getCid();
    }

    @Override
    public Date getDtime(long did) {
        drivingDaoImpl dDI1 = new drivingDaoImpl();
        driving d1=dDI1.getOneById(did);
        return d1.getDtime();
    }

    @Override
    public int getDaddress(long did) {
        drivingDaoImpl dDI1 = new drivingDaoImpl();
        driving d1=dDI1.getOneById(did);
        return d1.getDaddress();
    }
}
