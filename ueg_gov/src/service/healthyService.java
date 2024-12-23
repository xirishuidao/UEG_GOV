package service;

import entity.healthy;

import java.util.List;

public interface healthyService {
    //增加
    int insert(long cid,char Cgender,String Cblood,double height,double veight,int ccode,int Chandicapped,String Cdisease1,String Cdisease2);

    //修改
    int update(long cid,char Cgender,String Cblood,double height,double veight,int ccode,int Chandicapped,String Cdisease1,String Cdisease2);
    //删除

    int delete(long cid);
    //查询

    healthy getOnByCid(long cid);

    List<healthy> getAllByblood(String blood);

    List<healthy> getAllByCcode(int ccode);

    List<healthy> getAllByChandicapped(int chandicapped);

    List<healthy> getAllByCheight(double cheight);

    List<healthy> getAllByCveight(double cveight);

    //查单个

}
