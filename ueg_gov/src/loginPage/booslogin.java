package loginPage;



import main.pages.BackgroundPanel;
import main.pages.warningPage;
import service.Impl.administerServiceImpl;
import service.Impl.citizenServiceImpl;
import util.LanguageUtil;
import util.aidBaseUtil;
import util.cidBaseUtil;
import zhuyemian.zhuyemian_renminde;
import zhuyemian_zfde.zhuyemian_zhengfurenyuan;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.util.ResourceBundle;

import javax.imageio.ImageIO;
import javax.swing.*;

public class booslogin extends JFrame {
    public booslogin(ResourceBundle rs) {
        setTitle(rs.getString("PageTitle"));
        setSize(1360, 800);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        BackgroundPanel con = new BackgroundPanel("/main/resource/login_bg.png");
        con.setLayout(null);
        con.setBounds(0,0,1360,800);
        // 加载图片并创建JLabel显示图片
        InputStream imageStream1 = getClass().getResourceAsStream("/main/resource/ueg_gov_p.png");
        Image titleImage;
        try {
            // 从输入流中读取图像
            titleImage = ImageIO.read(imageStream1);

        } catch (IOException e) {
            titleImage = null;
        }
        // 检查图像是否成功加载
        if (titleImage != null) {
            // 设置窗口图标
            setIconImage(titleImage);
        }


        JLabel labelTitle = new JLabel(rs.getString("administerLogin"), JLabel.CENTER);
        labelTitle.setFont(new Font("微软雅黑", Font.BOLD, 36));
        labelTitle.setForeground(Color.white);
        labelTitle.setBounds(360, 100, 580, 110);
        con.add(labelTitle);

        JLabel label1 = new JLabel(rs.getString("aid")+":");
        label1.setFont(new Font("微软雅黑", Font.BOLD, 20));
        label1.setForeground(Color.white);
        label1.setBounds(230, 300, 263, 30); // bound：边界， 设置位置和大小，setLocation()+setSize()
        con.add(label1);

        JLabel label2 = new JLabel(rs.getString("apwd")+":");
        label2.setFont(new Font("微软雅黑", Font.BOLD, 20));
        label2.setForeground(Color.white);
        label2.setBounds(230, 400, 263, 30);
        con.add(label2);

        JTextField tf_id = new JTextField(28);
        tf_id.setBounds(540, 300, 220, 30);
        con.add(tf_id);

        JPasswordField pf_pwd = new JPasswordField(28);
        pf_pwd.setBounds(540, 400, 220, 30);
        con.add(pf_pwd);

        JLabel bo=new JLabel(rs.getString("powerBy"));
        bo.setFont(new Font("微软雅黑", Font.BOLD, 15));
        bo.setForeground(Color.white);
        bo.setBounds(400, 700, 1300, 40);
        con.add(bo);


        JButton btn_login = new JButton(rs.getString("administerLogin"));
        btn_login.setOpaque(true);
        btn_login.setContentAreaFilled(true);
        btn_login.setFont(new Font("微软雅黑", Font.BOLD, 16));
        btn_login.setForeground(Color.white);
        btn_login.setBackground(Color.gray);
        btn_login.setBounds(500, 500, 300, 30);
        btn_login.setBorderPainted(false);
        add(btn_login);


        btn_login.addActionListener(e -> {
            long id =Long.parseLong(tf_id.getText());
            String password = new String(pf_pwd.getPassword());

            administerServiceImpl asi = new administerServiceImpl();
            String pwd=asi.findPassword(id);

            if (pwd.equals(password)) {
                aidBaseUtil abu1 = new aidBaseUtil(id);
                zhuyemian_zhengfurenyuan zr = new zhuyemian_zhengfurenyuan(rs);
                zr.setVisible(true);
                dispose();
            }else {
                warningPage.show(rs.getString("LoginPageName"),rs.getString("LoginPageTitle"));
            }
        });
        // 添加显示/隐藏密码的复选框
        JCheckBox showPasswordCheckBox = new JCheckBox(rs.getString("showpwd"));
        showPasswordCheckBox.setFont(new Font("微软雅黑", Font.BOLD, 15));
        showPasswordCheckBox.setBounds(810, 400, 400, 30);
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
        setVisible(true);
    }
    public static void main(String[] args) {
        LanguageUtil a=new LanguageUtil("zh");
        ResourceBundle rs= LanguageUtil.rb;
        new booslogin(rs).setVisible(true);
    }
}
