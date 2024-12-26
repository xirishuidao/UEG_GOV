package Dao.Impl;

import Dao.citizenDao;
import entity.citizen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class citizenDaoImpl  extends BaseDaoImpl implements citizenDao {
    @Override
    public int insert(citizen p) {
        String sql = "insert into citizen values(?,?,?,?,?,?)";
        int row=executeUpdate(sql,p.getCid(),p.getCname(),p.getCpwd(),"","");
        return row;
    }

    @Override
    public int update(citizen p) {
        String sql="update citizen set cname=?,cpwd=? where cid=?";
        int row=executeUpdate(sql,p.getCname(),p.getCpwd(),p.getCid());
        return row;
    }

    @Override
    public int deleteById(long cid) {
        String sql="delete from citizen where cid=?";
        int row=executeUpdate(sql,cid);
        return row;
    }

    @Override
    public citizen getOneById(long cid) {
        String sql = "select * from citizen where cid=?";
        Object [] citizen1=getOne(sql, cid);
        citizen c1=new citizen();
        if(citizen1==null){
            return null;
        }else {
            for (int i = 0; i < citizen1.length; i++) {
                switch (i) {
                    case 0:
                        c1.setCid((long) citizen1[0]);
                        break;
                    case 1:
                        c1.setCname((String) citizen1[1]);
                        break;
                    case 2:
                        c1.setCpwd((String) citizen1[2]);
                        break;
                    case 3:
                        c1.setCquestion((String) citizen1[3]);
                        break;
                    case 4:
                        c1.setCanswer((String) citizen1[4]);
                        break;
                }
            }
            return c1;
        }
    }

    @Override
    public List<citizen> getPartByTiaojian(String Tiaojian) {
        String sql = "select * from citizen where cname=?";
    List<Object []> tiaojian1=getMany(sql,"%"+Tiaojian+"%");

    List<citizen> ctz1=new ArrayList<>();
       for(Object[] o:tiaojian1){
           citizen c1=new citizen();
           for(int i=0;i<o.length;i++){
               switch(i){
                   case 0:c1.setCid((long)o[0]);break;
                   case 1:c1.setCname((String)o[1]);break;
                   case 2:c1.setCpwd((String)o[2]);break;
                   case 3:c1.setCquestion((String)o[3]);break;
                   case 4:c1.setCanswer((String)o[4]);break;
               }
           }
           ctz1.add(c1);
       }
       return ctz1;
    }


}
