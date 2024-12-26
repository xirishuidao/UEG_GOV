package zhuyemian_zfde;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class jiashizhengxinximohuchaxun extends JFrame {
    public jiashizhengxinximohuchaxun() {


        this.setSize(700,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("模糊查询");

        this.setLayout(new FlowLayout());
        String items[] = {"驾驶证号", "种类", "注册时间", "注册地点"};
        JComboBox<String> box = new JComboBox<>(items);
        box.setPreferredSize(new Dimension(109, 30));
        this.add(box);

        JTextField kuang = new JTextField();
        kuang.setPreferredSize(new Dimension(109, 30));
        this.add(kuang);

        JButton btnSearch = new JButton("查询");
        btnSearch.setPreferredSize(new Dimension(100, 30));
        this.add(btnSearch);

        JTable table = new JTable();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.setDefaultRenderer(Object.class, centerRenderer);
        table.setAutoCreateRowSorter(true);
        add(table);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(500,370));
        this.add(scrollPane);

        btnSearch.addActionListener(e->{

        });
    }

    public static void main(String[] args) {
        new jiashizhengxinximohuchaxun().setVisible(true);
    }

}


