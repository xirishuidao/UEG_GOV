package zhuyemian_zfde;

import util.LanguageUtil;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.util.ResourceBundle;
import java.util.Vector;

public class zhiyemohuchaxun extends JFrame {
    public zhiyemohuchaxun() {
        ResourceBundle rs= LanguageUtil.rb;
        this.setSize(700,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
        setTitle(rs.getString("PageTitle"));

        this.setLayout(new FlowLayout());
        String items[] = {rs.getString("wname"),rs.getString("wlevel"),rs.getString("waddress"),rs.getString("wcompany")};
        JComboBox<String> box = new JComboBox<>(items);
        box.setPreferredSize(new Dimension(109, 30));
        this.add(box);

        JTextField kuang = new JTextField();
        kuang.setPreferredSize(new Dimension(109, 30));
        this.add(kuang);

        JButton btnSearch = new JButton(rs.getString("query"));
        btnSearch.setPreferredSize(new Dimension(100, 30));
        this.add(btnSearch);

        JTable table = new JTable();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.setDefaultRenderer(Object.class, centerRenderer);
        table.setAutoCreateRowSorter(true);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(500,370));
        this.add(scrollPane);

        btnSearch.addActionListener(e->{

        });
    }
    public static void main(String[] args) {
        new zhiyemohuchaxun().setVisible(true);
    }

}
