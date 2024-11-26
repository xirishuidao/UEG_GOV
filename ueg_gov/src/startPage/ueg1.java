package startPage;




import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;

import java.awt.BorderLayout;
import javax.swing.*;

class uegVidio extends JFrame {
    public uegVidio() {
        this.setLayout(new BorderLayout());
        this.setSize(1000, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置关闭操作
        JPanel p1 = new JPanel();
        this.add(p1, BorderLayout.CENTER);
        p1.setVisible(true);
        //java没有内置视频软件，需要使用jmf，jlayer，vlcj等视频工具，这里使用vlc
        //最新的vlcj因为只能github下载，所以在此学习打包jar,本项目用4.8.0
        EmbeddedMediaPlayerComponent ueg=new EmbeddedMediaPlayerComponent();

        // 创建并初始化媒体播放器组件
        p1.add(ueg, BorderLayout.CENTER);

        // 在框架变得可见之后播放视频（虽然通常不是必需的，因为vlcj会在需要时初始化）
        // 但为了安全起见，我们可以将播放代码放在一个Runnable中，并通过SwingUtilities.invokeLater()来确保它在EDT中执行
        SwingUtilities.invokeLater(() -> {
            if (this.isVisible()) {
                ueg.mediaPlayer().media().play("../../../video/ueg_moss.mp4");
            } else {
                // 如果框架还不可见，则可以在框架变得可见时播放（例如，在一个WindowListener的windowOpened方法中）
                // 但在这个简单的例子中，我们只需要确保在调用setVisible(true)之后播放即可
                this.setVisible(true); // 这行其实可以省略，因为main方法中会再次调用
            }
        });


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
