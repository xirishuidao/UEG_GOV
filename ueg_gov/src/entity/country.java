package entity;

import Dao.BaseDao;
import Dao.Impl.BaseDaoImpl;
import util.DataBaseUtil;

import java.sql.Connection;
import java.util.ResourceBundle;

public class country {
    private String countryName;
    private int countryCode;
    public country() {
//       String Language=rb.getString("Language");



//
//        if(Language.equals("English")){
//           // this.name=;
//
//        }else if(Language.equals("中文")){
//
//        }else if (Language.equals("Русский")){
//
//        }else{
//
//        }


    }

    public String getCountryName(int countryCode) {
        Connection cn= DataBaseUtil.getConnection();
        BaseDaoImpl bd=new BaseDaoImpl();
        String sql="select 3code from country where num3 = ?";
        Object [] ob1=bd.getOne(sql,countryCode);
        String countryName=ob1[0].toString();
        System.out.println(countryName);
        return countryName;
    }

    public int getCountryCode(String countryName) {
        Connection cn= DataBaseUtil.getConnection();
        BaseDaoImpl bd=new BaseDaoImpl();
        String sql="select num3 from country where 3code = ?";
        Object [] ob1=bd.getOne(sql,countryName);
        int countryCode=((Number) ob1[0]).intValue();
        System.out.println(countryCode);
        return countryCode;
    }
}
