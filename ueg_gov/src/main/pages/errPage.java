package main.pages;

import javax.swing.*;

public class errPage {
    public errPage(String errMsg) {


    }
    public static void show(String errMsg,String errtitle){
        int n = JOptionPane.showConfirmDialog(null,errMsg,errtitle,JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
       if(n==JOptionPane.OK_OPTION){
           System.exit(0);
       }


    }

    public static void main(String[] args) {
        show("ni","ni");
    }
}
