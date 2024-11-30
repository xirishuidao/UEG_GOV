package loginPage;



import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class register extends JDialog {
    private JTextField tf_id;
    private JPasswordField pf_pwd;
    private JButton btn_register;

    public register() {
        setTitle("注册账户");
        setSize(300, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel label1 = new JLabel("账户：");
        label1.setBounds(50, 30, 50, 30);
        tf_id = new JTextField(20);
        tf_id.setBounds(100, 30, 160, 30);

        JLabel label2 = new JLabel("密码：");
        label2.setBounds(50, 70, 50, 30);
        pf_pwd = new JPasswordField(20);
        pf_pwd.setBounds(100, 70, 160, 30);

        btn_register = new JButton("注册");
        btn_register.setBounds(136, 110, 80, 30);
        btn_register.addActionListener(e -> register());

        add(label1);
        add(tf_id);
        add(label2);
        add(pf_pwd);
        add(btn_register);
    }

    private void register() {
        String username = tf_id.getText();
        String password = new String(pf_pwd.getPassword());

        // 在这里添加注册逻辑，比如验证信息，保存到数据库等
        JOptionPane.showMessageDialog(this, "注册成功，账户：" + username);
        dispose(); // 关闭注册对话框
    }
}
