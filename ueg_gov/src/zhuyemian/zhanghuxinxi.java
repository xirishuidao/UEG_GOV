package zhuyemian;

import javax.swing.*;
import java.awt.*;

public class zhanghuxinxi extends JPanel {



    public zhanghuxinxi() {

        setLayout(null);
        setPreferredSize(new Dimension(700, 600));
        setBackground(Color.white);

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



    }

}
