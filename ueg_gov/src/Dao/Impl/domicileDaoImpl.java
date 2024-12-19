package Dao.Impl;

import Dao.domicileDao;
import entity.domicile;

public class domicileDaoImpl extends BaseDaoImpl implements domicileDao {
    @Override
    public int insert(domicile p) {
        return 0;
    }

    @Override
    public int update(domicile p) {
        return 0;
    }

    @Override
    public int deleteById(String cid) {
        return 0;
    }

    @Override
    public domicile getOneById(String cid) {
        String sql = "select * from domicile where cid = ?";
        domicile[] d = (domicile[]) getOne(sql,cid);
        return d[0];
    }

}
