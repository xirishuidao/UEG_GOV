package service;

import entity.domicile;

import java.sql.Date;

public interface domicileService {

    //增加
    void insert(long cid,String cgender, Date cdatetime, String cdegree, int ccountry, String caddress, String cname);

    //修改
    void update(String cgender, Date cdatetime, String cdegree, int ccountry, String caddress, String cname,long cid);


    //删除
    void delete(long cid);

    //查询







}
