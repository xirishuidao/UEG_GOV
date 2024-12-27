package zhuyemian;




import service.Impl.citizenServiceImpl;
import service.Impl.domicileServiceImpl;
import util.LanguageUtil;
import util.cidBaseUtil;

import javax.swing.*;
import java.awt.*;
import java.util.ResourceBundle;

public class gerenxinxi extends  JPanel{
    public gerenxinxi() {

        ResourceBundle rs= LanguageUtil.rb;
        setLayout(null);
        setPreferredSize(new Dimension(700, 600));
        setBackground(Color.white);

        // 添加个人信息标签
        JLabel gerenxinxi = new JLabel(rs.getString("listDomiPageR0"));
        gerenxinxi.setForeground(Color.BLACK);
        gerenxinxi.setFont(new Font("微软雅黑", Font.BOLD+Font.ITALIC, 34));
        gerenxinxi.setBounds(460, 10, 360, 70);
        add(gerenxinxi);

        JLabel shenfenzhenghao = new JLabel(rs.getString("cid"));
        shenfenzhenghao.setForeground(Color.BLACK);
        shenfenzhenghao.setFont(new Font("微软雅黑", Font.BOLD, 27));
        shenfenzhenghao.setBounds(70, 70, 360, 70);
        add(shenfenzhenghao);

        JTextField shenfenzhenghao_ = new JTextField();
        shenfenzhenghao_.setBounds(440, 90, 360, 40);
        add(shenfenzhenghao_);

        JLabel xingming = new JLabel(rs.getString("cname"));
        xingming.setForeground(Color.BLACK);
        xingming.setFont(new Font("微软雅黑", Font.BOLD, 27));
        xingming.setBounds(70, 130, 360, 70);
        add(xingming);

        JTextField xingming_ = new JTextField();
        xingming_.setBounds(440, 150, 360, 40);
        add(xingming_);

        JLabel xingbie = new JLabel(rs.getString("cgender"));
        xingbie.setForeground(Color.BLACK);
        xingbie.setFont(new Font("微软雅黑", Font.BOLD, 27));
        xingbie.setBounds(70, 190, 360, 70);
        add(xingbie);

        JTextField xingbie_ = new JTextField();
        xingbie_.setBounds(440, 209, 360, 40);
        add(xingbie_);

        JLabel nianyue = new JLabel(rs.getString("ctime"));
        nianyue.setForeground(Color.BLACK);
        nianyue.setFont(new Font("微软雅黑", Font.BOLD, 27));
        nianyue.setBounds(70, 250, 360, 70);
        add(nianyue);

        JTextField nianyue_ = new JTextField();
        nianyue_.setBounds(440, 270, 360, 40);
        add(nianyue_);

        JLabel huji = new JLabel(rs.getString("caddress"));
        huji.setForeground(Color.BLACK);
        huji.setFont(new Font("微软雅黑", Font.BOLD, 27));
        huji.setBounds(70, 313, 360, 70);
        add(huji);

        JTextField huji_ = new JTextField();
        huji_.setBounds(440, 330, 360, 40);
        add(huji_);

        JLabel xueli = new JLabel(rs.getString("cdegree"));
        xueli.setForeground(Color.BLACK);
        xueli.setFont(new Font("微软雅黑", Font.BOLD, 27));
        xueli.setBounds(70, 370, 360, 70);
        add(xueli);

        JTextField xueli_ = new JTextField();
        xueli_.setBounds(440, 390, 360, 40);
        add(xueli_);

        JLabel diqu = new JLabel(rs.getString("ccountry"));
        diqu.setForeground(Color.BLACK);
        diqu.setFont(new Font("微软雅黑", Font.BOLD, 27));
        diqu.setBounds(70, 443, 360, 70);
        add(diqu);

        JTextField diqu_ = new JTextField();
        diqu_.setBounds(440, 463, 360, 40);
        add(diqu_);

        JLabel x1 = new JLabel("|");
        x1.setForeground(Color.cyan);
        x1.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x1.setBounds(36, 70, 360, 70);
        add(x1);

        JLabel x2 = new JLabel("|");
        x2.setForeground(Color.cyan);
        x2.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x2.setBounds(36, 130, 360, 70);
        add(x2);

        JLabel x3 = new JLabel("|");
        x3.setForeground(Color.cyan);
        x3.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x3.setBounds(36, 190, 360, 70);
        add(x3);

        JLabel x4 = new JLabel("|");
        x4.setForeground(Color.cyan);
        x4.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x4.setBounds(36, 250, 360, 70);
        add(x4);

        JLabel x5 = new JLabel("|");
        x5.setForeground(Color.cyan);
        x5.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x5.setBounds(36, 310, 360, 70);
        add(x5);

        JLabel x6 = new JLabel("|");
        x6.setForeground(Color.cyan);
        x6.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x6.setBounds(36, 370, 360, 70);
        add(x6);

        JLabel x7 = new JLabel("|");
        x7.setForeground(Color.cyan);
        x7.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x7.setBounds(36, 443, 360, 70);
        add(x7);

        domicileServiceImpl domicileService = new domicileServiceImpl();
        shenfenzhenghao_.setText(String.valueOf(cidBaseUtil.cid));
        xingming_.setText(domicileService.getcname(cidBaseUtil.cid));
        xingbie_.setText(domicileService.getcgender(cidBaseUtil.cid));
        nianyue_.setText(domicileService.getcdatetime(cidBaseUtil.cid));
        huji_.setText(domicileService.getcaddress(cidBaseUtil.cid));
        xueli_.setText(domicileService.getcdegree(cidBaseUtil.cid));
        diqu_.setText(String.valueOf(domicileService.getccountry(cidBaseUtil.cid)));
    }


}

