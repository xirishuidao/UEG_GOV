package loginPage;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicButtonUI;
class loginFrame extends JFrame{
		public loginFrame(){
			setSize(1060,600);
			setTitle("UEG登录");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			setResizable(false);
			
			JPanel con=new JPanel();
			con.setBackground(Color.WHITE);
			con.setLayout(null);
			
			JLabel labelTitle = new JLabel("公民登录", JLabel.CENTER);
			labelTitle.setPreferredSize(new Dimension(516, 100));
			labelTitle.setFont(new Font("微软雅黑", Font.BOLD, 36));
			labelTitle.setBounds(335, 50, 380, 70);
			
			JLabel label1 = new JLabel("账户：");
			JLabel label2 = new JLabel("密码：");
			label1.setFont(new Font("微软雅黑", Font.BOLD, 16));
			label2.setFont(new Font("微软雅黑", Font.BOLD, 16));
			label1.setBounds(370, 136, 50, 30); // bound：边界， 设置位置和大小，setLocation()+setSize()
			label2.setBounds(370, 207, 50, 30);
			
			JTextField tf_id = new JTextField(28);
			JPasswordField pf_pwd = new JPasswordField(28);
			tf_id.setBounds(430, 136, 220, 30); 
			pf_pwd.setBounds(430, 207, 220, 30);
			
			JButton btn_login = new JButton("登录");
			btn_login.setOpaque(true);
			btn_login.setContentAreaFilled(true);
			btn_login.setFont(new Font("微软雅黑", Font.BOLD, 16));
			btn_login.setBackground(Color.gray);
			btn_login.setBounds(465, 271, 120, 30);
			
			JButton btn_register = new JButton("注册账户");
			btn_register.setOpaque(false);
			btn_register.setContentAreaFilled(false);
			btn_register.setFont(new Font("微软雅黑", Font.BOLD, 13));
			btn_register.setBorderPainted(false);
			btn_register.setBounds(460, 330, 120, 30);
			
			JButton btn_zhaohui=new JButton("找回密码");
			btn_zhaohui.setOpaque(false);
			btn_zhaohui.setContentAreaFilled(false);
			btn_zhaohui.setFont(new Font("微软雅黑", Font.BOLD, 13));
			btn_zhaohui.setBorderPainted(false);
			btn_zhaohui.setBounds(315, 330, 120, 30);

			JButton btn_zhengfu=new JButton("政府人员");
			btn_zhengfu.setOpaque(false);
			btn_zhengfu.setContentAreaFilled(false);
			btn_zhengfu.setFont(new Font("微软雅黑", Font.BOLD, 13));
			btn_zhengfu.setBorderPainted(false);
			btn_zhengfu.setBounds(600, 330, 120, 30);
			
			
			
			//JLabel label3 = new JLabel("政府人员入口");
			//JButton btn_root = new JButton("");
			//label3.setBounds(586,360,220,100);
			btn_login.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // 在这里编写登录逻辑
	                String username = tf_id.getText(); // 获取用户名
	                String password = new String(pf_pwd.getPassword()); // 获取密码

	                // 这里可以添加验证用户名和密码的逻辑
	                if ("admin".equals(username) && "password".equals(password)) {
	                    JOptionPane.showMessageDialog(null, "登录成功！");
	                    // 可以在这里关闭登录窗口，并打开主界面
	                } else {
	                    JOptionPane.showMessageDialog(null, "用户名或密码错误！");
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
			        booslogin governmentLoginFrame = new booslogin();
			        governmentLoginFrame.setVisible(true);
			    }
			});
			con.add(labelTitle);
			con.add(label1);
			con.add(tf_id);
			con.add(label2);
			con.add(pf_pwd);
			con.add(btn_login);
			con.add(btn_register);
			con.add(btn_zhaohui);
			con.add(btn_zhengfu);
			//con.add(label3);
			this.add(con);
			
		}
}		



public  class login{
	public static void main(String[] args) {
		loginFrame frame = new loginFrame();
		frame.setVisible(true);
	}
}
		
		














 