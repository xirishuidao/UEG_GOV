package service.Impl;

import Dao.Impl.BaseDaoImpl;
import Dao.Impl.visaDaoImpl;
import entity.visa;
import service.visaService;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class visaServiceImpl implements visaService {
    @Override
    public List<visa> findState(int state) {
        visaDaoImpl impl = new visaDaoImpl();
        List<visa> visaList = impl.getPart2("vstate",state);
        return visaList;
    }

    @Override
    public visa findOnbyid(long vid) {
        visaDaoImpl impl = new visaDaoImpl();
        visa v1=impl.getOneById(vid);
        return v1;
    }

    @Override
    public List<visa> findId(long cid) {
        visaDaoImpl impl = new visaDaoImpl();
        List<visa> vl=impl.getPartc(cid);
        return vl;
    }

    @Override
    public List<visa> findCountry(int country) {
        visaDaoImpl impl = new visaDaoImpl();
        List<visa> vl=impl.getPart2("vname",country);
        return vl;
    }

    @Override
    public List<visa> findsdate(String date) {
        visaDaoImpl impl = new visaDaoImpl();
        List<visa> vl=impl.getPart1("vsdate",date);
        return vl;
    }

    @Override
    public List<visa> findedate(String date) {
        visaDaoImpl impl = new visaDaoImpl();
        List<visa> vl=impl.getPart1("vedate",date);
        return vl;
    }

    @Override
    public int insert(long cid, long vid, int vname, String vsdate, String vedate, int vstate) {
        visaDaoImpl impl = new visaDaoImpl();
        visa v=new visa(cid,vid,vname, vsdate, vedate, vstate);
        int row=impl.insert(v);
        row = row==1?0:-1;
        return row;
    }

    @Override
    public int deletec(long cid) {
        visaDaoImpl impl = new visaDaoImpl();
        int row=impl.deleteByCid(cid);
        row = row>=0?0:-1;
        return row;
    }

    @Override
    public int deletev(long vid) {
        visaDaoImpl impl = new visaDaoImpl();
        int row=impl.deleteByVid(vid);
        row = row==1?0:-1;
        return row;
    }

    @Override
    public int update(long cid, long vid, int vname, String vsdate, String vedate, int vstate) {
        visaDaoImpl impl = new visaDaoImpl();
        visa v=new visa(cid,vid,vname, vsdate, vedate, vstate);
        int row=impl.update(v);
        row = row==1?0:-1;
        return row;
    }



    @Override
    public String getVsdate(long vid) {
        visaDaoImpl impl = new visaDaoImpl();
        visa v=impl.getOneById(vid);
        if(v==null) {
            return v.getVsdate();
        }
        return null;
    }

    @Override
    public String getVetate(long vid) {
        visaDaoImpl impl = new visaDaoImpl();
        visa v=impl.getOneById(vid);
        if(v==null) {
            return v.getVedate();
        }
        return null;
    }

    @Override
    public long getCid(long vid) {
        visaDaoImpl impl = new visaDaoImpl();
        visa v=impl.getOneById(vid);
        if(v==null) {
            return v.getCid();
        }
        return 0;
    }

    @Override
    public int getVname(long vid) {
        visaDaoImpl impl = new visaDaoImpl();
        visa v=impl.getOneById(vid);
        if(v==null) {
            return v.getVname();
        }
        return 0;
    }

    @Override
    public int getVstate(long vid) {
        visaDaoImpl impl = new visaDaoImpl();
        visa v=impl.getOneById(vid);
        if(v==null) {
            return v.getVstate();
        }
        return 0;
    }

    @Override
    public visa getStateOne() {
        visaDaoImpl impl = new visaDaoImpl();
        visa v=impl.getOneByState();
        if(v!=null) {
            return v;
        }
        return null;
    }





    /*
     * 注释状态意思
     * 0 作废
     * 1  已申请，未审批
     * 2 已审批，未通过
     * 3 已通过，未生效
     * 4 已生效，未过期
     * 5 过期
     */
    /**
     * 系统自动调用，判断所有签证是否应该更新状态
     * @return
     * true 用户可以正常执行
     * false 给出需要联系政府管理员处理的错误
     */

    @Override
    public boolean updatedata() {
        String sql="select * from visa";
        BaseDaoImpl impl=new BaseDaoImpl();
        List<Object []> lb=impl.getMany(sql);
        sql="update visa set vstate = ? where vid = ?";
        LocalDate a=LocalDate.now();
        for(int i=0;i<lb.size();i++){
            LocalDate b=LocalDate.parse(lb.get(i)[3].toString());
            LocalDate c=LocalDate.parse(lb.get(i)[4].toString());
            int s=(int)lb.get(i)[5];
            int row=0;
            if(b.isBefore(a)&&s==3){
                s=4;
            }
            if(c.isBefore(a)){
                deletev((Long)lb.get(i)[1]);
            }else {
                 row = impl.executeUpdate(sql, s, lb.get(i)[1]);
            }
            if(row>1){
                return false;
            }
        }
        return true;
    }

}
