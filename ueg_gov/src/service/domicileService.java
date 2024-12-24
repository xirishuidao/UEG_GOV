package service;

import entity.domicile;

import java.sql.Date;
import java.util.List;

public interface domicileService {

    //增加
    int insert(long cid,String cgender, Date cdatetime, String cdegree, int ccountry, String caddress, String cname);

    //修改
    int update(String cgender, Date cdatetime, String cdegree, int ccountry, String caddress, String cname,long cid);


    //删除
    int delete(long cid);

    //查询

    List<domicile> findByName(String b);

    List<domicile> findByAddress(String b);

    //List<domicile> findByGender(String b);

    List<domicile> findByDate(String b);

    domicile findById(long cid);

    List<domicile> findByName(int country);

    //查单个
    String getcname(long cid);

    String getcaddress(long cid);

    int getccountry(long cid);

    String getcdegree(long cid);

    String getcgender(long cid);

    Date getcdatetime(long cid);






}
