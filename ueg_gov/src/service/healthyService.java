package service;

import entity.healthy;

import java.util.List;

public interface healthyService {
    //增加
    int insert(long cid,String Cgender,String Cblood,double height,double veight,int ccode,int Chandicapped,String Cdisease1,String Cdisease2);

    //修改
    int update(long cid,String Cgender,String Cblood,double height,double veight,int ccode,int Chandicapped,String Cdisease1,String Cdisease2);
    //删除

    int delete(long cid);
    //查询

    healthy findOnByCid(long cid);


    //以后功能会上线------------------------------------------------------------------------
    List<healthy> findAllByblood(String blood);

    List<healthy> findAllByCcode(int ccode);

    List<healthy> findAllByChandicapped(int chandicapped);

    List<healthy> findAllByCheight(double cheight);

    List<healthy> findAllByCveight(double cveight);
    //-------------------------------------------------------------------------------------
    //查单个

    String getCboold(long cid);
    String getCdisease1(long cid);
    String getCdisease2(long cid);
    int getCcode(long cid);
    int getChandicapped(long cid);
    double getCheight(long cid);
    double getCveight(long cid);
    String getCgender(long cid);

}
