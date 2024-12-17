package entity;

import util.DateBaseUtil;

import java.sql.Connection;
import java.util.ResourceBundle;

public class country {
    private String countryName;
    private int countryCode;
    public country(ResourceBundle rb) {
       String Language=rb.getString("Language");
        Connection cn=DateBaseUtil.getConnection();




        if(Language.equals("English")){
           // this.name=;

        }else if(Language.equals("中文")){

        }else if (Language.equals("Русский")){

        }else{

        }


    }

    public String getCountryName() {
        return countryName;
    }

    public int getCountryCode() {
        return countryCode;
    }
}
