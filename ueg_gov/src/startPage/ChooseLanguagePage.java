package startPage;

import main.pages.BackgroundPanel;
import util.LanguageUtil;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.*;


public class ChooseLanguagePage extends JFrame {

      public String Language="nihao";


        public ChooseLanguagePage() {
            //jar 包调用规范 ，需要所有图片以及视频文件在main.resource 包下，并使用文件流输出
            InputStream imageStream = getClass().getResourceAsStream("/main/resource/ueg_gov_w.png");
            Image iconImage ;
            try {
                // 从输入流中读取图像
                iconImage = ImageIO.read(imageStream);
            } catch (IOException e) {
                iconImage = null; // 可以选择设置一个默认图标或不做任何操作
            }
            // 检查图像是否成功加载
            if (iconImage != null) {
                // 设置窗口图标
                setIconImage(iconImage);
            } else {
                //默认标识
            }

            setDefaultCloseOperation(3);
            setResizable(false);



            Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
            int screenWidth = (int) screensize.getWidth();//获得屏幕得宽
            int screenHeight = (int) screensize.getHeight();//获得屏幕得高

            setSize(new Dimension(1414,800));
            BackgroundPanel jp = new BackgroundPanel("/main/resource/Language_bg.png");
            this.add(jp, BorderLayout.CENTER);
            jp.setLayout(null);
            JLabel jtc = new JLabel("请选择您的语言");
            jtc.setSize(500, 100);
            jtc.setFont(new Font("HarmonyOS Sans SC", Font.PLAIN, 40));
            jtc.setForeground(Color.black);
            jtc.setLocation(580, 80);
            jp.add(jtc);
            JLabel jte = new JLabel("Please Choose Your Language");
            jte.setSize(500, 80);
            jte.setFont(new Font("HarmonyOS Sans SC", Font.PLAIN, 35));
            jte.setForeground(Color.black);
            jte.setLocation(480, 160);
            jp.add(jte);
            JLabel jtf = new JLabel("Veuillez choisir votre langue");
            jtf.setSize(500, 80);
            jtf.setFont(new Font("HarmonyOS Sans SC", Font.PLAIN, 35));
            jtf.setForeground(Color.black);
            jtf.setLocation(510, 240);
            jp.add(jtf);
            JLabel jtr = new JLabel("Пожалуйста, выберите свой язык");
            jtr.setSize(700, 80);
            jtr.setFont(new Font("HarmonyOS Sans SC", Font.PLAIN, 35));
            jtr.setForeground(Color.black);
            jtr.setLocation(445, 320);
            jp.add(jtr);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            JLabel acBottle=new JLabel("Created By 武轩 and 李天恒 | Copyright © 2025 MountOcean.All rights reserved.");
            acBottle.setFont(new Font("HarmonyOS Sans SC",Font.PLAIN,15));
            acBottle.setForeground(Color.black);
            acBottle.setSize(new Dimension(1200,50));
            acBottle.setLocation(new Point(480,700));
            jp.add(acBottle);


            String[] LanguageSt = {"中文", "English", "Русский", "Français"};
            //选择列表
            JList listl = new JList(LanguageSt);
            listl.setBorder(BorderFactory.createLineBorder(Color.gray, 3));
            listl.setVisibleRowCount(1);
            //需要设置list字体大小 需要设置一下的容器重写方法
            listl.setCellRenderer(new DefaultListCellRenderer() {
                @Override
                public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                    super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                    // 设置自定义字体大小
                    setFont(new Font("HarmonyOS Sans SC", Font.PLAIN, 23)); // 您可以根据需要调整字体名称、样式和大小
                    return this;
                }
            });

            listl.setVisible(true);
            listl.setSize(400, 140);
            listl.setLocation(520, 420);
            listl.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            jp.add(listl);


            // 居中窗口
            int windowWidth = getWidth();
            int windowHeight = getHeight();
            setLocation((screenWidth - windowWidth) / 2, (screenHeight - windowHeight) / 2);





            JButton lang_result = new JButton(
                    "选择|Choose|выбирать|choisir"
            );
            lang_result.setFont(new Font("HarmonyOS Sans SC", Font.PLAIN, 25));

            lang_result.setSize(520, 60);
            lang_result.setLocation(470, 600);
            lang_result.addActionListener(e -> {//lambda表达式

               // 使用这个类，properties需要遵循一定的命名规范，一般的命名规范是： 自定义名语言代码国别代码.properties
             //  ResourceBundle bundle = ResourceBundle.getBundle("res", new Locale("zh", "CN"));
                String languageChoose=listl.getSelectedValue().toString();
               if (languageChoose.equals("中文")) {
                    Language="zh";
                }else if (languageChoose.equals("Français")){
                   Language="fr";
                } else if (languageChoose.equals("Русский")) {
                    Language="ru";
                } else{
                    Language="en";
                }
                try {
                    setVisible(false);
                    LanguageUtil LU=new LanguageUtil(Language);
                    LoadingPage LP = new LoadingPage(LU.rb);
                } catch (UnsupportedEncodingException ex) {
                    throw new RuntimeException(ex);
                }


                //设置缓存文件太麻烦，所以每次用户还是早点配置吧
//                FileOutputStream oFile = null;
//                try {
//                    oFile = new FileOutputStream(getClass().getResourceAsStream("/util/DBLogin.properties").toString());
//                    //将Properties中的属性列表（键和元素对）写入输出流
//                    p.store(oFile, "");
//                } catch (IOException e2) {
//                    e2.printStackTrace();
//                } finally {
//                    try {
//                        oFile.close();
//                    } catch (IOException e3) {
//                        e3.printStackTrace();
//                    }
//                }
            });

            jp.add(lang_result);

            setVisible(true);
        }
        public static void main(String[] args) {

        ChooseLanguagePage cl=new ChooseLanguagePage();

        }

    }



