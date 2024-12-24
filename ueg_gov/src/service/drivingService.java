package service;

import entity.driving;

import java.sql.Date;
import java.util.List;

public interface drivingService {
    //增加

    int insert(long did, String dtype, Date dtime, long cid, int daddress);

    //删除

    int deleteByDid(long did);

    int deleteByCid(long cid);

    //修改

    int update(long did, String dtype, Date dtime, long cid, int daddress);

    //查询
    driving findByDid(long did);

    List<driving> findByDtype(String dtype);

    List<driving> findByCid(long cid);

    List<driving> findByDtime(String dtime);

    List<driving> findByDaddress(int daddress);

    //查单个

    String getDtype(long did);
    long getCid(long did);//这个表示修改驾驶器修改主人，可以不用
    Date getDtime(long did);
    int getDaddress(long did);



}
