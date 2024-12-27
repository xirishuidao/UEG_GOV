package zhuyemian_zfde;

import entity.country;
import entity.visa;
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







        JLabel kuaquyuxukezhengxinxi = new JLabel(rs.getString("listVisaPageG1"));
        kuaquyuxukezhengxinxi.setForeground(Color.BLACK);
        kuaquyuxukezhengxinxi.setFont(new Font("微软雅黑", Font.BOLD+Font.ITALIC, 34));
        kuaquyuxukezhengxinxi.setBounds(460, 10, 360, 70);
        panel.add(kuaquyuxukezhengxinxi);

        JLabel di = new JLabel(rs.getString("vname"));
        di.setForeground(Color.BLACK);
        di.setFont(new Font("微软雅黑", Font.BOLD, 27));
        di.setBounds(100, 100, 360, 70);
        panel.add(di);

        JTextField vnameT = new JTextField();
        vnameT.setBounds(450, 130, 360, 40);
        vnameT.setEditable(false);
        panel.add(vnameT);

        JLabel shi = new JLabel(rs.getString("vsdate"));
        shi.setForeground(Color.BLACK);
        shi.setFont(new Font("微软雅黑", Font.BOLD, 27));
        shi.setBounds(100, 180, 360, 70);
        panel.add(shi);

        JTextField vsdateT = new JTextField();
        vsdateT.setBounds(450, 200, 360, 40);
        vsdateT.setEditable(false);
        panel.add(vsdateT);

        JLabel zhong = new JLabel(rs.getString("vedate"));

        zhong.setForeground(Color.BLACK);
        zhong.setFont(new Font("微软雅黑", Font.BOLD, 27));
        zhong.setBounds(100, 260, 360, 70);
        panel.add(zhong);

        JTextField vedateT = new JTextField();
        vedateT.setBounds(450, 280, 360, 40);
        vedateT.setEditable(false);
        panel.add(vedateT);

        JLabel jid = new JLabel(rs.getString("cid"));
        jid.setForeground(Color.BLACK);
        jid.setFont(new Font("微软雅黑", Font.BOLD, 27));
        jid.setBounds(100, 340, 360, 70);
        panel.add(jid);

        JTextField cidT = new JTextField();
        cidT.setBounds(450, 360, 360, 40);
        cidT.setEditable(false);
        panel.add(cidT);

        visaServiceImpl visaServiceImpl = new visaServiceImpl();
        visa vtmp=visaServiceImpl.getStateOne();
        if(vtmp!=null) {
            cidT.setText(String.valueOf(vtmp.getCid()));
            vsdateT.setText(vtmp.getVsdate());
            vedateT.setText(vtmp.getVedate());
            vnameT.setText(String.valueOf(vtmp.getVname()));
        }



        JLabel x1 = new JLabel("|");
        x1.setForeground(Color.cyan);
        x1.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x1.setBounds(70, 100, 360, 70);
        panel.add(x1);

        JLabel x2 = new JLabel("|");
        x2.setForeground(Color.cyan);
        x2.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x2.setBounds(70, 180, 360, 70);
        panel.add(x2);

        JLabel x3 = new JLabel("|");
        x3.setForeground(Color.cyan);
        x3.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x3.setBounds(70, 260, 360, 70);
        panel.add(x3);

        JLabel x4 = new JLabel("|");
        x4.setForeground(Color.cyan);
        x4.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x4.setBounds(70, 340, 360, 70);
        panel.add(x4);


        JButton jb1=new JButton(rs.getString("agreeVisa"));
        jb1.setBounds(250,420,200,50);
        panel.add(jb1);

        JButton jb2=new JButton(rs.getString("disagreeVisa"));
        jb2.setBounds(550,420,200,50);
        panel.add(jb2);
        jb1.addActionListener(e->{
          if(vtmp!=null){
              vtmp.setVstate(3);
              visaServiceImpl.update(vtmp.getCid(),vtmp.getVid(),vtmp.getVname(), vtmp.getVsdate(), vtmp.getVedate(),3);
          }
            visa vtmp1=visaServiceImpl.getStateOne();
            if(vtmp1!=null) {
                vtmp.setCid(vtmp1.getCid());
                vtmp.setVid(vtmp1.getVid());
                vtmp.setVname(vtmp1.getVname());
                vtmp.setVsdate(vtmp1.getVsdate());
                vtmp.setVedate(vtmp1.getVedate());
                vtmp.setVstate(vtmp1.getVstate());
                cidT.setText(String.valueOf(vtmp.getCid()));
                vsdateT.setText(vtmp.getVsdate());
                vedateT.setText(vtmp.getVedate());
                vnameT.setText(String.valueOf(vtmp.getVname()));
            }
        });
        jb2.addActionListener(e->{
            if(vtmp!=null){
                vtmp.setVstate(2);
                visaServiceImpl.update(vtmp.getCid(),vtmp.getVid(),vtmp.getVname(), vtmp.getVsdate(), vtmp.getVedate(),2);
            }
            visa vtmp1=visaServiceImpl.getStateOne();
            if(vtmp1!=null) {
                vtmp.setCid(vtmp1.getCid());
                vtmp.setVid(vtmp1.getVid());
                vtmp.setVname(vtmp1.getVname());
                vtmp.setVsdate(vtmp1.getVsdate());
                vtmp.setVedate(vtmp1.getVedate());
                vtmp.setVstate(vtmp1.getVstate());
                cidT.setText(String.valueOf(vtmp.getCid()));
                vsdateT.setText(vtmp.getVsdate());
                vedateT.setText(vtmp.getVedate());
                vnameT.setText(String.valueOf(vtmp.getVname()));
            }

        });



        setVisible(true);
    }

}
