package main.pages;

import java.io.InputStream;
import java.util.Locale;
import java.util.ResourceBundle;

public class CheckFile {
    public static boolean run() {
        ResourceBundle r1=ResourceBundle.getBundle("util.DBLogin");
        if(r1==null){
            return false;
        }
        InputStream imageStream = CheckFile.class.getResourceAsStream("/main/resource/login_bg.png");
        if(imageStream==null){
            return false;
        }
        imageStream = CheckFile.class.getResourceAsStream("/main/resource/loading_bg.png");
        if(imageStream==null){
            return false;
        }





        return true;
    }

}
