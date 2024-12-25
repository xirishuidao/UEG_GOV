package main.pages;

import javax.swing.*;

public class warningPage {
    public warningPage(String errMsg) {


    }
    public static void show(String errMsg,String errtitle){
        int n = JOptionPane.showConfirmDialog(null,errMsg,errtitle,JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE);
        if(n==JOptionPane.OK_OPTION){

        }


    }

    public static void main(String[] args) {
        show("ni","ni");
    }
}
