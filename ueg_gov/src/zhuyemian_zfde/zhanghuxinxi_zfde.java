package zhuyemian_zfde;


import entity.citizen;
import main.pages.warningPage;
import service.Impl.citizenServiceImpl;
import util.DataBaseUtil;
import util.LanguageUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class zhanghuxinxi_zfde extends JPanel {
    citizenServiceImpl citizenServiceImpl = new citizenServiceImpl();
    public zhanghuxinxi_zfde() {
        setLayout(null);
        setPreferredSize(new Dimension(700, 600));
        setBackground(Color.white);
        DataBaseUtil a=new DataBaseUtil();
        citizenServiceImpl impl=new citizenServiceImpl();
        // 添加账户信息标签
        JLabel zhanghuxinxi = new JLabel("账户信息");
        zhanghuxinxi.setForeground(Color.BLACK);
        zhanghuxinxi.setFont(new Font("微软雅黑", Font.BOLD+Font.ITALIC, 34));
        zhanghuxinxi.setBounds(460, 10, 360, 70);
        add(zhanghuxinxi);

        // 添加ID标签
        JLabel ID = new JLabel("ID:");
        ID.setForeground(Color.BLACK);
        ID.setFont(new Font("微软雅黑", Font.BOLD, 27));
        ID.setBounds(70, 130, 360, 70);
        add(ID);


        JTextField ID_ = new JTextField();
        ID_.setBounds(160, 150, 360, 40);
        add(ID_);

        // 添加姓名标签
        JLabel xingming = new JLabel("姓名:");
        xingming.setForeground(Color.BLACK);
        xingming.setFont(new Font("微软雅黑", Font.BOLD, 27));
        xingming.setBounds(70, 270, 360, 70);
        add(xingming);

        JTextField xingming_ = new JTextField();
        xingming_.setBounds(160, 290, 360, 40);
        add(xingming_);

        JLabel mima = new JLabel("密码");
        mima.setForeground(Color.BLACK);
        mima.setFont(new Font("微软雅黑", Font.BOLD, 27));
        mima.setBounds(70, 410, 360, 70);
        add(mima);

        JTextField mima_ = new JTextField();
        mima_.setBounds(160, 433, 360, 40);
        add(mima_);


        JLabel x = new JLabel("|");
        x.setForeground(Color.cyan);
        x.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x.setBounds(36, 130, 360, 70);
        add(x);

        JLabel y = new JLabel("|");
        y.setForeground(Color.cyan);
        y.setFont(new Font("微软雅黑", Font.BOLD, 36));
        y.setBounds(36, 270, 360, 70);
        add(y);

        JLabel z = new JLabel("|");
        z.setForeground(Color.cyan);
        z.setFont(new Font("微软雅黑", Font.BOLD, 36));
        z.setBounds(36, 410, 360, 70);
        add(z);


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



        btnSearch.addActionListener(e -> {

            long id = Long.parseLong(ID_.getText());

            xingming_.setText(citizenServiceImpl.findname(id));
            mima_.setText(citizenServiceImpl.findpasswd(id));


        });

        btnAdd.addActionListener(e -> {
            long id = Long.parseLong(ID_.getText());
            String xingmingx = xingming_.getText();
            String mimax = mima_.getText();
            citizenServiceImpl.insert(id,mimax,xingmingx);
        });


        btnDelete.addActionListener(e -> {

            long id = Long.parseLong(ID_.getText());
            citizenServiceImpl.delete(id);
        });


        btnUpdate.addActionListener(e -> {
            long id = Long.parseLong(ID_.getText());
            String xingmingxx = xingming_.getText();
            String mimaxx = mima_.getText();
            citizenServiceImpl.update(id, xingmingxx, mimaxx);
        });


    }

}


