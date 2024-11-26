package startPage;


import javax.swing.*;
import java.awt.*;

class uegVidio extends JFrame {
    public uegVidio() {
        this.setLayout(new BorderLayout());
        this.setSize(1000, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置关闭操作
        JPanel p1 = new JPanel();
        this.add(p1, BorderLayout.CENTER);
        p1.setVisible(true);
        //swing不支持视频，需要使用javaFX的media






    }
}

public class ueg1 {
    private JPanel panel1;

    public static void main(String[] args) {
        uegVidio frame = new uegVidio();
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);

    }
}
