package zhuyemian_zfde;

import service.Impl.workServiceImpl;
import util.LanguageUtil;

import javax.swing.*;
import java.awt.*;
import java.util.ResourceBundle;


public class zhiye_zfde extends JPanel {

    public zhiye_zfde() {
        ResourceBundle rs= LanguageUtil.rb;
        workServiceImpl workServiceImpl = new workServiceImpl();
        setLayout(null);
        setPreferredSize(new Dimension(700, 600));
        setBackground(Color.white);

        JLabel zhiye = new JLabel(rs.getString("listWorkPageR0"));
        zhiye.setForeground(Color.BLACK);
        zhiye.setFont(new Font("微软雅黑", Font.BOLD + Font.ITALIC, 34));
        zhiye.setBounds(460, 10, 360, 70);
        add(zhiye);

        JLabel renzhi = new JLabel(rs.getString("wname"));
        renzhi.setForeground(Color.BLACK);
        renzhi.setFont(new Font("微软雅黑", Font.BOLD, 27));
        renzhi.setBounds(70, 100, 360, 70);
        add(renzhi);

        JTextField renzhi_ = new JTextField();
        renzhi_.setBounds(440, 120, 360, 40);
        add(renzhi_);

        JLabel dizhi = new JLabel(rs.getString("waddress"));
        dizhi.setForeground(Color.BLACK);
        dizhi.setFont(new Font("微软雅黑", Font.BOLD, 27));
        dizhi.setBounds(70, 200, 360, 70);
        add(dizhi);

        JTextField dizhi_ = new JTextField();
        dizhi_.setBounds(440, 220, 360, 40);
        add(dizhi_);

        JLabel danwei = new JLabel(rs.getString("wcompany"));
        danwei.setForeground(Color.BLACK);
        danwei.setFont(new Font("微软雅黑", Font.BOLD, 27));
        danwei.setBounds(70, 300, 360, 70);
        add(danwei);

        JTextField danwei_ = new JTextField();
        danwei_.setBounds(440, 320, 360, 40);
        add(danwei_);

        JLabel dengji = new JLabel(rs.getString("wlevel"));
        dengji.setForeground(Color.BLACK);
        dengji.setFont(new Font("微软雅黑", Font.BOLD, 27));
        dengji.setBounds(70, 393, 360, 70);
        add(dengji);

        JTextField dengji_ = new JTextField();
        dengji_.setBounds(440, 417, 360, 40);
        add(dengji_);

        JLabel x1 = new JLabel("|");
        x1.setForeground(Color.cyan);
        x1.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x1.setBounds(36, 100, 360, 70);
        add(x1);

        JLabel x2 = new JLabel("|");
        x2.setForeground(Color.cyan);
        x2.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x2.setBounds(36, 200, 360, 70);
        add(x2);

        JLabel x3 = new JLabel("|");
        x3.setForeground(Color.cyan);
        x3.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x3.setBounds(36, 300, 360, 70);
        add(x3);

        JLabel x4 = new JLabel("|");
        x4.setForeground(Color.cyan);
        x4.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x4.setBounds(36, 400, 360, 70);
        add(x4);

        JLabel shenfenzhenghao = new JLabel(rs.getString("cid"));
        shenfenzhenghao.setForeground(Color.BLACK);
        shenfenzhenghao.setFont(new Font("微软雅黑", Font.BOLD, 27));
        shenfenzhenghao.setBounds(70, 499, 360, 70);
        add(shenfenzhenghao);

        JTextField shenfenzhenghao_ = new JTextField();
        shenfenzhenghao_.setBounds(440, 516, 360, 40);
        add(shenfenzhenghao_);

        JLabel x5 = new JLabel("|");
        x5.setForeground(Color.cyan);
        x5.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x5.setBounds(36, 499, 360, 70);
        add(x5);


        JButton btnSearch = new JButton(rs.getString("query"));
        btnSearch.setBounds(200, 630, 100, 30);
        add(btnSearch);

        JButton btnAdd = new JButton(rs.getString("insert"));
        btnAdd.setBounds(350, 630, 100, 30);
        add(btnAdd);

        JButton btnDelete = new JButton(rs.getString("delete"));
        btnDelete.setBounds(500, 630, 100, 30);
        add(btnDelete);

        JButton btnUpdate = new JButton(rs.getString("update"));
        btnUpdate.setBounds(650, 630, 100, 30);
        add(btnUpdate);

/*
        JButton btnMoHuSearch = new JButton("模糊查询");
        btnMoHuSearch.setBounds(801, 630, 100, 30);
        add(btnMoHuSearch);*/

        btnSearch.addActionListener(e -> {

            long id= Long.parseLong(shenfenzhenghao_.getText());
            renzhi_.setText(workServiceImpl.findwname(id));
            dizhi_.setText(workServiceImpl.findwaddress(id));
            danwei_.setText(workServiceImpl.findwcompany(id));
            dengji_.setText(workServiceImpl.findwlevel(id));
        });
        /*public int update(long cid, String wname, String wlevel, String waddress, String wcompany) {*/

        btnAdd.addActionListener(e -> {
            long id= Long.parseLong(shenfenzhenghao_.getText());
            String wnamex= renzhi_.getText();
            String waddressx= dizhi_.getText();
            String wcompanyx= danwei_.getText();
            String wlevelx= dengji_.getText();
            workServiceImpl.insert(id,wnamex,wlevelx,waddressx,wcompanyx);
        });


        btnDelete.addActionListener(e -> {
            long id= Long.parseLong(shenfenzhenghao_.getText());
            workServiceImpl.delete(id);
        });


        btnUpdate.addActionListener(e -> {
            long id= Long.parseLong(shenfenzhenghao_.getText());
            String wnamex= renzhi_.getText();
            String waddressx= dizhi_.getText();
            String wcompanyx= danwei_.getText();
            String wlevelx= dengji_.getText();
            workServiceImpl.update(id,wnamex,wlevelx,waddressx,wcompanyx);
        });

        //btnMoHuSearch.addActionListener(e -> {new zhiyemohuchaxun().setVisible(true);});


    }
}
//**//a