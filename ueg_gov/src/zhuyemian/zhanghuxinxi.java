package zhuyemian;

import main.pages.warningPage;
import service.Impl.citizenServiceImpl;
import util.DataBaseUtil;
import util.LanguageUtil;
import util.cidBaseUtil;

import javax.swing.*;
import java.awt.*;
import java.util.ResourceBundle;

public class zhanghuxinxi extends JPanel {

    public zhanghuxinxi() {
        ResourceBundle rs=LanguageUtil.rb;
        DataBaseUtil a=new DataBaseUtil();
        citizenServiceImpl impl=new citizenServiceImpl();

        setLayout(null);
        setPreferredSize(new Dimension(700, 600));
        setBackground(Color.white);

        // 添加账户信息标签
        JLabel zhanghuxinxi = new JLabel(rs.getString("listCitizenPageR0"));
        zhanghuxinxi.setForeground(Color.BLACK);
        zhanghuxinxi.setFont(new Font("微软雅黑", Font.BOLD+Font.ITALIC, 34));
        zhanghuxinxi.setBounds(460, 10, 360, 70);
        add(zhanghuxinxi);

        // 添加ID标签
        JLabel ID = new JLabel(rs.getString("cid"));
        ID.setForeground(Color.BLACK);
        ID.setFont(new Font("微软雅黑", Font.BOLD, 27));
        ID.setBounds(70, 130, 360, 70);
        add(ID);


        JTextField ID_ = new JTextField();
        ID_.setBounds(260, 150, 360, 40);
        add(ID_);

        // 添加姓名标签
        JLabel xingming = new JLabel(rs.getString("cname"));
        xingming.setForeground(Color.BLACK);
        xingming.setFont(new Font("微软雅黑", Font.BOLD, 27));
        xingming.setBounds(70, 270, 360, 70);
        add(xingming);

        JTextField xingming_ = new JTextField();
        xingming_.setBounds(260, 290, 360, 40);
        add(xingming_);

        JLabel mima = new JLabel(rs.getString("cpwd"));
        mima.setForeground(Color.BLACK);
        mima.setFont(new Font("微软雅黑", Font.BOLD, 27));
        mima.setBounds(70, 410, 360, 70);
        add(mima);

        JTextField mima_ = new JTextField();
        mima_.setBounds(260, 433, 360, 40);
        add(mima_);


        JLabel x = new JLabel("|");
        x.setForeground(Color.cyan);
        x.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x.setBounds(36, 130, 360, 70);
        add(x);

        JLabel y = new JLabel("|");
        y.setForeground(Color.cyan);
        y.setFont(new Font("微软雅黑", Font.BOLD, 36));
        y.setBounds(36, 270, 360, 70);
        add(y);

        JLabel z = new JLabel("|");
        z.setForeground(Color.cyan);
        z.setFont(new Font("微软雅黑", Font.BOLD, 36));
        z.setBounds(36, 410, 360, 70);
        add(z);


        ID_.setText(String.valueOf(cidBaseUtil.cid));

        xingming_.setText(impl.findname(cidBaseUtil.cid));

        JButton change = new JButton("change");
        change.setBounds(550, 500, 150, 50);
        change.addActionListener(e->{
            if(ID_.getText().equals("")){}
            else {
                long cid = Long.parseLong(ID_.getText());
                String cname = xingming_.getText();
                String cpwd = mima_.getText();
                int row = impl.update(cid, cname, cpwd);
                System.out.println(row);
                if (row == -1) {
                    warningPage.show(LanguageUtil.rb.getString("warningPageTitle"), LanguageUtil.rb.getString("warningPageName"));
                }
            }
        });
        add(change);

        setVisible(true);
    }

}
