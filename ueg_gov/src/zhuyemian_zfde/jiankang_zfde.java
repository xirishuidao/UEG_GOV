package zhuyemian_zfde;

import javax.swing.*;
import java.awt.*;

public class jiankang_zfde extends JPanel {
    public jiankang_zfde() {
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

        JLabel shenfenzhenghao = new JLabel("身份证号:");
        shenfenzhenghao.setForeground(Color.BLACK);
        shenfenzhenghao.setFont(new Font("微软雅黑", Font.BOLD, 27));
        shenfenzhenghao.setBounds(70, 440, 360, 70);
        add(shenfenzhenghao);

        JTextField shenfenzhenghao_ = new JTextField();
        shenfenzhenghao_.setBounds(240, 460, 360, 40);
        add(shenfenzhenghao_);

        JLabel x7 = new JLabel("|");
        x7.setForeground(Color.cyan);
        x7.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x7.setBounds(36, 439, 360, 70);
        add(x7);


        JButton btnSearch = new JButton("查询");
        btnSearch.setBounds(200, 630, 100, 30);
        add(btnSearch);

        JButton btnAdd = new JButton("插入");
        btnAdd.setBounds(350, 630, 100, 30);
        add(btnAdd);

        JButton btnDelete = new JButton("删除");
        btnDelete.setBounds(500, 630, 100, 30);
        add(btnDelete);

        JButton btnUpdate = new JButton("更新");
        btnUpdate.setBounds(650, 630, 100, 30);
        add(btnUpdate);

        JButton btnMoHuSearch = new JButton("模糊查询");
        btnMoHuSearch.setBounds(801, 630, 100, 30);
        add(btnMoHuSearch);

        btnSearch.addActionListener(e -> {

        });


        btnAdd.addActionListener(e -> {

        });


        btnDelete.addActionListener(e -> {

        });


        btnUpdate.addActionListener(e -> {

        });


    }
}
