package Dao.Impl;

import Dao.healthyDao;
import entity.healthy;

import java.util.Collections;
import java.util.List;

public class healthyDaoImpl  extends BaseDaoImpl  implements healthyDao {
    @Override
    public int insert(healthy p) {
        String sql = "insert into healthy values(?,?,?,?,?,?,?,?,?)";
        int row=executeUpdate(sql,p.getCid(),p.getCgender(),p.getCblood(),p.getCheight(),p.getCveight(),p.getCcode(),p.getChandicapped(),p.getCdisease1(),p.getCdisease2());
        return row;
    }

    @Override
    public int update(healthy p) {
        String sql="update healthy set cgender=?,cblood=?,cheight=?,cveight=?,ccode=?,chandicapped=?,cdisease1=?,cdisease2=? where cid=? ";
        int row=executeUpdate(sql,p.getCgender(),p.getCblood(),p.getCheight(),p.getCveight(),p.getCcode(),p.getChandicapped(),p.getCdisease1(),p.getCdisease2(),p.getCid());
        return row;
    }

    @Override
    public int deleteById(long cid) {
       String sql = "delete from healthy where cid=?";
       int row=executeUpdate(sql,cid);
        return row;
    }

    @Override
    public healthy getOneById(long cid) {
        String sql = "select * from healthy where cid = ?";
        healthy healthy1=new healthy();
        Object [] ob1=getOne(sql,cid);
        for(int i=0;i<ob1.length;i++){
            switch (i){
                case 0:healthy1.setCid((Long)ob1[i]);break;
                case 1:healthy1.setCgender((char)ob1[i]);break;
                case 2:healthy1.setCblood((String)ob1[i]);break;
                case 3:healthy1.setCheight((Double)ob1[i]);break;
                case 4:healthy1.setCveight((Double)ob1[i]);break;
                case 5:healthy1.setCcode((int)ob1[i]);break;
                case 6:healthy1.setChandicapped((int)ob1[i]);break;
                case 7:healthy1.setCdisease1((String)ob1[i]);break;
                case 8:healthy1.setCdisease2((String)ob1[i]);break;
            }
        }
        return healthy1;
    }

    @Override
    public healthy getOneByMohu(String a, String b) {//暂时先不用
        return null;
    }

}
