package startPage;


import util.LanguageUtil;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import java.util.List;
//自定义带背景图片的JPanel
class BackgroundPanel extends JPanel {

    private String imgPath; // 用于指定图片路径

    //添加一个构造函数，用于传入图片路径
    public BackgroundPanel(String imgPath) {
        this.imgPath = imgPath;
    }

    //重写paintComponent()方法，绘制图片
    @Override
    protected void paintComponent(Graphics g) {
        InputStream LIStream = getClass().getResourceAsStream(imgPath);
        Image LanguageImageBG = null;
        try {
            // 从输入流中读取图像
            LanguageImageBG = ImageIO.read(LIStream);
        } catch (IOException e) {
            LanguageImageBG=null; // 可以选择设置一个默认图标或不做任何操作
        }
        // 检查图像是否成功加载
        if (LanguageImageBG != null) {
            // 设置窗口图标
            g.drawImage(LanguageImageBG, 0, 0, this.getWidth(), this.getHeight(), this);
        } else {
            //默认标识
        }

    }
}

public class ChooseLanguagePage extends JFrame {


    private JButton button1;
    private JPanel panel1;

    public ChooseLanguagePage() {
        setSize(1060,590);

        BackgroundPanel jp=new BackgroundPanel("/main/resource/Language_bg.png");
        this.add(jp,BorderLayout.CENTER);
        jp.setLayout(null);
        JLabel jtc=new JLabel("请选择您的语言");
        jtc.setSize(250,50);
        jtc.setFont(new Font("HarmonyOS Sans SC", Font.PLAIN, 26));
        jtc.setForeground(Color.black);
        jtc.setLocation(420,80);
        jp.add(jtc);
        JLabel jte=new JLabel("Please Choose Your Language");
        jte.setSize(300,50);
        jte.setFont(new Font("HarmonyOS Sans SC",Font.PLAIN, 20));
        jte.setForeground(Color.black);
        jte.setLocation(370,130);
        jp.add(jte);
        JLabel jtf=new JLabel("Veuillez choisir votre langue");
        jtf.setSize(300,50);
        jtf.setFont(new Font("HarmonyOS Sans SC",Font.PLAIN, 20));
        jtf.setForeground(Color.black);
        jtf.setLocation(380,180);
        jp.add(jtf);
        JLabel jtr=new JLabel("Пожалуйста, выберите свой язык");
        jtr.setSize(400,50);
        jtr.setFont(new Font("HarmonyOS Sans SC",Font.PLAIN, 20));
        jtr.setForeground(Color.black);
        jtr.setLocation(345,230);
        jp.add(jtr);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //jar 包调用规范 ，需要所有图片以及视频文件在main.resource 包下，并使用文件流输出
        InputStream imageStream = getClass().getResourceAsStream("/main/resource/ueg_gov.png");
        Image iconImage = null;
        try {
            // 从输入流中读取图像
            iconImage = ImageIO.read(imageStream);
        } catch (IOException e) {
            iconImage=null; // 可以选择设置一个默认图标或不做任何操作
        }
        // 检查图像是否成功加载
        if (iconImage != null) {
            // 设置窗口图标
            setIconImage(iconImage);
        } else {
            //默认标识
        }

        String[] LanguageSt = { "中文", "English","Русский", "Français"};
        //选择列表
        JList listl=new JList(LanguageSt);
        listl.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
        listl.setVisibleRowCount(1);
        listl.setVisible(true);
        listl.setSize(300,80);
        listl.setLocation(370,330);
        listl.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jp.add(listl);
        setVisible(true);
        JButton lang_result=new JButton(
                "选择|Choose|выбирать|choisir"
        );

        lang_result.setSize(260,30);
        lang_result.setLocation(390,450);
        lang_result.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        jp.add(lang_result);


    }

    public static void main(String[] args) {
        ChooseLanguagePage p=new ChooseLanguagePage();
    }


}
