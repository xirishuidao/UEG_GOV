package Dao.Impl;

import Dao.drivingDao;
import entity.driving;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class drivingDaoImpl  extends BaseDaoImpl  implements drivingDao {
    @Override
    public int insert(driving p) {
        String sql="insert into driving values(?,?,?,?,?)";
        int row=executeUpdate(sql,p.getDid(),p.getDtype(),p.getDtime(),p.getCid(),p.getDaddress());
        return row;
    }

    @Override
    public int update(driving p) {
        String sql="update domicile set did=?,dtype=?,dtime=?,cid=?,daddress=? where did=?";
        int row=executeUpdate(sql,p.getDid(),p.getDtype(),p.getDtime(),p.getCid(),p.getDaddress(),p.getDid());
        return row;
    }

    @Override
    public int deleteByDid(long did) {
        String sql="delete from driving where did=?";
        int row=executeUpdate(sql,did);
        return row;
    }

    @Override
    public int deleteByCid(long did) {
        String sql="delete from driving where cid=?";
        int row=executeUpdate(sql,did);
        return row;
    }

    @Override
    public driving getOneById(long did) {
        String sql = "select * from driving where did = ?";
        driving driving1=new driving();
        Object [] ob1=(Object[]) getOne(sql,did);
        for(int i=0;i<ob1.length;i++){
            switch(i){
                case 0:driving1.setDid((Long)ob1[i]);break;
                case 1:driving1.setDtype((String)ob1[i]);break;
                case 2:driving1.setDtime((Date) ob1[i]);break;
                case 3:driving1.setCid((Long)ob1[i]);break;
                case 4:driving1.setDaddress((int)ob1[i]);break;
            }
        }
        return driving1;
    }

    @Override
    public List<driving> getPart1(long cid) {
        String sql = "select * from driving where cid = ?";
        List<driving> drivingList=null;
        driving driving1=new driving();
        List<Object []> obList=(List<Object []>)getMany(sql,cid);
        drivingList=new ArrayList<driving>();
        for(Object[] ob1:obList){
            for(int i=0;i<ob1.length;i++){
                switch(i){
                    case 0:driving1.setDid((Long)ob1[i]);break;
                    case 1:driving1.setDtype((String)ob1[i]);break;
                    case 2:driving1.setDtime((Date) ob1[i]);break;
                    case 3:driving1.setCid((Long)ob1[i]);break;
                    case 4:driving1.setDaddress((int)ob1[i]);break;
                }
            }
            drivingList.add(driving1);
        }
        return drivingList;
    }

    @Override
    public List<driving> getPart2(int daddress){
        String sql = "select * from driving where daddress = ?";
        List<driving> drivingList=null;
        driving driving1=new driving();
        List<Object []> obList=(List<Object []>)getMany(sql,daddress);
        drivingList=new ArrayList<driving>();
        for(Object[] ob1:obList){
            for(int i=0;i<ob1.length;i++){
                switch(i){
                    case 0:driving1.setDid((Long)ob1[i]);break;
                    case 1:driving1.setDtype((String)ob1[i]);break;
                    case 2:driving1.setDtime((Date) ob1[i]);break;
                    case 3:driving1.setCid((Long)ob1[i]);break;
                    case 4:driving1.setDaddress((int)ob1[i]);break;
                }
            }
            drivingList.add(driving1);
        }
        return drivingList;
    }

    @Override
    public List<driving> getPart3(String a,String b) {
        String sql = "select * from driving where ? like ?";
        List<driving> drivingList=null;
        driving driving1=null;
        List<Object []> obList=(List<Object []>)getMany(sql,a,"%"+b+"%");
        drivingList=new ArrayList<driving>();
        for(Object[] ob1:obList){
            for(int i=0;i<ob1.length;i++){
                switch(i){
                    case 0:driving1.setDid((Long)ob1[i]);break;
                    case 1:driving1.setDtype((String)ob1[i]);break;
                    case 2:driving1.setDtime((Date) ob1[i]);break;
                    case 3:driving1.setCid((Long)ob1[i]);break;
                    case 4:driving1.setDaddress((int)ob1[i]);break;
                }
            }
            drivingList.add(driving1);
        }
        return drivingList;
    }

}
