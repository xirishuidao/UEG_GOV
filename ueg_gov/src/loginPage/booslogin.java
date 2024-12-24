package loginPage;



import main.pages.BackgroundPanel;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;

import javax.swing.*;

public class booslogin extends JFrame {
    public booslogin() {
        setTitle("政府人员登录");
        setSize(1360, 1000);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        BackgroundPanel con = new BackgroundPanel("/main/resource/login_bg.png");
        con.setLayout(null);
        con.setBounds(0,0,1360,1000);

        JLabel labelTitle = new JLabel("政府人员登录", JLabel.CENTER);
        labelTitle.setPreferredSize(new Dimension(516, 100));
        labelTitle.setFont(new Font("微软雅黑", Font.BOLD, 36));
        labelTitle.setForeground(Color.white);
        labelTitle.setBounds(460, 200, 380, 70);
        con.add(labelTitle);

        JLabel label1 = new JLabel("账户：");
        label1.setFont(new Font("微软雅黑", Font.BOLD, 20));
        label1.setForeground(Color.white);
        label1.setBounds(360, 300, 63, 30); // bound：边界， 设置位置和大小，setLocation()+setSize()
        con.add(label1);

        JLabel label2 = new JLabel("密码：");
        label2.setFont(new Font("微软雅黑", Font.BOLD, 20));
        label2.setForeground(Color.white);
        label2.setBounds(360, 400, 63, 30);
        con.add(label2);

        JTextField tf_id = new JTextField(28);
        tf_id.setBounds(540, 300, 220, 30);
        con.add(tf_id);

        JPasswordField pf_pwd = new JPasswordField(28);
        pf_pwd.setBounds(540, 400, 220, 30);
        con.add(pf_pwd);

        JButton btn_login = new JButton("登录");
        btn_login.setOpaque(true);
        btn_login.setContentAreaFilled(true);
        btn_login.setFont(new Font("微软雅黑", Font.BOLD, 16));
        btn_login.setForeground(Color.white);
        btn_login.setBackground(Color.gray);
        btn_login.setBounds(582, 500, 120, 30);
        btn_login.setBorderPainted(false);
        add(btn_login);

        btn_login.addActionListener(e -> {
            String username = tf_id.getText();
            String password = new String(pf_pwd.getPassword());
            if ("123".equals(username) && "123".equals(password)) {
                JOptionPane.showMessageDialog(null, "登录成功！");
                dispose(); // 关闭窗口

            } else {
                JOptionPane.showMessageDialog(null, "用户名或密码错误！");
            }
        });
        // 添加显示/隐藏密码的复选框
        JCheckBox showPasswordCheckBox = new JCheckBox("显示密码");
        showPasswordCheckBox.setFont(new Font("微软雅黑", Font.BOLD, 15));
        showPasswordCheckBox.setBounds(810, 400, 100, 30);
        showPasswordCheckBox.setForeground(Color.white);
        showPasswordCheckBox.setOpaque(false);
        showPasswordCheckBox.setContentAreaFilled(false);
        showPasswordCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (showPasswordCheckBox.isSelected()) {
                    pf_pwd.setEchoChar((char) 0); // 显示密码
                } else {
                    pf_pwd.setEchoChar('•'); // 隐藏密码
                }
            }
        });
        add(showPasswordCheckBox);


        this.add(con);
    }
    public static void main(String[] args) {
        new booslogin().setVisible(true);
    }
}
