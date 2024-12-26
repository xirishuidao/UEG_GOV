package Dao.Impl;

import Dao.domicileDao;
import entity.domicile;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class domicileDaoImpl extends BaseDaoImpl implements domicileDao {

 //7

    @Override
    public int insert(domicile p) {
        String sql = "insert into domicile values(?,?,?,?,?,?,?)";
        int row=executeUpdate(sql,p.getCid(),p.getCname(),p.getCdegree(),p.getCaddress(),p.getCcountry(),p.getCdegree(), Date.valueOf(p.getCdatetime()));
        return row;
    }

    @Override
    public int update(domicile p) {
        String sql= "update domicile set cgender=?,cname=?,cdegree=?,caddress=?,ccountry=?,cdatetime=? where cid=?";
        int row=executeUpdate(sql,p.getCgender(),p.getCname(),p.getCdegree(),p.getCaddress(),p.getCcountry(), Date.valueOf(p.getCdatetime()),p.getCid());
        return row;
    }

    @Override
    public int deleteById(long cid) {
        String sql = "delete from domicile where cid=?";
        int row=executeUpdate(sql,cid);
        return row;
    }

    @Override
    public domicile getOneById(long cid) {
        String sql="select * from domicile where cid=?";
        domicile domicile1=new domicile();
        Object [] ob1=getOne(sql,cid);
        if(ob1==null){
            return null;
        }else {
            for (int i = 0; i < ob1.length; i++) {
                switch (i) {
                    case 0:
                        domicile1.setCid((long) ob1[0]);
                        break;
                    case 1:
                        domicile1.setCname((String) ob1[1]);
                        break;
                    case 2:
                        domicile1.setCgender((String) ob1[2]);
                        break;
                    case 3:
                        domicile1.setCaddress((String) ob1[3]);
                        break;
                    case 4:
                        domicile1.setCcountry((int) ob1[4]);
                        break;
                    case 5:
                        domicile1.setCdegree((String) ob1[5]);
                        break;
                    case 6:
                        domicile1.setCdatetime(ob1[5].toString());
                        break;
                }
            }
            return domicile1;
        }
    }

    @Override
    public List<domicile> getmanyByMohu(String type, String context) {
        String sql="select * from domicile where ? like ?";

        List<domicile> domicileList1=new ArrayList<domicile>();
        List<Object []> ob1=getMany(sql,type,"%"+context+"%");
        for(Object [] o:ob1){
            domicile domicile1=new domicile();
            for(int i=0;i<o.length;i++){
                switch(i){
                    case 0:domicile1.setCid((long)o[0]);break;
                    case 1:domicile1.setCname((String)o[1]);break;
                    case 2:domicile1.setCgender((String)o[2]);break;
                    case 3:domicile1.setCaddress((String)o[3]);break;
                    case 4:domicile1.setCcountry((int)o[4]);break;
                    case 5:domicile1.setCdegree((String)o[5]);break;
                    case 6:domicile1.setCdatetime(o[5].toString());break;
                }
            }
            domicileList1.add(domicile1);
        }
        return domicileList1;
    }

    @Override
    public List<domicile> getmanyByCountry(int country) {
        String sql="select * from domicile where ccountry = ?";

        List<domicile> domicileList1=new ArrayList<domicile>();
        List<Object []> ob1=getMany(sql,country);
        for(Object [] o:ob1){
            domicile domicile1=new domicile();
            for(int i=0;i<o.length;i++){
                switch(i){
                    case 0:domicile1.setCid((long)o[0]);break;
                    case 1:domicile1.setCname((String)o[1]);break;
                    case 2:domicile1.setCgender((String)o[2]);break;
                    case 3:domicile1.setCaddress((String)o[3]);break;
                    case 4:domicile1.setCcountry((int)o[4]);break;
                    case 5:domicile1.setCdegree((String)o[5]);break;
                    case 6:domicile1.setCdatetime(o[5].toString());break;
                }
            }
            domicileList1.add(domicile1);
        }
        return domicileList1;
    }


}
