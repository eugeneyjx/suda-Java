package experiment7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculateFrame extends JFrame {
    public CalculateFrame() {
        setLayout(new GridLayout(3,2));
        JTextField tf1 = new JTextField();
        add(tf1);
        JTextField tf2 = new JTextField();
        add(tf2);
        JButton btn1 = new JButton("+");
        add(btn1);
        JButton btn2 = new JButton("*");
        add(btn2);
        JLabel result = new JLabel();
        btn1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    	int n1=Integer.parseInt(tf1.getText()), n2=Integer.parseInt(tf2.getText());
                        result.setText(Integer.toString(n1+n2));
                    }
                }
        );
        btn2.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    	int n1=Integer.parseInt(tf1.getText()), n2=Integer.parseInt(tf2.getText());
                        result.setText(Integer.toString(n1*n2));
                    }
                }
        );
        add(result);
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String args[]) {
        new CalculateFrame();
    }
}
