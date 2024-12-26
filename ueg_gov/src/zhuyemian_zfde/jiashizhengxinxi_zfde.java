package zhuyemian_zfde;

import javax.swing.*;
import java.awt.*;

public class jiashizhengxinxi_zfde extends JPanel {

    public jiashizhengxinxi_zfde() {

        setLayout(null);
        setPreferredSize(new Dimension(700, 600));
        setBackground(Color.white);

        JLabel jiashizhengxinxi = new JLabel("驾驶证信息");
        jiashizhengxinxi.setForeground(Color.BLACK);
        jiashizhengxinxi.setFont(new Font("微软雅黑", Font.BOLD+Font.ITALIC, 34));
        jiashizhengxinxi.setBounds(460, 10, 360, 70);
        add(jiashizhengxinxi);

        JLabel jaishizhenghao = new JLabel("驾驶证号:");
        jaishizhenghao.setForeground(Color.BLACK);
        jaishizhenghao.setFont(new Font("微软雅黑", Font.BOLD, 27));
        jaishizhenghao.setBounds(70, 100, 360, 70);
        add(jaishizhenghao);

        JTextField jaishizhenghao_ = new JTextField();
        jaishizhenghao_.setBounds(240, 119, 360, 40);
        add(jaishizhenghao_);

        JLabel zhonglei = new JLabel("种类:");
        zhonglei.setForeground(Color.BLACK);
        zhonglei.setFont(new Font("微软雅黑", Font.BOLD, 27));
        zhonglei.setBounds(70, 200, 360, 70);
        add(zhonglei);

        JTextField zhonglei_ = new JTextField();
        zhonglei_.setBounds(240, 220, 360, 40);
        add(zhonglei_);

        JLabel shijian = new JLabel("注册时间:");
        shijian.setForeground(Color.BLACK);
        shijian.setFont(new Font("微软雅黑", Font.BOLD, 27));
        shijian.setBounds(70, 300, 360, 70);
        add(shijian);

        JTextField shijian_ = new JTextField();
        shijian_.setBounds(240, 320, 360, 40);
        add(shijian_);

        JLabel didian = new JLabel("注册地点:");
        didian.setForeground(Color.BLACK);
        didian.setFont(new Font("微软雅黑", Font.BOLD, 27));
        didian.setBounds(70, 400, 360, 70);
        add(didian);

        JTextField didian_ = new JTextField();
        didian_.setBounds(240, 416, 360, 40);
        add(didian_);

        JLabel x1 = new JLabel("|");
        x1.setForeground(Color.cyan);
        x1.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x1.setBounds(36, 100, 360, 70);
        add(x1);

        JLabel x2 = new JLabel("|");
        x2.setForeground(Color.cyan);
        x2.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x2.setBounds(36, 200, 360, 70);
        add(x2);

        JLabel x3 = new JLabel("|");
        x3.setForeground(Color.cyan);
        x3.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x3.setBounds(36, 300, 360, 70);
        add(x3);

        JLabel x4 = new JLabel("|");
        x4.setForeground(Color.cyan);
        x4.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x4.setBounds(36, 400, 360, 70);
        add(x4);
        JButton btnSearch = new JButton("查询");
        btnSearch.setBounds(200, 540, 100, 30);
        add(btnSearch);

        JButton btnAdd = new JButton("插入");
        btnAdd.setBounds(350, 540, 100, 30);
        add(btnAdd);

        JButton btnDelete = new JButton("删除");
        btnDelete.setBounds(500, 540, 100, 30);
        add(btnDelete);

        JButton btnUpdate = new JButton("更新");
        btnUpdate.setBounds(650, 540, 100, 30);
        add(btnUpdate);

        JButton btnMoHuSearch = new JButton("模糊查询");
        btnMoHuSearch.setBounds(801, 540, 100, 30);
        add(btnMoHuSearch);



        btnSearch.addActionListener(e -> {

        });


        btnAdd.addActionListener(e -> {

        });


        btnDelete.addActionListener(e -> {

        });


        btnUpdate.addActionListener(e -> {

        });

        btnMoHuSearch.addActionListener(e -> {new jiashizhengxinximohuchaxun().setVisible(true);});
    }




}


