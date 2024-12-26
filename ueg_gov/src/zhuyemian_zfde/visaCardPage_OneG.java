package zhuyemian_zfde;

import main.pages.warningPage;
import service.Impl.visaServiceImpl;
import util.cidBaseUtil;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.ResourceBundle;

public class visaCardPage_OneG extends JFrame {


    public visaCardPage_OneG(ResourceBundle rs) {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel);
        setTitle(rs.getString("PageTitle"));

        setLayout(null);
        setSize(new Dimension(1000, 600));
        setBackground(Color.white);
        panel.setBounds(0,0,1000,600);

        // 加载图片并创建JLabel显示图片
        InputStream imageStream1 = getClass().getResourceAsStream("/main/resource/ueg_gov_p.png");
        Image titleImage;
        try {
            // 从输入流中读取图像
            titleImage = ImageIO.read(imageStream1);

        } catch (IOException e) {
            titleImage = null;
        }
        // 检查图像是否成功加载
        if (titleImage != null) {
            // 设置窗口图标
            setIconImage(titleImage);
        }

        panel.setBackground(Color.white);







        JLabel kuaquyuxukezhengxinxi = new JLabel(rs.getString("listVisaPageR1"));
        kuaquyuxukezhengxinxi.setForeground(Color.BLACK);
        kuaquyuxukezhengxinxi.setFont(new Font("微软雅黑", Font.BOLD+Font.ITALIC, 34));
        kuaquyuxukezhengxinxi.setBounds(460, 10, 360, 70);
        panel.add(kuaquyuxukezhengxinxi);

        JLabel di = new JLabel(rs.getString("vname"));
        di.setForeground(Color.BLACK);
        di.setFont(new Font("微软雅黑", Font.BOLD, 27));
        di.setBounds(200, 100, 360, 70);
        panel.add(di);

        JTextField vnameT = new JTextField();
        vnameT.setBounds(450, 130, 360, 40);
        panel.add(vnameT);

        JLabel shi = new JLabel(rs.getString("vsdate"));
        shi.setForeground(Color.BLACK);
        shi.setFont(new Font("微软雅黑", Font.BOLD, 27));
        shi.setBounds(200, 180, 360, 70);
        panel.add(shi);

        JTextField vstateT = new JTextField();
        vstateT.setBounds(450, 200, 360, 40);
        panel.add(vstateT);

        JLabel zhong = new JLabel(rs.getString("vedate"));
        zhong.setForeground(Color.BLACK);
        zhong.setFont(new Font("微软雅黑", Font.BOLD, 27));
        zhong.setBounds(200, 260, 360, 70);
        panel.add(zhong);

        JTextField vetateT = new JTextField();
        vetateT.setBounds(450, 280, 360, 40);
        panel.add(vetateT);



        JLabel x1 = new JLabel("|");
        x1.setForeground(Color.cyan);
        x1.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x1.setBounds(170, 100, 360, 70);
        panel.add(x1);

        JLabel x2 = new JLabel("|");
        x2.setForeground(Color.cyan);
        x2.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x2.setBounds(170, 180, 360, 70);
        panel.add(x2);

        JLabel x3 = new JLabel("|");
        x3.setForeground(Color.cyan);
        x3.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x3.setBounds(170, 260, 360, 70);
        panel.add(x3);


        JButton jb1=new JButton(rs.getString("listVisaPageR1"));
        jb1.setBounds(350,400,360,70);
        panel.add(jb1);
        jb1.addActionListener(e->{
          int vname= Integer.valueOf(vnameT.getText());
          String vsdate=vstateT.getText();
          String vedate=vetateT.getText();
          int vstate=1;

        LocalDateTime ldt= LocalDateTime.now();
        long vid=0;
        int s=ldt.getMinute();
        int h=ldt.getHour();
        int d=ldt.getDayOfMonth();
        int m=ldt.getMonthValue();
        int y=ldt.getYear();
        String tmp=String.valueOf(cidBaseUtil.cid)+String.valueOf(y)+String.valueOf(m)+String.valueOf(d)+String.valueOf(h)+String.valueOf(s);
        vid=Long.parseLong(tmp);
            visaServiceImpl vsi=new visaServiceImpl();
           int row=vsi.insert(cidBaseUtil.cid,vid,vname,vsdate,vedate,vstate);
           if(row!=0){
               warningPage.show(rs.getString("warningPageName"),rs.getString("warningPageTitle"));
           }
        });



        setVisible(true);
    }

}
