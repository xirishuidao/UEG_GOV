package service.Impl;

import Dao.Impl.BaseDaoImpl;
import Dao.Impl.visaDaoImpl;
import entity.visa;
import service.visaService;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class visaServiceImpl implements visaService {
    @Override
    public List<visa> getState(int state) {
        visaDaoImpl impl = new visaDaoImpl();
        List<visa> visaList = impl.getPart2("vstate",state);
        return visaList;
    }

    @Override
    public visa getOnbyid(long vid) {
        visaDaoImpl impl = new visaDaoImpl();
        visa v1=impl.getOneById(vid);
        return v1;
    }

    @Override
    public List<visa> getId(long cid) {
        visaDaoImpl impl = new visaDaoImpl();
        List<visa> vl=impl.getPartc(cid);
        return vl;
    }

    @Override
    public List<visa> getCountry(int country) {
        visaDaoImpl impl = new visaDaoImpl();
        List<visa> vl=impl.getPart2("vname",country);
        return vl;
    }

    @Override
    public List<visa> getsdate(String date) {
        visaDaoImpl impl = new visaDaoImpl();
        List<visa> vl=impl.getPart1("vsdate",date);
        return vl;
    }

    @Override
    public List<visa> getedate(String date) {
        visaDaoImpl impl = new visaDaoImpl();
        List<visa> vl=impl.getPart1("vsdate",date);
        return vl;
    }

    @Override
    public int insert(long cid, long vid, int vname, Date vsdate, Date vedate, int vstate) {
        visaDaoImpl impl = new visaDaoImpl();
        visa v=new visa(cid,vid,vname, vsdate, vedate, vstate);
        int row=impl.insert(v);
        return row;
    }

    @Override
    public int deletec(long cid) {
        visaDaoImpl impl = new visaDaoImpl();
        int row=impl.deleteByCid(cid);
        return row;
    }

    @Override
    public int deletev(long vid) {
        visaDaoImpl impl = new visaDaoImpl();
        int row=impl.deleteByVid(vid);
        return row;
    }

    @Override
    public int update(long cid, long vid, int vname, Date vsdate, Date vedate, int vstate) {
        visaDaoImpl impl = new visaDaoImpl();
        visa v=new visa(cid,vid,vname, vsdate, vedate, vstate);
        int row=impl.update(v);
        return row;
    }

    @Override
    public boolean updatedata() {
        String sql="select * from visa";
        BaseDaoImpl impl=new BaseDaoImpl();
        List<Object []> lb=impl.getMany(sql);

        return false;
    }

}
