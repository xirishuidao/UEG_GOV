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
    List<visa> getState(int state);

    visa getOnbyid(long vid);

    List<visa> getId(long cid);

    List<visa> getCountry(int country);

    List<visa> getsdate(String date);

    List<visa> getedate(String date);

    //增加

    int insert(long cid,long vid,int vname,Date vsdate,Date vedate,int vstate);

    //删除
    int deletec(long cid);
    int deletev(long cid);

    //修改
    int update(long cid,long vid,int vname,Date vsdate,Date vedate,int vstate);

    boolean updatedata();

    //查单个

}
