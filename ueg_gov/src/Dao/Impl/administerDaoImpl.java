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
    public administer getOneById(String aid) {
        String sql = "select * from administer where aid=?";
        administer [] administer1=(administer[]) getOne(sql,aid);
        return administer1[0];
    }


}
