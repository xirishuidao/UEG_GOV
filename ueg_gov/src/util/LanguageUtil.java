package util;

import startPage.ChooseLanguagePage;

import java.util.Locale;
import java.util.ResourceBundle;

public class LanguageUtil {
    public ResourceBundle rb;
    public LanguageUtil(String Language){
           this.rb=ResourceBundle.getBundle("util.UEGLanguage",new Locale(Language));
    }
    public static void main(String[] args) {

    }
}
