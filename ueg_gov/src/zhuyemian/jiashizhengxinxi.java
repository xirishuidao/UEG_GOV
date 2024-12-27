package zhuyemian;

import entity.driving;
import service.Impl.drivingServiceImpl;
import util.LanguageUtil;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import java.util.ResourceBundle;

public class jiashizhengxinxi extends JPanel {
    public jiashizhengxinxi() {



        setLayout(null);
        setPreferredSize(new Dimension(700, 600));
        setBackground(Color.white);

        ResourceBundle rs= LanguageUtil.rb;

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
                    java.util.List<driving> vl2=dsi.findByDtype(bs1);
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
                    java.util.List<driving> vl3=dsi.findByDtime(bs2);
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
                    java.util.List<driving> vl4=dsi.findByDaddress(Integer.parseInt(bs3));
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
    }


