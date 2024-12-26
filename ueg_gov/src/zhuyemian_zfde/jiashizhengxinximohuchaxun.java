package zhuyemian_zfde;

import entity.driving;
import entity.visa;
import service.Impl.drivingServiceImpl;
import util.LanguageUtil;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.ResourceBundle;

public class jiashizhengxinximohuchaxun extends JFrame {
    public jiashizhengxinximohuchaxun() {
     ResourceBundle rs= LanguageUtil.rb;

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
        this.setSize(700,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle(rs.getString("PageTitle"));

        this.setLayout(new FlowLayout());
        String items[] = {rs.getString("dtype"),rs.getString("dtime"),rs.getString("daddress"),rs.getString("cid")};
        JComboBox<String> box = new JComboBox<>(items);
        box.setPreferredSize(new Dimension(109, 30));
        this.add(box);

        JTextField kuang = new JTextField();
        kuang.setPreferredSize(new Dimension(109, 30));
        this.add(kuang);

        JButton btnSearch = new JButton(rs.getString("query"));
        btnSearch.setPreferredSize(new Dimension(100, 30));
        this.add(btnSearch);


        Object a[]={rs.getString("did"),rs.getString("dtype"),rs.getString("dtime"),rs.getString("cid"),rs.getString("daddress")};
        Object b[][]=new Object[5][5];
        DefaultTableModel model = new DefaultTableModel(b,a);
        JTable table = new JTable(model);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.setDefaultRenderer(Object.class, centerRenderer);
        table.setAutoCreateRowSorter(true);
        add(table);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(500,370));
        this.add(scrollPane);

        drivingServiceImpl dsi=new drivingServiceImpl();
        btnSearch.addActionListener(e->{
            model.setRowCount(0);

            switch (box.getSelectedIndex()){
                case 0:
                    String bs1=kuang.getText().toString();
                   List<driving> vl2=dsi.findByDtype(bs1);
                    Object c1[][]=new Object[vl2.size()][5];
                    for(int i=0;i<vl2.size();i++){
                        for(int j=0;j<=4;j++){
                            switch(j){
                                case 0:c1[i][j]=vl2.get(i).getDid();break;
                                case 1:c1[i][j]=vl2.get(i).getDtype();break;
                                case 2:c1[i][j]=vl2.get(i).getDtime();break;
                                case 3:c1[i][j]=vl2.get(i).getCid();break;
                                case 4:c1[i][j]=vl2.get(i).getDaddress();break;
                            }
                        }
                        model.addRow(c1[i]);
                    }
                    table.setModel(model);
                    break;
                case 1:
                    String bs2=kuang.getText();
                   List<driving> vl3=dsi.findByDtime(bs2);
                    Object c2[][]=new Object[vl3.size()][5];
                    for(int i=0;i<vl3.size();i++){
                        for(int j=0;j<=4;j++){
                            switch(j){
                                case 0:c2[i][j]=vl3.get(i).getDid();break;
                                case 1:c2[i][j]=vl3.get(i).getDtype();break;
                                case 2:c2[i][j]=vl3.get(i).getDtime();break;
                                case 3:c2[i][j]=vl3.get(i).getCid();break;
                                case 4:c2[i][j]=vl3.get(i).getDaddress();break;
                            }
                        }
                        model.addRow(c2[i]);
                    }
                    table.setModel(model);
                    break;
                case 2:
                    String bs3=kuang.getText();
                    List<driving> vl4=dsi.findByDaddress(Integer.parseInt(bs3));
                    Object c3[][]=new Object[vl4.size()][5];
                    for(int i=0;i<vl4.size();i++){
                        for(int j=0;j<=4;j++){
                            switch(j){
                                case 0:c3[i][j]=vl4.get(i).getDid();break;
                                case 1:c3[i][j]=vl4.get(i).getDtype();break;
                                case 2:c3[i][j]=vl4.get(i).getDtime();break;
                                case 3:c3[i][j]=vl4.get(i).getCid();break;
                                case 4:c3[i][j]=vl4.get(i).getDaddress();break;
                            }
                        }
                        model.addRow(c3[i]);
                    }
                    table.setModel(model);
                    break;
                case 3:
                    long bs4=Long.parseLong(kuang.getText());
                    List<driving> vl5=dsi.findByCid(bs4);
                    Object c4[][]=new Object[vl5.size()][5];
                    for(int i=0;i<vl5.size();i++){
                        for(int j=0;j<=4;j++){
                            switch(j){
                                case 0:c4[i][j]=vl5.get(i).getDid();break;
                                case 1:c4[i][j]=vl5.get(i).getDtype();break;
                                case 2:c4[i][j]=vl5.get(i).getDtime();break;
                                case 3:c4[i][j]=vl5.get(i).getCid();break;
                                case 4:c4[i][j]=vl5.get(i).getDaddress();break;
                            }
                        }
                        model.addRow(c4[i]);
                    }
                    table.setModel(model);
                    break;
            }

        });
    }

    public static void main(String[] args) {
        LanguageUtil a=new LanguageUtil("zh");
        new jiashizhengxinximohuchaxun().setVisible(true);
    }

}


