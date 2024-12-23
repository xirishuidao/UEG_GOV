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
    driving getByDid(long did);

    List<driving> getByDtype(String dtype);

    List<driving> getByCid(long cid);

    List<driving> getByDtime(String dtime);

    List<driving> getByDaddress(int daddress);

    //查单个


}
