package Dao.Impl;

import Dao.administerDao;
import entity.administer;

public class administerDaoImpl extends BaseDaoImpl implements administerDao {

    @Override
    public int update(administer p) {
        String sql = "update administer "
                + "set aname=?, apwd=?, aquestion=?,"
                + "aanswer=? where aid=?";
        int row=executeUpdate(sql,p.getAid(),p.getAname(),p.getApwd(),p.getAquestion(),p.getAanswer());
        return row;
    }



    @Override
    public administer getOneById(long aid) {
        String sql = "select * from administer where aid=?";
        administer administer=new administer();
        Object [] object1=getOne(sql,aid);
        if(object1==null){
            return null;
        }else {
            for(int i=0;i<object1.length;i++){
                switch (i) {
                    case 0:
                        administer.setAid((long) object1[i]);
                        break;
                    case 1:
                        administer.setAname((String) object1[i]);
                        break;
                    case 2:
                        administer.setApwd((String) object1[i]);
                        break;
                    case 3:
                        administer.setAquestion((String) object1[i]);
                        break;
                    case 4:
                        administer.setAanswer((String) object1[i]);
                        break;

                }

            }
            return administer;
        }
    }


}
