package zhuyemian;

import service.Impl.workServiceImpl;
import util.cidBaseUtil;

import javax.swing.*;
import java.awt.*;

public class ZhiyePanel extends JPanel {

    public ZhiyePanel() {




        setLayout(null);
        setPreferredSize(new Dimension(700, 600));
        setBackground(Color.white);

        JLabel zhiye = new JLabel("职业信息");
        zhiye.setForeground(Color.BLACK);
        zhiye.setFont(new Font("微软雅黑", Font.BOLD + Font.ITALIC, 34));
        zhiye.setBounds(460, 10, 360, 70);
        add(zhiye);

        JLabel renzhi = new JLabel("任职信息:");
        renzhi.setForeground(Color.BLACK);
        renzhi.setFont(new Font("微软雅黑", Font.BOLD, 27));
        renzhi.setBounds(70, 100, 360, 70);
        add(renzhi);

        JTextField renzhi_ = new JTextField();
        renzhi_.setBounds(240, 120, 360, 40);
        add(renzhi_);

        JLabel dizhi = new JLabel("工作地址:");
        dizhi.setForeground(Color.BLACK);
        dizhi.setFont(new Font("微软雅黑", Font.BOLD, 27));
        dizhi.setBounds(70, 200, 360, 70);
        add(dizhi);

        JTextField dizhi_ = new JTextField();
        dizhi_.setBounds(240, 220, 360, 40);
        add(dizhi_);

        JLabel danwei = new JLabel("单位:");
        danwei.setForeground(Color.BLACK);
        danwei.setFont(new Font("微软雅黑", Font.BOLD, 27));
        danwei.setBounds(70, 300, 360, 70);
        add(danwei);

        JTextField danwei_ = new JTextField();
        danwei_.setBounds(240, 320, 360, 40);
        add(danwei_);

        JLabel dengji = new JLabel("职业等级:");
        dengji.setForeground(Color.BLACK);
        dengji.setFont(new Font("微软雅黑", Font.BOLD, 27));
        dengji.setBounds(70, 393, 360, 70);
        add(dengji);

        JTextField dengji_ = new JTextField();
        dengji_.setBounds(240, 419, 360, 40);
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

        workServiceImpl workService = new workServiceImpl();
        renzhi_.setText(workService.findwname(cidBaseUtil.cid));
        dizhi_.setText(workService.findwaddress(cidBaseUtil.cid));
        danwei_.setText(workService.findwcompany(cidBaseUtil.cid));
        dengji_.setText(workService.findwlevel(cidBaseUtil.cid));
        //a
    }


}
