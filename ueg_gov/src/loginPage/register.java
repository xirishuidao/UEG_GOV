package loginPage;

import main.pages.BackgroundPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class register extends JDialog {
    private JTextField tf_id;
    private JPasswordField pf_pwd1;
    private JPasswordField pf_pwd2;
    private JButton btn_register;
    private JTextField tf_phone;
    
    public register() {
    	setTitle("注册账户");
        setSize(1360, 1000);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);  
        
        BackgroundPanel con = new BackgroundPanel("/main/resource/login_bg.png");
        con.setLayout(null);
        con.setBounds(0,0,1360,1000);
        
        JLabel labelTitle = new JLabel("注册账户", JLabel.CENTER);
		labelTitle.setPreferredSize(new Dimension(516, 100));
		labelTitle.setFont(new Font("微软雅黑", Font.BOLD, 36));
		labelTitle.setForeground(Color.white);
		labelTitle.setBounds(335, 50, 380, 70);
		
        JLabel label1 = new JLabel("公民身份证号：");
        label1.setBounds(253, 136, 160, 30);
        label1.setFont(new Font("微软雅黑", Font.BOLD, 19));
        label1.setForeground(Color.white);
        tf_id = new JTextField(20);
        tf_id.setBounds(430, 136, 220, 30);

        JLabel label2 = new JLabel("初始密码：");
        label2.setBounds(253, 207, 160, 30);
        label2.setFont(new Font("微软雅黑", Font.BOLD, 19));
        label2.setForeground(Color.white);
        pf_pwd1 = new JPasswordField(20);
        pf_pwd1.setBounds(430, 207, 220, 30);

        JLabel label3 = new JLabel("再次输入密码：");
        label3.setBounds(253, 279, 160, 30);
        label3.setFont(new Font("微软雅黑", Font.BOLD, 19));
        label3.setForeground(Color.white);
        pf_pwd2 = new JPasswordField(20);
        pf_pwd2.setBounds(430, 279, 220, 30);

        JLabel label4 = new JLabel("请输入手机号：");
        label4.setBounds(253, 349, 160, 30);
        label4.setFont(new Font("微软雅黑", Font.BOLD, 19));
        label4.setForeground(Color.white);
        tf_phone = new JTextField(20);
        tf_phone.setBounds(430, 349, 220, 30);

        btn_register = new JButton("注册");
        btn_register.setOpaque(true);
        btn_register.setContentAreaFilled(true);
        btn_register.setFont(new Font("微软雅黑", Font.BOLD, 16));
        btn_register.setForeground(Color.white);
        btn_register.setBackground(Color.gray);
        btn_register.setBorderPainted(false);
        btn_register.setBounds(465, 396, 120, 30);
        
        btn_register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validateInput()) {
                    JOptionPane.showMessageDialog(register.this, "注册成功！");
                }
            }
        });

        add(labelTitle);
        add(label1);
        add(tf_id);
        add(label2);
        add(pf_pwd1);
        add(label3);
        add(pf_pwd2);
        add(label4);
        add(tf_phone);
        add(btn_register);
        add(con);
    }


    
    
    
    private boolean validateInput() {
        String id = tf_id.getText().trim();
        char[] pwd1 = pf_pwd1.getPassword(); // 获取字符数组而不是字符串
        char[] pwd2 = pf_pwd2.getPassword(); // 获取字符数组而不是字符串
        String phone = tf_phone.getText().trim();
        
        if (id.isEmpty() || pwd1.length == 0 || pwd2.length == 0 || phone.isEmpty()) {
            JOptionPane.showMessageDialog(this, "请填写完整的信息！");
            return false;
        }
        
        if (!Arrays.equals(pwd1, pwd2)) { // 使用 Arrays.equals 比较字符数组
            JOptionPane.showMessageDialog(this, "两次输入的密码不一致！");
            return false;
        }
        
        if (!isValidPhoneNumber(phone)) {
            JOptionPane.showMessageDialog(this, "手机号格式不正确！");
            return false;
        }
        
        return true;
    }
    
    private boolean isValidPhoneNumber(String phone) {
        // Simple validation for a Chinese phone number (11 digits and starts with 1)
        return phone.matches("^1\\d{10}$");
    }
    
    public static void main(String[] args) {
        new register().setVisible(true);
    }
}