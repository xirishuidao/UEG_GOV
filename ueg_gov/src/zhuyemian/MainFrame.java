package zhuyemian;

import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Main Page");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 可以添加更多的组件和布局
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
        });
    }

    public void showAnotherPage() {
        JFrame anotherFrame = new JFrame("Another Page");
        anotherFrame.setSize(300, 200);
        anotherFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // 添加另一个页面的组件
        anotherFrame.setVisible(true);
    }
}