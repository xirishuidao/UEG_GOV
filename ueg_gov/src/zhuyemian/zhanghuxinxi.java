package zhuyemian;

import main.pages.errPage;
import main.pages.warningPage;
import service.Impl.citizenServiceImpl;
import util.DataBaseUtil;
import util.LanguageUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class zhanghuxinxi extends JPanel {


    
    public zhanghuxinxi() {
        DataBaseUtil a=new DataBaseUtil();
        citizenServiceImpl impl=new citizenServiceImpl();

        setLayout(null);
        setPreferredSize(new Dimension(700, 600));
        setBackground(Color.white);

        // 添加账户信息标签
        JLabel zhanghuxinxi = new JLabel("账户信息");
        zhanghuxinxi.setForeground(Color.BLACK);
        zhanghuxinxi.setFont(new Font("微软雅黑", Font.BOLD+Font.ITALIC, 34));
        zhanghuxinxi.setBounds(560, 10, 360, 70);
        add(zhanghuxinxi);

        // 添加ID标签
        JLabel ID = new JLabel("ID:");
        ID.setForeground(Color.BLACK);
        ID.setFont(new Font("微软雅黑", Font.BOLD, 27));
        ID.setBounds(270, 130, 360, 70);
        add(ID);


        JTextField ID_ = new JTextField();
        ID_.setBounds(360, 150, 360, 40);
        add(ID_);

        // 添加姓名标签
        JLabel xingming = new JLabel("姓名:");
        xingming.setForeground(Color.BLACK);
        xingming.setFont(new Font("微软雅黑", Font.BOLD, 27));
        xingming.setBounds(270, 270, 360, 70);
        add(xingming);

        JTextField xingming_ = new JTextField();
        xingming_.setBounds(360, 290, 360, 40);
        add(xingming_);


        JLabel mima = new JLabel("密码:");
        mima.setForeground(Color.BLACK);
        mima.setFont(new Font("微软雅黑", Font.BOLD, 27));
        mima.setBounds(270, 390, 360, 70);
        add(mima);

        JTextField mima_ = new JTextField();
        mima_.setBounds(360, 410, 360, 40);
        add(mima_);

        JLabel x = new JLabel("|");
        x.setForeground(Color.cyan);
        x.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x.setBounds(236, 130, 360, 70);
        add(x);

        JLabel y = new JLabel("|");
        y.setForeground(Color.cyan);
        y.setFont(new Font("微软雅黑", Font.BOLD, 36));
        y.setBounds(236, 270, 360, 70);
        add(y);

        JLabel z = new JLabel("|");
        z.setForeground(Color.cyan);
        z.setFont(new Font("微软雅黑", Font.BOLD, 36));
        z.setBounds(236, 390, 360, 70);
        add(z);

        JButton change = new JButton("change");
        change.setBounds(550, 500, 150, 50);
        change.addActionListener(e->{
          long cid=Long.parseLong(ID_.getText());
          String cname=xingming_.getText();
          String cpwd=mima_.getText();
           int row=impl.update(cid,cname,cpwd);
            System.out.println(row);
           if(row==-1){
               warningPage.show(  LanguageUtil.rb.getString("warningPageTitle"),LanguageUtil.rb.getString("warningPageName"));
           }

        });
        add(change);

        setVisible(true);
    }

}
