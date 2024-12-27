package Dao.Impl;

import Dao.drivingDao;
import entity.driving;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class drivingDaoImpl  extends BaseDaoImpl  implements drivingDao {
   //5

    @Override
    public int insert(driving p) {
        String sql="insert into driving values(?,?,?,?,?)";
        int row=executeUpdate(sql,p.getDid(),p.getDtype(),Date.valueOf(p.getDtime()),p.getCid(),p.getDaddress());
        return row;
    }

    @Override
    public int update(driving p) {
        String sql="update driving set dtype=?,dtime=?,cid=?,daddress=? where did=?";
        int row=executeUpdate(sql,p.getDtype(), Date.valueOf(p.getDtime()),p.getCid(),p.getDaddress(),p.getDid());
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
        Object [] ob1= getOne(sql,did);
        if(ob1==null){
            return null;
        }else {
            for (int i = 0; i < ob1.length; i++) {
                switch (i) {
                    case 0:
                        driving1.setDid((Long) ob1[i]);
                        break;
                    case 1:
                        driving1.setDtype((String) ob1[i]);
                        break;
                    case 2:
                        driving1.setDtime(ob1[i].toString());
                        break;
                    case 3:
                        driving1.setCid((Long) ob1[i]);
                        break;
                    case 4:
                        driving1.setDaddress((int) ob1[i]);
                        break;
                }
            }
            return driving1;
        }
    }

    @Override
    public List<driving> getPart1(long cid) {
        String sql = "select * from driving where cid = ?";
        List<driving> drivingList;
        List<Object []> obList= getMany(sql,cid);
        drivingList= new ArrayList<>();
        for(Object[] ob1:obList){
            driving driving1=new driving();
            for(int i=0;i<ob1.length;i++){
                switch(i){
                    case 0:driving1.setDid((Long)ob1[i]);break;
                    case 1:driving1.setDtype((String)ob1[i]);break;
                    case 2:driving1.setDtime(ob1[i].toString());break;
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
        List<driving> drivingList;
        List<Object []> obList= getMany(sql,daddress);
        drivingList= new ArrayList<>();
        for(Object[] ob1:obList){
            driving driving1=new driving();
            for(int i=0;i<ob1.length;i++){
                switch(i){
                    case 0:driving1.setDid((Long)ob1[i]);break;
                    case 1:driving1.setDtype((String)ob1[i]);break;
                    case 2:driving1.setDtime(ob1[i].toString());break;
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
        String sql = "select * from driving ";
        if(a=="dtime"){
             sql = "select * from driving where dtime like ?";
        }else if(a=="dtype"){
             sql = "select * from driving where dtype like ?";
        }

        List<driving> drivingList;

        List<Object []> obList= getMany(sql,'%'+b+'%');
        drivingList= new ArrayList<>();
        for(Object[] ob1:obList){
            driving driving1=new driving();
            for(int i=0;i<ob1.length;i++){
                switch(i){
                    case 0:driving1.setDid((Long)ob1[i]);break;
                    case 1:driving1.setDtype((String)ob1[i]);break;
                    case 2:driving1.setDtime( ob1[i].toString());break;
                    case 3:driving1.setCid((Long)ob1[i]);break;
                    case 4:driving1.setDaddress((int)ob1[i]);break;
                }
            }
            drivingList.add(driving1);
        }
        return drivingList;
    }

}
