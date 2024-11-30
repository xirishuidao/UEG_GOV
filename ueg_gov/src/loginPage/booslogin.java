package loginPage;



import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class booslogin extends JFrame {
    public booslogin() {
        setTitle("政府人员登录");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        JLabel labelTitle = new JLabel("政府人员登录", JLabel.CENTER);
        labelTitle.setFont(new Font("微软雅黑", Font.BOLD, 24));
        labelTitle.setBounds(80, 20, 240, 30);

        JLabel label1 = new JLabel("账户：");
        label1.setFont(new Font("微软雅黑", Font.BOLD, 16));
        label1.setBounds(100, 70, 50, 30);

        JTextField tf_id = new JTextField(20);
        tf_id.setBounds(150, 70, 160, 30);

        JLabel label2 = new JLabel("密码：");
        label2.setFont(new Font("微软雅黑", Font.BOLD, 16));
        label2.setBounds(100, 110, 50, 30);

        JPasswordField pf_pwd = new JPasswordField(20);
        pf_pwd.setBounds(150, 110, 160, 30);

        JButton btn_login = new JButton("登录");
        btn_login.setFont(new Font("微软雅黑", Font.BOLD, 16));
        btn_login.setBounds(172, 150, 80, 30);
        btn_login.addActionListener(e -> {
            String username = tf_id.getText();
            String password = new String(pf_pwd.getPassword());
            if ("admin".equals(username) && "password".equals(password)) {
                JOptionPane.showMessageDialog(null, "登录成功！");
                dispose(); // 关闭窗口
            } else {
                JOptionPane.showMessageDialog(null, "用户名或密码错误！");
            }
        });

        add(labelTitle);
        add(label1);
        add(tf_id);
        add(label2);
        add(pf_pwd);
        add(btn_login);
    }
}
