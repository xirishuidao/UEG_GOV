package zhuyemian;

import javax.swing.*;
import java.awt.*;

public class kuaquyuxukezhengxinxi extends JPanel {


    public kuaquyuxukezhengxinxi() {
        setLayout(null);
        setPreferredSize(new Dimension(700, 600));
        setBackground(Color.white);

        JLabel kuaquyuxukezhengxinxi = new JLabel("跨区域许可证信息");
        kuaquyuxukezhengxinxi.setForeground(Color.BLACK);
        kuaquyuxukezhengxinxi.setFont(new Font("微软雅黑", Font.BOLD+Font.ITALIC, 34));
        kuaquyuxukezhengxinxi.setBounds(460, 10, 360, 70);
        add(kuaquyuxukezhengxinxi);

        JLabel di = new JLabel("到达地");
        di.setForeground(Color.BLACK);
        di.setFont(new Font("微软雅黑", Font.BOLD, 27));
        di.setBounds(70, 70, 360, 70);
        add(di);

        JLabel bianhao = new JLabel("许可证编号");
        bianhao.setForeground(Color.BLACK);
        bianhao.setFont(new Font("微软雅黑", Font.BOLD, 27));
        bianhao.setBounds(70, 150, 360, 70);
        add(bianhao);

        JLabel shi = new JLabel("开始日期");
        shi.setForeground(Color.BLACK);
        shi.setFont(new Font("微软雅黑", Font.BOLD, 27));
        shi.setBounds(70, 230, 360, 70);
        add(shi);

        JLabel zhong = new JLabel("终止日期");
        zhong.setForeground(Color.BLACK);
        zhong.setFont(new Font("微软雅黑", Font.BOLD, 27));
        zhong.setBounds(70, 310, 360, 70);
        add(zhong);

        JLabel xu = new JLabel("许可证状态");
        xu.setForeground(Color.BLACK);
        xu.setFont(new Font("微软雅黑", Font.BOLD, 27));
        xu.setBounds(70, 400, 360, 70);
        add(xu);

        JLabel x1 = new JLabel("|");
        x1.setForeground(Color.cyan);
        x1.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x1.setBounds(36, 70, 360, 70);
        add(x1);

        JLabel x2 = new JLabel("|");
        x2.setForeground(Color.cyan);
        x2.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x2.setBounds(36, 150, 360, 70);
        add(x2);

        JLabel x3 = new JLabel("|");
        x3.setForeground(Color.cyan);
        x3.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x3.setBounds(36, 230, 360, 70);
        add(x3);

        JLabel x4 = new JLabel("|");
        x4.setForeground(Color.cyan);
        x4.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x4.setBounds(36, 310, 360, 70);
        add(x4);

        JLabel x5 = new JLabel("|");
        x5.setForeground(Color.cyan);
        x5.setFont(new Font("微软雅黑", Font.BOLD, 36));
        x5.setBounds(36, 400, 360, 70);
        add(x5);
    }

}
