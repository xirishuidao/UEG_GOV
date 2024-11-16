package startpage;


import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

class uegVidio extends JFrame {
    public uegVidio() {
        this.setLayout(new BorderLayout());
        this.setSize(1000, 500);
        JPanel p1 = new JPanel();
        this.add(p1, BorderLayout.CENTER);
        //java没有内置视频软件，需要使用jmf，jlayer，vlc等视频工具，这里使用vlc
    }
}
public class ueg1 {
    public static void main(String[] args) {
        uegVidio frame = new uegVidio();
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }
}
