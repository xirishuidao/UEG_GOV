package util;

import startPage.ChooseLanguagePage;

import java.util.ResourceBundle;

public class LanguageUtil {
   public static String PageTitle;
    public LanguageUtil(){

        ResourceBundle rbMain=ResourceBundle.getBundle("dblogin.properties");
        String choose=rbMain.getString("Language");
        if(choose=="English"){
            ResourceBundle rbEnglish=ResourceBundle.getBundle("English.properties");
            PageTitle=rbEnglish.getString("PageTitle");





        } else if (choose=="Russian") {
            ResourceBundle rbRussian=ResourceBundle.getBundle("Russian.properties");
            PageTitle=rbRussian.getString("PageTitle");





        } else if (choose=="France") {
            ResourceBundle rbFrance=ResourceBundle.getBundle("France.properties");
            PageTitle=rbFrance.getString("PageTitle");




        } else  if(choose=="Chinese"){
            ResourceBundle rbChinese=ResourceBundle.getBundle("Chinese.properties");
            PageTitle=rbChinese.getString("PageTitle");


        }else{
            // 创建一个类，可以直接调用这个类的main函数



        }
    }

    public static void main(String[] args) {

    }


}
