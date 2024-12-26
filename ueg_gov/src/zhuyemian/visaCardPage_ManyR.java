package zhuyemian;

import entity.visa;
import service.Impl.visaServiceImpl;
import util.DataBaseUtil;
import util.LanguageUtil;
import util.cidBaseUtil;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.util.List;
import java.util.ResourceBundle;

public class visaCardPage_ManyR extends JPanel{
    public visaCardPage_ManyR() {
        ResourceBundle rs=LanguageUtil.rb;
        JLabel kuaquyuxukezhengxinxi = new JLabel(rs.getString("listVisaPageR0"));
        kuaquyuxukezhengxinxi.setForeground(Color.BLACK);
        kuaquyuxukezhengxinxi.setFont(new Font("微软雅黑", Font.BOLD+Font.ITALIC, 34));
        kuaquyuxukezhengxinxi.setBounds(590, 0, 360, 60);
        add(kuaquyuxukezhengxinxi);

       visaServiceImpl vsi=new visaServiceImpl();

        setLayout(null);
        setPreferredSize(new Dimension(1200, 600));
        setBackground(Color.white);

        String items[] = {rs.getString("vname"),rs.getString("vsdate"),rs.getString("vedate"), rs.getString("vstate"),rs.getString("listVisaPageR0")};
        JComboBox<String> box = new JComboBox<>(items);
        box.setBounds(460, 70, 360, 30);
        this.add(box);

        JTextField kuang = new JTextField();
        kuang.setBounds(460, 110, 360, 30);
        this.add(kuang);

        JButton btnSearch = new JButton(rs.getString("listVisaPageR2"));
        btnSearch.setBounds(460, 150, 360, 30);
        this.add(btnSearch);


        List<visa> vl1=vsi.findId(1);
        Object a[]={rs.getString("cid"),rs.getString("vid"),rs.getString("vname"),rs.getString("vsdate"),rs.getString("vedate"),rs.getString("vstate")};
        Object b[][]=new Object[vl1.size()][6];
        for(int i=0;i<vl1.size();i++){
            for(int j=0;j<=5;j++){
                if(vl1.get(i).getCid()!= cidBaseUtil.cid) {
                    break;
                }
                switch(j){
                    case 0:b[i][j]=vl1.get(i).getCid();break;
                    case 1:b[i][j]=vl1.get(i).getVid();break;
                    case 2:b[i][j]=vl1.get(i).getVname();break;
                    case 3:b[i][j]=vl1.get(i).getVsdate();break;
                    case 4:b[i][j]=vl1.get(i).getVedate();break;
                    case 5:b[i][j]=vl1.get(i).getVstate();break;
                }
            }

        }
        DefaultTableModel model = new DefaultTableModel(b,a);
        JTable table = new JTable(model);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.setDefaultRenderer(Object.class, centerRenderer);
        table.setAutoCreateRowSorter(true);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(225, 200, 800, 400);


        this.add(scrollPane);

        JButton btnChange1 = new JButton(rs.getString("listVisaPageR1"));
        btnChange1.setBounds(550, 630, 200, 50);
        this.add(btnChange1);


        btnSearch.addActionListener(e->{
            model.setRowCount(0);
        switch (box.getSelectedIndex()){
            case 0:
                int bs1=Integer.parseInt(kuang.getText().toString());
                List<visa> vl2=vsi.findCountry(bs1);
                Object c1[][]=new Object[vl2.size()][6];
                for(int i=0;i<vl2.size();i++){
                    for(int j=0;j<=5;j++){
                        if(vl2.get(i).getCid()!= cidBaseUtil.cid) {
                            break;
                        }
                        switch(j){
                            case 0:c1[i][j]=vl2.get(i).getCid();break;
                            case 1:c1[i][j]=vl2.get(i).getVid();break;
                            case 2:c1[i][j]=vl2.get(i).getVname();break;
                            case 3:c1[i][j]=vl2.get(i).getVsdate();break;
                            case 4:c1[i][j]=vl2.get(i).getVedate();break;
                            case 5:c1[i][j]=vl2.get(i).getVstate();break;
                        }
                    }
                    model.addRow(c1[i]);
                }
                table.setModel(model);
                break;
            case 1:
                String bs2=kuang.getText();
                List<visa> vl3=vsi.findsdate(bs2);
                Object c2[][]=new Object[vl3.size()][6];
                for(int i=0;i<vl3.size();i++){
                    for(int j=0;j<=5;j++){
                        if(vl3.get(i).getCid()!= cidBaseUtil.cid) {
                            break;
                        }
                        switch(j){
                            case 0:c2[i][j]=vl3.get(i).getCid();break;
                            case 1:c2[i][j]=vl3.get(i).getVid();break;
                            case 2:c2[i][j]=vl3.get(i).getVname();break;
                            case 3:c2[i][j]=vl3.get(i).getVsdate();break;
                            case 4:c2[i][j]=vl3.get(i).getVedate();break;
                            case 5:c2[i][j]=vl3.get(i).getVstate();break;
                        }
                    }
                    model.addRow(c2[i]);
                }
                table.setModel(model);
                break;
            case 2:
                String bs3=kuang.getText();
                List<visa> vl4=vsi.findedate(bs3);
                Object c3[][]=new Object[vl4.size()][6];
                for(int i=0;i<vl4.size();i++){
                    for(int j=0;j<=5;j++){
                        if(vl4.get(i).getCid()!= cidBaseUtil.cid) {
                            break;
                        }
                        switch(j){
                            case 0:c3[i][j]=vl4.get(i).getCid();break;
                            case 1:c3[i][j]=vl4.get(i).getVid();break;
                            case 2:c3[i][j]=vl4.get(i).getVname();break;
                            case 3:c3[i][j]=vl4.get(i).getVsdate();break;
                            case 4:c3[i][j]=vl4.get(i).getVedate();break;
                            case 5:c3[i][j]=vl4.get(i).getVstate();break;
                        }
                    }
                    model.addRow(c3[i]);
                }
                table.setModel(model);
                break;
            case 3:
                int bs4=Integer.parseInt(kuang.getText());
                List<visa> vl5=vsi.findState(bs4);
                Object c4[][]=new Object[vl5.size()][6];
                for(int i=0;i<vl5.size();i++){
                    for(int j=0;j<=5;j++){
                        if(vl5.get(i).getCid()!= cidBaseUtil.cid) {
                        break;
                        }
                        switch (j) {
                                case 0:
                                    c4[i][j] = vl5.get(i).getCid();
                                    break;
                                case 1:
                                    c4[i][j] = vl5.get(i).getVid();
                                    break;
                                case 2:
                                    c4[i][j] = vl5.get(i).getVname();
                                    break;
                                case 3:
                                    c4[i][j] = vl5.get(i).getVsdate();
                                    break;
                                case 4:
                                    c4[i][j] = vl5.get(i).getVedate();
                                    break;
                                case 5:
                                    c4[i][j] = vl5.get(i).getVstate();
                                    break;
                        }

                    }
                    model.addRow(c4[i]);
                }
                table.setModel(model);
                break;
            case 4:
                List<visa> vl0=vsi.findId(cidBaseUtil.cid);
                Object c0[][]=new Object[vl0.size()][6];
                for(int i=0;i<vl0.size();i++){
                    for(int j=0;j<=5;j++){
                        if(vl0.get(i).getCid()!= cidBaseUtil.cid) {
                            break;
                        }
                        switch(j){
                            case 0:c0[i][j]=vl0.get(i).getCid();break;
                            case 1:c0[i][j]=vl0.get(i).getVid();break;
                            case 2:c0[i][j]=vl0.get(i).getVname();break;
                            case 3:c0[i][j]=vl0.get(i).getVsdate();break;
                            case 4:c0[i][j]=vl0.get(i).getVedate();break;
                            case 5:c0[i][j]=vl0.get(i).getVstate();break;
                        }
                    }
                    model.addRow(c0[i]);
                }
                table.setModel(model);
                break;
        }

        });
        btnChange1.addActionListener(e->{
            visaCardPage_OneR o1=new visaCardPage_OneR(rs);

        });


        setVisible(true);
    }


}
