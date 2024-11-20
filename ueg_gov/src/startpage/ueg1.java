package startpage;




import  uk.co.caprica.vlcj.binding.support.runtime.RuntimeUtil;
import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;

import java.awt.BorderLayout;
import javax.swing.*;

class uegVidio extends JFrame {
    public uegVidio() {
        this.setLayout(new BorderLayout());
        this.setSize(1000, 500);
        JPanel p1 = new JPanel();
        this.add(p1, BorderLayout.CENTER);
        //java没有内置视频软件，需要使用jmf，jlayer，vlcj等视频工具，这里使用vlc
        //最新的vlcj因为只能github下载，所以在此学习打包jar,本项目用4.8.0
        EmbeddedMediaPlayerComponent ueg=new EmbeddedMediaPlayerComponent();
        ueg.mediaPlayer().media().play("ueg_gov/video/ueg_moss.mp4");
        p1.add(ueg);


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
