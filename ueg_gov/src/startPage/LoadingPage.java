package startPage;

import main.page.BackgroundPanel;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.plaf.basic.BasicProgressBarUI;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ResourceBundle;


public class LoadingPage extends JFrame {
//加载检查所有相关配置，防止程序运行崩坏，大部分调用util
    public LoadingPage(ResourceBundle rb) throws UnsupportedEncodingException {

        setLayout(null);
        setSize(new Dimension(1060, 590));
        BackgroundPanel jp = new BackgroundPanel("/main/LoadingPage.jpg");
        jp.setLayout(null);
        jp.setPreferredSize(new Dimension(1060,590));

        InputStream imageStream = getClass().getResourceAsStream("/main/resource/ueg_gov.png");
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
            //默认标识
        }

      setTitle(rb.getString("PageTitle"));


        //创建一个最小值是0，最大值是100，当前值是20的进度条

        JLabel loading=new JLabel("正在加载");
        loading.setLocation(new Point(getWidth()/2,getHeight()/2));

        JProgressBar pgbar=new JProgressBar(0,100);
        pgbar.setValue(10);
        pgbar.setBorderPainted(true);
        pgbar.setStringPainted(true);
        pgbar.setIndeterminate(true);
        pgbar.setUI(new BasicProgressBarUI());


        jp.add(pgbar);



        setVisible(true);

    }

    public static void main(String[] args) throws UnsupportedEncodingException {

    }



}
