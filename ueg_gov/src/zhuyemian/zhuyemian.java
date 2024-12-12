package zhuyemian;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class zhuyemian extends JFrame{
	
	public zhuyemian() {
		
		
		this.setSize(1060,600);
		this.setLocationRelativeTo(null);
		this.setTitle("UEG");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel container=new JPanel();
		container.setLayout(new BorderLayout());
		this.add(container);
		
		// 创建顶部面板，用于放置图片和菜单栏
		JPanel panel1=new JPanel();
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS)); // 使用BoxLayout布局管理器
		container.add(panel1,BorderLayout.NORTH);
		
		
		// 加载图片并创建JLabel显示图片
		ImageIcon icon = new ImageIcon("src/zhuyemian/R-C.png"); // 替换为你的图片路径
        JLabel imageLabel = new JLabel(icon);
        imageLabel.setAlignmentX(0.0f); // 将图片对齐到左侧
        imageLabel.setMinimumSize(new Dimension(1,1));
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
		ActionListener listener=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String cmd=e.getActionCommand();
				
			}
		};
		
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
				// 给菜单项注册动作监听器，监听菜单项的点击事件，也就是动作事件
				menuItem.addActionListener(listener);
			}
		}
		
        panel1.add(imageLabel);// 将图片和菜单栏添加到顶部面板
        panel1.add(Box.createHorizontalGlue()); // 添加填充，使菜单栏靠右
        panel1.add(menuBar);
	}
	
	private class MenuMouseListener extends MouseAdapter {
        @Override
        public void mouseEntered(MouseEvent e) {
            ((JMenu) e.getSource()).setBackground(Color.BLUE);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            ((JMenu) e.getSource()).setBackground(null);
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getClickCount() == 2) { // 双击
                ((JMenu) e.getSource()).setBackground(Color.BLUE);
            }
        }
    }

	public static void main(String[] args) {
		zhuyemian from=new zhuyemian();
		from.setVisible(true);
	}
	
}


