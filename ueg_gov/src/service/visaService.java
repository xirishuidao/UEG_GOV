package service;

import entity.visa;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public interface visaService {
    //查询状态
    /**
     * 注释状态意思
     * 0 作废
     * 1  已申请，未审批
     * 2 已审批，未通过
     * 3 已通过，未生效
     * 4 已生效，未过期
     * 5 过期
     */
    List<visa> findState(int state);

    visa findOnbyid(long vid);

    List<visa> findId(long cid);

    List<visa> findCountry(int country);

    List<visa> findsdate(String date);

    List<visa> findedate(String date);

    //增加

    int insert(long cid,long vid,int vname,Date vsdate,Date vedate,int vstate);

    //删除
    int deletec(long cid);
    int deletev(long cid);

    //修改
    int update(long cid,long vid,int vname,Date vsdate,Date vedate,int vstate);

    boolean updatedata();

    //查单个
    Date getVsdate(long vid);

    Date getVetate(long vid);

    long getCid(long vid);

    int getVname(long vid);

    int getVstate(long vid);


}
