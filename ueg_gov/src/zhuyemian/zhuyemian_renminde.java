package zhuyemian;

import util.DataBaseUtil;
import util.LanguageUtil;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.InputStream;
import java.util.ResourceBundle;

import javax.imageio.ImageIO;
import javax.swing.*;

public class zhuyemian_renminde extends JFrame {
	private CardLayout cardLayout;
	private JPanel cardPanel;
	private JPanel[] cardPanels; // 用于存储每个菜单项对应的面板

	public zhuyemian_renminde(ResourceBundle rs) {
		this.setSize(1360, 1000);
		this.setLocationRelativeTo(null);
		this.setTitle(rs.getString("PageTitle"));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel container = new JPanel();
		container.setLayout(new BorderLayout());
		this.add(container);

		// 创建顶部面板，用于放置图片和菜单栏
		JPanel panel1 = new JPanel();
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS)); // 使用BoxLayout布局管理器
		container.add(panel1, BorderLayout.NORTH);
		panel1.setBackground(Color.white);

		//创建左边与下边
		/*JPanel WESTpanel = new JPanel();
		container.add(WESTpanel, BorderLayout.WEST);
		WESTpanel.setPreferredSize(new Dimension(200,300));
		WESTpanel.setBackground(Color.GRAY);*/

		JPanel SOUTHPanel = new JPanel();
		container.add(SOUTHPanel, BorderLayout.SOUTH);
		SOUTHPanel.setPreferredSize(new Dimension(100,100));
		SOUTHPanel.setBackground(Color.GRAY);

		// 创建卡片布局面板
		cardLayout = new CardLayout();
		cardPanel = new JPanel(cardLayout);
		container.add(cardPanel, BorderLayout.CENTER);

		cardPanels = new JPanel[6]; // 根据菜单项数量初始化
		for (int i = 0; i < cardPanels.length; i++) {
			cardPanels[i] = new JPanel();
			cardPanels[i].setName("Card" + (i + 1)); // 设置面板名称，用于后续切换
			cardPanel.add(cardPanels[i], "Card" + (i + 1)); // 将面板添加到卡片布局面板中
		}

		zhanghuxinxi zhanghuXinxi = new zhanghuxinxi();
		cardPanel.add(zhanghuXinxi, "Card1");

		gerenxinxi gerenXinxi = new gerenxinxi();
		cardPanel.add(gerenXinxi, "Card2");

		ZhiyePanel zhiyePanel = new ZhiyePanel();
		cardPanel.add(zhiyePanel, "Card3");

		jiashizhengxinxi jiashiZhengxinxi = new jiashizhengxinxi();
		cardPanel.add(jiashiZhengxinxi, "Card4");

		visaCardPage_ManyR visaCardPage_ManyR = new visaCardPage_ManyR();
		cardPanel.add(visaCardPage_ManyR, "Card5");

		jiankangxinxi jiankangXinxi = new jiankangxinxi();
		cardPanel.add(jiankangXinxi, "Card6");



		// 加载图片并创建JLabel显示图片
		InputStream imageStream1 = getClass().getResourceAsStream("/main/resource/ueg_gov_p.png");
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
		if (titleImage != null) {
			// 设置窗口图标
			setIconImage(titleImage);
		}
		// 缩放图像 getscaledinstance
		ImageIcon newIcon1 = new ImageIcon(iconImage.getScaledInstance(109, 109, Image.SCALE_SMOOTH));
		JLabel imageLabel1 = new JLabel(newIcon1);
		ImageIcon newIcon2 = new ImageIcon(titleImage.getScaledInstance(109, 93, Image.SCALE_SMOOTH));
		JLabel imageLabel2 = new JLabel(newIcon2);

		// 添加菜单和菜单项
		String menu[] = {"账户信息", "个人信息", "职业信息", "驾驶证信息",rs.getString("listVisaPageR0"), "健康信息"};
		String itmenu[][]= {
				{"ID","姓名"},
				{"身份证号","真实姓名","性别","国家地区","户籍地址","学历信息","出生年月"},
				{"任职信息","工作地址","单位","职业等级"},
				{"驾驶证号","种类","注册时间","注册地点"},
				{rs.getString("listVisaPageR1"),rs.getString("listVisaPageR2"),rs.getString("listVisaPageR3")},
				{"血型","性别","身高","体重","残疾等级","疾病等"},
		};
		// 创建菜单栏
		JMenuBar menuBar = new JMenuBar();
		menuBar.setOpaque(true); // 确保菜单栏可以显示背景颜色
		menuBar.setBackground(Color.white); // 设置菜单栏背景颜色为白色

		for (int i = 0; i < menu.length; i++) {
			// 创建菜单

			JMenu menu1 = new JMenu(menu[i]);
			menu1.setOpaque(true); // 设置菜单为不透明
			menu1.setBackground(Color.white);// 设置菜单背景颜色
			menu1.setFont(new Font("宋体", Font.BOLD, 27));// 设置菜单字体大小和样式
			menu1.addMouseListener(new MenuMouseListener());

			// 创建菜单项
			for (int j = 0; j < itmenu[i].length; j++) {
				// 创建菜单项
				JMenuItem menuItem = new JMenuItem(itmenu[i][j]);
				menuItem.setOpaque(true);// 设置菜单项为不透明
				menuItem.setBackground(Color.white); // 设置菜单项背景颜色
				menuItem.setFont(new Font("宋体", Font.BOLD, 16)); // 设置菜单项字体大小和样式
				menuItem.addActionListener(new MenuActionListener(i));
				// 将菜单项添加到菜单
				menu1.add(menuItem);

				// 将菜单添加到菜单栏
				menuBar.add(menu1);
			}
		}


		panel1.add(Box.createHorizontalStrut(78));
		panel1.add(imageLabel1); // 将图片和菜单栏添加到顶部面板
		panel1.add(Box.createHorizontalStrut(78)); // 添加填充，使菜单栏靠右
		panel1.add(menuBar);
		panel1.add(Box.createHorizontalStrut(78));
		panel1.add(imageLabel2);

		setVisible(true);

	}

	// 鼠标悬停的时候变颜色
	private class MenuMouseListener extends MouseAdapter {
		@Override
		public void mouseEntered(MouseEvent e) {
			((JMenu) e.getSource()).setBackground(Color.CYAN);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			((JMenu) e.getSource()).setBackground(Color.white);
		}
	}
	private class MenuActionListener implements ActionListener {
		private int cardIndex;

		public MenuActionListener(int index) {
			this.cardIndex = index;

		}

		@Override
		public void actionPerformed(ActionEvent e) {

			cardLayout.show(cardPanel, "Card" + (cardIndex + 1)); // 根据索引显示对应的卡片
		}

	}

	public static void main(String[] args) {
		DataBaseUtil.getConnection();
		LanguageUtil a=new LanguageUtil("zh");
		ResourceBundle resourceBundle = LanguageUtil.rb;
		zhuyemian_renminde frame = new zhuyemian_renminde(resourceBundle);
		frame.setVisible(true);

	}
}

