package loginPage;

import javax.swing.*;
import java.awt.*;

public class zhaohui extends JFrame {
    public zhaohui(){

        setTitle("找回密码");
        setSize(600, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel container = new JPanel();
        container.setLayout(null);
        container.setBackground(Color.white);
        this.add(container);

        JLabel labelTitle = new JLabel("找回密码");
        labelTitle.setFont(new Font("微软雅黑", Font.BOLD, 27));
        labelTitle.setForeground(Color.BLACK);
        labelTitle.setBounds(30, 30, 300, 30);
        container.add(labelTitle);

        JLabel label1 = new JLabel("请输入账号：");
        label1.setFont(new Font("微软雅黑", Font.BOLD, 20));
        label1.setForeground(Color.BLACK);
        label1.setBounds(100, 109, 300, 30);
        container.add(label1);

        JTextField tf_id = new JTextField(28);
        tf_id.setBounds(240, 109, 220, 30);
        container.add(tf_id);

        JLabel label2 = new JLabel("请输入密保：");
        label2.setFont(new Font("微软雅黑", Font.BOLD, 20));
        label2.setForeground(Color.BLACK);
        label2.setBounds(100, 190, 300, 30);
        container.add(label2);

        JTextField pf_pwd = new JTextField(28);
        pf_pwd.setBounds(240, 190, 220, 30);
        container.add(pf_pwd);

        JButton queding =  new JButton("确定");
        queding.setBounds(240, 270, 90, 30);
        queding.setFont(new Font("微软雅黑", Font.BOLD, 20));
        queding.setForeground(Color.BLACK);
        container.add(queding);





    }
    public static void main(String[] args) {
        new zhaohui().setVisible(true);
    }
}
