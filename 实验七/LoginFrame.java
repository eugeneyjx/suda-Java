package experiment7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    public LoginFrame() {
        super("欢迎登陆！");
        setLayout(new GridLayout(3, 3));
        JLabel l1 = new JLabel();
        l1.setText("用户名：");

        JTextField unf = new JTextField();

        JLabel l2 = new JLabel();
        l2.setText("密码：");

        JPasswordField pwdf = new JPasswordField();

        JButton btn1 = new JButton();
        btn1.setText("OK");
        btn1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton tempbtn = (JButton) e.getSource();
                        if (unf.getText().equals("admin")&&pwdf.getText().equals("12345")) {
                            JFrame f = new JFrame();
                            f.setTitle("welcome admin");
                            f.setSize(300,300);
                            f.setVisible(true);
                        }
                        else {
                            JOptionPane.showMessageDialog(tempbtn.getParent(),"用户信息不正确");
                        }
                    }
                }
        );
        
        JButton btn2 = new JButton();
        btn2.setText("Close");
        btn2.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                }
        );
        
        add(l1); add(unf);
        add(l2); add(pwdf);
        add(btn1); add(btn2);
        
        setSize(300,300);
        this.setDefaultCloseOperation((JFrame.DISPOSE_ON_CLOSE));
        setVisible(true);
    }
    public static void main(String args[]) { new LoginFrame(); }
}
