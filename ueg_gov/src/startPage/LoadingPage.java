package startPage;

import loginPage.LoginPage;
import main.pages.BackgroundPanel;
import main.pages.CheckFile;
import main.pages.errPage;
import util.DataBaseUtil;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;


public class LoadingPage extends JFrame {
    class Progress extends Thread {
        JProgressBar progressBar;
        JLabel loading;
        ResourceBundle rb;
        //进度条上的数字
        int[] progressValues={30,60,90,100};
        Progress(JProgressBar progressBar,JLabel loading,ResourceBundle rb)
        {
            this.progressBar=progressBar;
            this.loading=loading;
            this.rb=rb;
        }
        public void run()
        {
            for(int i=0;i<progressValues.length;i++)
            {
                try
                {
                    if(i==0){
                        loading.setText(rb.getString("SoftwareCheck"));
                        if(!CheckFile.run()){
                            loading.setText(rb.getString("SoftwareCheck"));
                            setVisible(false);
                            errPage.show(rb.getString("errorPageResource"),rb.getString("errorPageTitle"));
                            break;
                        }
                        Thread.sleep(3000);
                    }else if(i==1){
                        loading.setText(rb.getString("LanguageCheck"));
                        Thread.sleep(3000);
                    }else if(i==2){
                        loading.setText(rb.getString("DatabaseConnection"));
                        Thread.sleep(3000);
                        DataBaseUtil DBtest=new DataBaseUtil();
                        if(DataBaseUtil.getConnection()==null){
                            loading.setText("Connection is Error!");
                            setVisible(false);
                            errPage.show(rb.getString("errorPageNetwork"),rb.getString("errorPageTitle"));
                        }else{
                            loading.setText(rb.getString("finishCheck"));
                                //武轩页面
                                Thread.sleep(500);
                                setVisible(false);
                                LoginPage lp=new LoginPage(rb);

                        }
                    }
                }
                catch(InterruptedException e)
                {
                    setVisible(false);
                    errPage.show(rb.getString("errorPageResource"),rb.getString("errorPageTitle"));
                }
                //设置进度条的值
                progressBar.setValue(progressValues[i]);
            }
        }
    }

    //加载检查所有相关配置，防止程序运行崩坏，大部分调用util
    public LoadingPage(ResourceBundle rb) throws UnsupportedEncodingException {
        setDefaultCloseOperation(3);
        setResizable(false);
        InputStream imageStream = getClass().getResourceAsStream("/main/resource/ueg_gov_p.png");
        Image iconImage = null;
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
            setVisible(false);
            errPage.show(rb.getString("errorPageResource"),rb.getString("errorPageTitle"));
        }
        setTitle(rb.getString("PageTitle"));


        setSize(new Dimension(1414,800));
        BackgroundPanel jp = new BackgroundPanel("/main/resource/loading_bg.png");
        jp.setLayout(null);
        this.add(jp, BorderLayout.CENTER);

        // 居中窗口
        setLocationRelativeTo(null);

        JLabel acTitle=new JLabel(rb.getString("announcement"));
        acTitle.setFont(new Font("HarmonyOS Sans SC",Font.PLAIN,40));
        acTitle.setForeground(Color.white);
        acTitle.setSize(new Dimension(500,50));
        acTitle.setLocation(new Point(480,40));
        jp.add(acTitle);

        JTextArea acText=new JTextArea(rb.getString("ANText"));
        acText.setSize(new Dimension(1300,50));
        acText.setLocation(new Point(220,150));
        acText.setFont(new Font("HarmonyOS Sans SC",Font.PLAIN,35));
        acText.setForeground(Color.white);
        acText.setBackground(new Color(0,0,0,0));
        acText.setAutoscrolls(true);
        acText.setEditable(false);
        jp.add(acText);
        JLabel loading=new JLabel(rb.getString("ResourceIsLoading"));
        loading.setFont(new Font("HarmonyOS Sans SC",Font.PLAIN,40));
        loading.setForeground(Color.white);
        loading.setSize(new Dimension(500,50));
        loading.setLocation(new Point(480,450));
        jp.add(loading);
        JLabel acBottle=new JLabel(rb.getString("powerBy"));
        acBottle.setFont(new Font("HarmonyOS Sans SC",Font.PLAIN,15));
        acBottle.setForeground(Color.white);
        acBottle.setSize(new Dimension(1200,50));
        acBottle.setLocation(new Point(400,700));
        jp.add(acBottle);
        //创建一个最小值是0，最大值是100，当前值是20的进度条
        JProgressBar pgbar=new JProgressBar(0,100);
        pgbar.setValue(0);
        pgbar.setBorderPainted(true);
        pgbar.setSize(380,50);
        pgbar.setLocation(500,550);
        pgbar.setBorderPainted(true);
        pgbar.setForeground(new Color(102,204,255));
        pgbar.setBackground(Color.white);
        jp.add(pgbar);
        //下面要开启一个线程来处理进度
        Progress progress=new Progress(pgbar,loading,rb);
        progress.start();


        setVisible(true);

    }

    public static void main(String[] args) throws UnsupportedEncodingException {

    ResourceBundle rb=ResourceBundle.getBundle("util.UEGLanguage",new Locale("en"));
    LoadingPage a= new LoadingPage(rb);
    }



}
