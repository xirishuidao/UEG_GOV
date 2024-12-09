package main.page;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
//自定义带背景图片的JPanel
public class BackgroundPanel extends JPanel {

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
            // 可以选择设置一个默认图标或不做任何操作
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

