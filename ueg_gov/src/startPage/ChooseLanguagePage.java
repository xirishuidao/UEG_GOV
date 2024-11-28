package startPage;

import util.LanguageUtil;

import javax.swing.*;
import java.io.File;
import java.util.ResourceBundle;

public class ChooseLanguagePage {


    ChooseLanguagePage() {
        JFrame jf = new JFrame();
        JPanel jp=new JPanel();
        jf.add(jp);
        jp.setLayout(null);
        JTextArea jtc=new JTextArea("请选择您的语言");
        jtc.setEditable(false);
        JTextArea jte=new JTextArea("Please Choose Your Language");
        jte.setEditable(false);
        JTextArea jtf=new JTextArea("Veuillez choisir votre langue");
        jtf.setEditable(false);
        JTextArea jtr=new JTextArea("Пожалуйста, выберите свой язык");
        jtr.setEditable(false);




        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setVisible(true);

        ResourceBundle rscl=ResourceBundle.getBundle(new File("util/dblogin.properties").toURI().toString());
        String language=rscl.getString("language");

    }

    public static void main(String[] args) {
        ChooseLanguagePage p=new ChooseLanguagePage();



    }


}
