package Dao.Impl;

import Dao.visaDao;
import entity.visa;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class visaDaoImpl  extends BaseDaoImpl  implements visaDao {
   //6

    @Override
    public int insert(visa p) {
        String sql="insert into visa values(?,?,?,?,?,?)";
        int row=executeUpdate(sql,p.getCid(),p.getVid(),p.getVname(),Date.valueOf(p.getVsdate()),Date.valueOf(p.getVedate()),p.getVstate());
        return row;
    }

    @Override
    public int update(visa p) {
        String sql="update visa set cid=?,vname=?,vsdate=?,vedate=?,vstate=? where vid=?";
        int row=executeUpdate(sql,p.getCid(),p.getVname(),Date.valueOf(p.getVsdate()),Date.valueOf(p.getVedate()),p.getVstate(),p.getVid());
        return row;
    }

    @Override
    public int deleteByCid(long cid) {
        String sql="delete from visa where cid=?";
        int row=executeUpdate(sql,cid);
        return row;
    }

    @Override
    public int deleteByVid(long vid) {
        String sql="delete from visa where vid=?";
        int row=executeUpdate(sql,vid);
        return row;
    }

    @Override
    public visa getOneById(long vid) {
        String sql="select * from visa where vid=?";
        visa v1=new visa();
        Object [] ob1=getOne(sql,vid);
        if(ob1==null){
            return null;
        }
        else {
            for (int i = 0; i < ob1.length; i++) {
                switch (i) {
                    case 0:
                        v1.setCid((Long) ob1[i]);
                        break;
                    case 1:
                        v1.setVid((Long) ob1[i]);
                        break;
                    case 2:
                        v1.setVname((int) ob1[i]);
                        break;
                    case 3:
                        v1.setVsdate(ob1[i].toString());
                        break;
                    case 4:
                        v1.setVedate(ob1[i].toString());
                        break;
                    case 5:
                        v1.setVstate((int) ob1[i]);
                        break;
                }

            }
            return v1;
        }

    }

    @Override
    public List<visa> getPartc(long cid) {
        String sql="select * from visa where cid=?";
        List<visa> visaList=new ArrayList<>();
        List<Object []> objList=getMany(sql,cid);
        for(Object[] ob1:objList){
            visa v1=new visa();
            for(int i=0;i<ob1.length;i++){
                switch(i){
                    case 0:v1.setCid((Long)ob1[i]);break;
                    case 1:v1.setVid((Long)ob1[i]);break;
                    case 2:v1.setVname((int)ob1[i]);break;
                    case 3:v1.setVsdate(ob1[i].toString());break;
                    case 4:v1.setVedate(ob1[i].toString());break;
                    case 5:v1.setVstate((int)ob1[i]);break;
                }
            }
            visaList.add(v1);
        }
        return visaList;
    }

    @Override
    public List<visa> getPart2(String a, int b) {
    String sql="select * from visa where cid=? ";
        List<visa> visaList=new ArrayList<>();
        if(a.equals("vstate")){
             sql="select * from visa where vstate=?";
        } else if (a.equals("vname")) {
            sql="select * from visa where vname=?";
        }
        List<Object []> objList=getMany(sql,b);
        for(Object[] ob1:objList){
            visa v1=new visa();
            for(int i=0;i<ob1.length;i++){
                switch(i){
                    case 0:v1.setCid((Long)ob1[i]);break;
                    case 1:v1.setVid((Long)ob1[i]);break;
                    case 2:v1.setVname((int)ob1[i]);break;
                    case 3:v1.setVsdate(ob1[i].toString());break;
                    case 4:v1.setVedate(ob1[i].toString());break;
                    case 5:v1.setVstate((int)ob1[i]);break;
                }
            }
            visaList.add(v1);
        }
        return visaList;
    }

    @Override
    public List<visa> getPart1(String a, String b) {
        String sql="select * from visa where cid like ?";
        List<visa> visaList=new ArrayList<>();
        if(a.equals("vsdate")){
            sql="select * from visa where vsdate like ?";
        }else if(a.equals("vedate")){
            sql="select * from visa where vedate like ?";
        }
        List<Object []> objList=getMany(sql,"%"+b+"%");
        for(Object[] ob1:objList){
            visa v1=new visa();
            for(int i=0;i<ob1.length;i++){
                switch(i){
                    case 0:v1.setCid((Long)ob1[i]);break;
                    case 1:v1.setVid((Long)ob1[i]);break;
                    case 2:v1.setVname((int)ob1[i]);break;
                    case 3:v1.setVsdate(ob1[i].toString());break;
                    case 4:v1.setVedate(ob1[i].toString());break;
                    case 5:v1.setVstate((int)ob1[i]);break;
                }
            }
            visaList.add(v1);
        }
        return visaList;
    }

    @Override
    public visa getOneByState() {
        String sql="select * from visa where vstate=1 LIMIT 1";
        visa v1=new visa();
        Object [] ob1=getOne(sql);
        for(int i=0;i<ob1.length;i++){
            switch(i){
                case 0:v1.setCid((Long)ob1[i]);break;
                case 1:v1.setVid((Long)ob1[i]);break;
                case 2:v1.setVname((int)ob1[i]);break;
                case 3:v1.setVsdate(ob1[i].toString());break;
                case 4:v1.setVedate(ob1[i].toString());break;
                case 5:v1.setVstate((int)ob1[i]);break;
            }
        }
        return v1;

    }


}
