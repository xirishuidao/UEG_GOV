package zhuyemian;

import javax.swing.*;
import java.awt.*;
public class jiankangxinxi extends JPanel {

    public jiankangxinxi() {

        setLayout(null);
        setPreferredSize(new Dimension(700, 600));
        setBackground(Color.white);

        JLabel gerenxinxi = new JLabel("健康信息");
        gerenxinxi.setForeground(Color.BLACK);
        gerenxinxi.setFont(new Font("微软雅黑", Font.BOLD+Font.ITALIC, 34));
        gerenxinxi.setBounds(460, 10, 360, 70);
        add(gerenxinxi);

        JLabel xingbie = new JLabel("性别:");
        xingbie.setForeground(Color.BLACK);
        xingbie.setFont(new Font("微软雅黑", Font.BOLD, 27));
        xingbie.setBounds(70, 70, 360, 70);
        add(xingbie);


        JTextField xingbie_ = new JTextField();
        xingbie_.setBounds(240, 90, 360, 40);
        add(xingbie_);

        JLabel xuexing = new JLabel("血型:");
        xuexing.setForeground(Color.BLACK);
        xuexing.setFont(new Font("微软雅黑", Font.BOLD, 27));
        xuexing.setBounds(70, 130, 360, 70);
        add(xuexing);

        JTextField xuexing_ = new JTextField();
        xuexing_.setBounds(240, 150, 360, 40);
        add(xuexing_);

        JLabel shengao = new JLabel("身高:");
        shengao.setForeground(Color.BLACK);
        shengao.setFont(new Font("微软雅黑", Font.BOLD, 27));
        shengao.setBounds(70, 190, 360, 70);
        add(shengao);

        JTextField shengao_ = new JTextField();
        shengao_.setBounds(240, 209, 360, 40);
        add(shengao_);

        JLabel tizhong = new JLabel("体重:");
        tizhong.setForeground(Color.BLACK);
        tizhong.setFont(new Font("微软雅黑", Font.BOLD, 27));
        tizhong.setBounds(70, 250, 360, 70);
        add(tizhong);

        JTextField tizhong_ = new JTextField();
        tizhong_.setBounds(240, 270, 360, 40);
        add(tizhong_);

        JLabel canji = new JLabel("残疾等级:");
        canji.setForeground(Color.BLACK);
        canji.setFont(new Font("微软雅黑", Font.BOLD, 27));
        canji.setBounds(70, 310, 360, 70);
        add(canji);

        JTextField canji_ = new JTextField();
        canji_.setBounds(240, 330, 360, 40);
        add(canji_);

        JLabel jibing = new JLabel("疾病等:");
        jibing.setForeground(Color.BLACK);
        jibing.setFont(new Font("微软雅黑", Font.BOLD, 27));
        jibing.setBounds(70, 370, 360, 70);
        add(jibing);

        JTextField jibing_ = new JTextField();
        jibing_.setBounds(240, 396, 360, 40);
        add(jibing_);

        JLabel x1 = new JLabel("|");
        x1.setForeground(Color.cyan);
        x1.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x1.setBounds(36, 70, 360, 70);
        add(x1);

        JLabel x2 = new JLabel("|");
        x2.setForeground(Color.cyan);
        x2.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x2.setBounds(36, 130, 360, 70);
        add(x2);

        JLabel x3 = new JLabel("|");
        x3.setForeground(Color.cyan);
        x3.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x3.setBounds(36, 190, 360, 70);
        add(x3);

        JLabel x4 = new JLabel("|");
        x4.setForeground(Color.cyan);
        x4.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x4.setBounds(36, 250, 360, 70);
        add(x4);

        JLabel x5 = new JLabel("|");
        x5.setForeground(Color.cyan);
        x5.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x5.setBounds(36, 310, 360, 70);
        add(x5);

        JLabel x6 = new JLabel("|");
        x6.setForeground(Color.cyan);
        x6.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x6.setBounds(36, 370, 360, 70);
        add(x6);


    }

}
