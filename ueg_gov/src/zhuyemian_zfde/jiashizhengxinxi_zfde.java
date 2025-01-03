package zhuyemian_zfde;

import service.Impl.drivingServiceImpl;
import util.LanguageUtil;

import javax.swing.*;
import java.awt.*;
import java.util.ResourceBundle;

public class jiashizhengxinxi_zfde extends JPanel {
    public jiashizhengxinxi_zfde() {
        ResourceBundle rs= LanguageUtil.rb;

        setLayout(null);
        setPreferredSize(new Dimension(700, 600));
        setBackground(Color.white);

        JLabel jiashizhengxinxi = new JLabel(rs.getString("listDriPageR0"));
        jiashizhengxinxi.setForeground(Color.BLACK);
        jiashizhengxinxi.setFont(new Font("微软雅黑", Font.BOLD+Font.ITALIC, 34));
        jiashizhengxinxi.setBounds(460, 10, 360, 70);
        add(jiashizhengxinxi);


        JLabel shenfenzhenghao = new JLabel(rs.getString("cid"));
        shenfenzhenghao.setForeground(Color.BLACK);
        shenfenzhenghao.setFont(new Font("微软雅黑", Font.BOLD, 27));
        shenfenzhenghao.setBounds(70, 499, 360, 70);
        add(shenfenzhenghao);

        JTextField shenfenzhenghao_ = new JTextField();
        shenfenzhenghao_.setBounds(440, 519, 360, 40);
        add(shenfenzhenghao_);


        JLabel jaishizhenghao = new JLabel(rs.getString("did"));
        jaishizhenghao.setForeground(Color.BLACK);
        jaishizhenghao.setFont(new Font("微软雅黑", Font.BOLD, 27));
        jaishizhenghao.setBounds(70, 100, 360, 70);
        add(jaishizhenghao);

        JTextField jaishizhenghao_ = new JTextField();
        jaishizhenghao_.setBounds(440, 119, 360, 40);
        add(jaishizhenghao_);

        JLabel zhonglei = new JLabel(rs.getString("dtype"));
        zhonglei.setForeground(Color.BLACK);
        zhonglei.setFont(new Font("微软雅黑", Font.BOLD, 27));
        zhonglei.setBounds(70, 200, 360, 70);
        add(zhonglei);

        JTextField zhonglei_ = new JTextField();
        zhonglei_.setBounds(440, 220, 360, 40);
        add(zhonglei_);

        JLabel shijian = new JLabel(rs.getString("dtime"));
        shijian.setForeground(Color.BLACK);
        shijian.setFont(new Font("微软雅黑", Font.BOLD, 27));
        shijian.setBounds(70, 300, 360, 70);
        add(shijian);

        JTextField shijian_ = new JTextField();
        shijian_.setBounds(440, 320, 360, 40);
        add(shijian_);

        JLabel didian = new JLabel(rs.getString("daddress"));
        didian.setForeground(Color.BLACK);
        didian.setFont(new Font("微软雅黑", Font.BOLD, 27));
        didian.setBounds(70, 400, 360, 70);
        add(didian);

        JTextField didian_ = new JTextField();
        didian_.setBounds(440, 416, 360, 40);
        add(didian_);


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


        JLabel x5 = new JLabel("|");
        x5.setForeground(Color.cyan);
        x5.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x5.setBounds(36, 500, 360, 70);
        add(x5);


        JButton btnSearch = new JButton(rs.getString("query"));
        btnSearch.setBounds(200, 564, 100, 30);
        add(btnSearch);

        JButton btnAdd = new JButton(rs.getString("insert"));
        btnAdd.setBounds(350, 564, 100, 30);
        add(btnAdd);

        JButton btnDelete = new JButton(rs.getString("delete"));
        btnDelete.setBounds(500, 564, 100, 30);
        add(btnDelete);

        JButton btnUpdate = new JButton(rs.getString("update"));
        btnUpdate.setBounds(650, 564, 100, 30);
        add(btnUpdate);

        JButton btnMoHuSearch = new JButton(rs.getString("mohu"));
        btnMoHuSearch.setBounds(801, 564, 100, 30);
        add(btnMoHuSearch);

        drivingServiceImpl drivingService = new drivingServiceImpl();
        btnSearch.addActionListener(e -> {
            long id= Long.parseLong(jaishizhenghao_.getText());
            zhonglei_.setText(drivingService.getDtype(id));
            shijian_.setText(drivingService.getDtime(id));
            didian_.setText(String.valueOf(drivingService.getDaddress(id)));
            shenfenzhenghao_.setText(String.valueOf(drivingService.getCid(id)));
        });

        btnAdd.addActionListener(e -> {
            long jaishizhenghaox= Long.parseLong(jaishizhenghao_.getText());
            long shenfenzhenghaox= Long.parseLong(shenfenzhenghao_.getText());
            String zhongleix=zhonglei_.getText();
            String shijianx=shijian_.getText();
            int didianx= Integer.parseInt(didian_.getText());
            drivingService.insert(jaishizhenghaox,zhongleix,shijianx,shenfenzhenghaox,didianx);
        });


        btnDelete.addActionListener(e -> {
            long id= Long.parseLong(jaishizhenghao_.getText());
            drivingService.deleteByDid(id);
        });




        btnUpdate.addActionListener(e -> {
            long jaishizhenghaox= Long.parseLong(jaishizhenghao_.getText());
            long shenfenzhenghaox= Long.parseLong(shenfenzhenghao_.getText());
            String zhongleix=zhonglei_.getText();
            String shijianx=shijian_.getText();
            int didianx= Integer.parseInt(didian_.getText());
            drivingService.update(jaishizhenghaox,zhongleix,shijianx,shenfenzhenghaox,didianx);
        });

        btnMoHuSearch.addActionListener(e -> {new jiashizhengxinximohuchaxun().setVisible(true);});
    }

 ///aaaaa



}


