package loginPage;

import main.pages.BackgroundPanel;
import main.pages.warningPage;
import service.Impl.citizenServiceImpl;
import util.DataBaseUtil;
import util.LanguageUtil;
import util.cidBaseUtil;
import zhuyemian.zhuyemian_renminde;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.ResourceBundle;

public class LoginPage extends JFrame {
		public LoginPage(ResourceBundle rs){
			setSize(1360,800);
			setTitle(rs.getString("PageTitle"));
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			setResizable(false);
			
			BackgroundPanel con=new BackgroundPanel("/main/resource/login_bg.png");

			con.setLayout(null);

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

			JLabel labelTitle = new JLabel(rs.getString("citizenLogin"), JLabel.CENTER);
			labelTitle.setFont(new Font("微软雅黑", Font.BOLD, 36));
			labelTitle.setForeground(Color.white);
			labelTitle.setBounds(360, 100, 580, 110);
			con.add(labelTitle);
			
			JLabel label1 = new JLabel(rs.getString("cid")+":");
			label1.setFont(new Font("微软雅黑", Font.BOLD, 20));
			label1.setForeground(Color.white);
			label1.setBounds(330, 300, 163, 30); // bound：边界， 设置位置和大小，setLocation()+setSize()
			con.add(label1);

			JLabel label2 = new JLabel(rs.getString("cpwd")+":");
			label2.setFont(new Font("微软雅黑", Font.BOLD, 20));
			label2.setForeground(Color.white);
			label2.setBounds(330, 400, 163, 30);
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

			JButton btn_login = new JButton(rs.getString("citizenLogin"));
			btn_login.setOpaque(true);
			btn_login.setContentAreaFilled(true);
			btn_login.setFont(new Font("微软雅黑", Font.BOLD, 16));
			btn_login.setForeground(Color.white);
			btn_login.setBackground(Color.gray);
			btn_login.setBounds(540, 500, 200, 30);
			btn_login.setBorderPainted(false);
			add(btn_login);

			JButton btn_register = new JButton("");
			btn_register.setOpaque(false);
			btn_register.setContentAreaFilled(false);
			btn_register.setFont(new Font("微软雅黑", Font.BOLD, 20));
			btn_register.setForeground(Color.white);
			btn_register.setBorderPainted(false);
			btn_register.setBounds(482, 600, 120, 30);
			add(btn_register);
			
			JButton btn_zhaohui=new JButton("");
			btn_zhaohui.setOpaque(false);
			btn_zhaohui.setContentAreaFilled(false);
			btn_zhaohui.setFont(new Font("微软雅黑", Font.BOLD, 20));
			btn_zhaohui.setForeground(Color.white);
			btn_zhaohui.setBorderPainted(false);
			btn_zhaohui.setBounds(300, 600, 120, 30);
			add(btn_zhaohui);

			JButton btn_zhengfu=new JButton(rs.getString("administerLogin"));
			btn_zhengfu.setOpaque(false);
			btn_zhengfu.setContentAreaFilled(false);
			btn_zhengfu.setFont(new Font("微软雅黑", Font.BOLD, 20));
			btn_zhengfu.setForeground(Color.white);
			btn_zhengfu.setBorderPainted(false);
			btn_zhengfu.setBounds(663, 600, 420, 30);
			add(btn_zhengfu);


			//JLabel label3 = new JLabel("政府人员入口");
			//JButton btn_root = new JButton("");
			//label3.setBounds(586,360,220,100);
			btn_login.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // 在这里编写登录逻辑
	                long id =Long.parseLong(tf_id.getText()); // 获取用户名
	                String password = new String(pf_pwd.getPassword()); // 获取密码

					citizenServiceImpl csi = new citizenServiceImpl();
					String pwd=csi.findpasswd(id);

	                // 这里可以添加验证用户名和密码的逻辑
	                if (pwd.equals(password)) {
						cidBaseUtil cbu1 = new cidBaseUtil(id);
					zhuyemian_renminde zr=new zhuyemian_renminde(rs);
					dispose();


	                } else {
						warningPage.show(rs.getString("LoginPageName"),rs.getString("LoginPageTitle"));
	                }
	            }
	        });

			btn_register.addActionListener(new ActionListener() {
			    @Override
			    public void actionPerformed(ActionEvent e) {
			        register registerDialog = new register();
			        registerDialog.setVisible(true);
			    }
			});
			
			btn_zhengfu.addActionListener(new ActionListener() {
			    @Override
			    public void actionPerformed(ActionEvent e) {
			        booslogin governmentLoginFrame = new booslogin(rs);
			        governmentLoginFrame.setVisible(true);
					dispose();
			    }
			});

			btn_zhaohui.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					zhaohui governmentLoginFrame = new zhaohui();
					governmentLoginFrame.setVisible(true);
				}
			});


			this.add(con);

			setVisible(true);
		}

	public static void main(String[] args) {
		ResourceBundle rs=ResourceBundle.getBundle("util.UEGLanguage",new Locale("zh"));
		LanguageUtil.rb=rs;
		LoginPage frame = new LoginPage(rs);
		frame.setVisible(true);
	}
}
