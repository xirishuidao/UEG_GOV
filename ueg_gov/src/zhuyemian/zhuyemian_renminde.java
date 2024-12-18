package zhuyemian;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.InputStream;
import java.util.ResourceBundle;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class zhuyemian_renminde extends JFrame{

	public zhuyemian_renminde(ResourceBundle rs) {


		this.setSize(1360,1000);
		this.setLocationRelativeTo(null);
		this.setTitle(rs.getString("PageTitle"));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel container=new JPanel();
		container.setLayout(new BorderLayout());
		this.add(container);

		// 创建顶部面板，用于放置图片和菜单栏
		JPanel panel1=new JPanel();
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS)); // 使用BoxLayout布局管理器
		container.add(panel1,BorderLayout.NORTH);
		panel1.setBackground(Color.white);


		// 加载图片并创建JLabel显示图片
		InputStream imageStream1= getClass().getResourceAsStream("/main/resource/ueg_gov_p.png");
		InputStream imageStream2 = getClass().getResourceAsStream("/main/resource/ueg_gov_b.png");
		Image iconImage;
		Image titleImage;
		try {
			// 从输入流中读取图像
			iconImage = ImageIO.read(imageStream2);
			titleImage = ImageIO.read(imageStream1);
		} catch (IOException e) {
			iconImage = null; // 可以选择设置一个默认图标或不做任何操作
			titleImage = null;
		}
		// 检查图像是否成功加载
		if (iconImage != null) {
			// 设置窗口图标
			setIconImage(titleImage);
		} else {
			//默认标识
		}


		  // 缩放图像 getscaledinstance
		ImageIcon newIcon1 = new ImageIcon(iconImage.getScaledInstance(109, 109, Image.SCALE_SMOOTH));
        JLabel imageLabel1 = new JLabel(newIcon1);
		ImageIcon newIcon2= new ImageIcon(titleImage.getScaledInstance(109, 93, Image.SCALE_SMOOTH));
		JLabel imageLabel2 = new JLabel(newIcon2);
        // 添加菜单和菜单项
		String menu[]= {"账户信息","个人信息","职业","驾驶证注册","跨区域许可证","公民健康"};

		String itmenu[][]= {
				{"ID","姓名"},
				{"身份证号","真实姓名","性别","国家地区","户籍地址","学历信息","出生年月"},
				{"任职信息","工作地址","单位","职业等级"},
				{"驾驶证号","种类","注册时间","注册地点"},
				{"到达地","许可证编号","开始日期","终止日期","许可证状态"},
				{"性别","血型","身高","体重","残疾等级","疾病等"},
				};
		 // 创建菜单栏
		JMenuBar menuBar=new JMenuBar();
		menuBar.setOpaque(true); // 确保菜单栏可以显示背景颜色
		menuBar.setBackground(Color.white); // 设置菜单栏背景颜色为白色




		// 将图片和菜单栏添加到顶部面板
        /*panel1.add(imageLabel);
        panel1.add(Box.createHorizontalGlue()); // 添加填充，使菜单栏靠右
        panel1.add(menuBar);
		*/


			for (int i = 0; i < menu.length; i++) {
			// 创建菜单
			JMenu menu1 = new JMenu(menu[i]);
			menu1.setOpaque(true); // 设置菜单为不透明
			menu1.setBackground(Color.white);//设置菜单背景颜色
			menu1.setFont(new Font("宋体", Font.BOLD, 27));// 设置菜单字体大小和样式
			menu1.addMouseListener(new MenuMouseListener());
			// 将菜单添加到菜单栏
			menuBar.add(menu1);
			for (int j = 0; j < itmenu[i].length; j++) {
				// 创建菜单项
				JMenuItem menuItem = new JMenuItem(itmenu[i][j]);
				menuItem.setOpaque(true);// 设置菜单项为不透明
				menuItem.setBackground(Color.white); // 设置菜单项背景颜色
				menuItem.setFont(new Font("宋体", Font.BOLD, 16)); // 设置菜单项字体大小和样式
				// 将菜单项添加到菜单
				menu1.add(menuItem);
				/*// 给菜单项注册动作监听器，监听菜单项的点击事件，也就是动作事件
				menuItem.addActionListener(listener);*/
			}
		}
		panel1.add(Box.createHorizontalStrut(78));
        panel1.add(imageLabel1);// 将图片和菜单栏添加到顶部面板
        panel1.add(Box.createHorizontalStrut(78)); // 添加填充，使菜单栏靠右
        panel1.add(menuBar);
		panel1.add(Box.createHorizontalStrut(78));
		panel1.add(imageLabel2);

		//创建面板主面板
		JPanel panel2=new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(Color.white);
		container.add(panel2,BorderLayout.CENTER);

		JLabel geRenXinXi = new JLabel("账户信息");
		geRenXinXi.setForeground(Color.BLACK);
		geRenXinXi.setFont(new Font("微软雅黑", Font.BOLD, 34));
		geRenXinXi.setBounds(10, 10, 360, 70);
		panel2.add(geRenXinXi);

		JLabel ID = new JLabel("ID");
		ID.setForeground(Color.GRAY);
		ID.setFont(new Font("微软雅黑", Font.BOLD, 27));
		ID.setBounds(70, 70, 360, 70);
		panel2.add(ID);

		JLabel xingming =new JLabel("姓名");
		xingming.setForeground(Color.GRAY);
		xingming.setFont(new Font("微软雅黑", Font.BOLD, 27));
		xingming.setBounds(70, 140, 360, 70);
		panel2.add(xingming);

		JLabel hujixinxi = new JLabel("个人信息");
		hujixinxi.setForeground(Color.BLACK);
		hujixinxi.setFont(new Font("微软雅黑", Font.BOLD, 34));
		hujixinxi.setBounds(10, 200, 360, 70);
		panel2.add(hujixinxi);


		JLabel shenfenID = new JLabel("身份证号");
		shenfenID.setForeground(Color.GRAY);
		shenfenID.setFont(new Font("微软雅黑", Font.BOLD, 27));
		shenfenID.setBounds(70, 260, 360, 70);
		panel2.add(shenfenID);

		JLabel xingBie = new JLabel("性别");
		xingBie.setForeground(Color.GRAY);
		xingBie.setFont(new Font("微软雅黑", Font.BOLD, 27));
		xingBie.setBounds(70, 320, 360, 70);
		panel2.add(xingBie);

		JLabel guojia = new JLabel("国家");
		guojia.setForeground(Color.GRAY);
		guojia.setFont(new Font("微软雅黑", Font.BOLD, 27));
		guojia.setBounds(70, 380, 360, 70);
		panel2.add(guojia);

		JLabel xuelixinxi = new JLabel("学历");
		xuelixinxi.setForeground(Color.GRAY);
		xuelixinxi.setFont(new Font("微软雅黑", Font.BOLD, 27));
		xuelixinxi.setBounds(70, 440, 360, 70);
		panel2.add(xuelixinxi);

		JLabel time = new JLabel("出生日");
		time.setForeground(Color.GRAY);
		time.setFont(new Font("微软雅黑", Font.BOLD, 27));
		time.setBounds(70, 500, 360, 70);
		panel2.add(time);

		JLabel renzhixinxi = new JLabel("任职信息");
		renzhixinxi.setForeground(Color.BLACK);
		renzhixinxi.setFont(new Font("微软雅黑", Font.BOLD, 34));
		renzhixinxi.setBounds(10, 560, 360, 70);
		panel2.add(renzhixinxi);

		JLabel gongzuo = new JLabel("工作信息");
		gongzuo.setForeground(Color.GRAY);
		gongzuo.setFont(new Font("微软雅黑", Font.BOLD, 27));
		gongzuo.setBounds(70, 620, 360, 70);
		panel2.add(gongzuo);

	}

	//鼠标悬停的时候变颜色
	private class MenuMouseListener extends MouseAdapter {
        @Override
        public void mouseEntered(MouseEvent e) {
            ((JMenu) e.getSource()).setBackground(Color.CYAN);
        }

	//鼠标离开是默认的
        @Override
        public void mouseExited(MouseEvent e) {
            ((JMenu) e.getSource()).setBackground(Color.white);
        }

    }
	/*ActionListener listener=new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    String cmd=e.getActionCommand();

                }
            };*/
	public static void main(String[] args) {
		zhuyemian_renminde from=new zhuyemian_renminde(ResourceBundle.getBundle("util.UEGLanguage_zh"));
		from.setVisible(true);
	}

}















