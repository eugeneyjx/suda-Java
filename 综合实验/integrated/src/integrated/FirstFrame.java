package integrated;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

public class FirstFrame extends JFrame {
    FirstFrame() {
        super("a complicated java application");
        setSize(600,400);
        getContentPane().setLayout(new GridLayout(3,1));

        JPanel p1 = new JPanel(new BorderLayout());
        JLabel info = new JLabel("��ѡ���������");
        p1.add(info,"West");

        JPanel p2 = new JPanel(new BorderLayout());
        JComboBox cbox = new JComboBox();
        cbox.addItem("д����");
        cbox.addItem("������");
        p2.add(cbox,"North");

        JPanel p3 = new JPanel();
        p3.setLayout(new FlowLayout());
        JButton btn = new JButton("��ʼ");
        btn.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(cbox.getSelectedItem().equals("д����")) {
                            new WriteFrame();
                        }
                        if(cbox.getSelectedItem().equals("������")) {
                            new ReadFrame();
                        }
                    }
                }
        );
        p3.add(btn);

        add(p1);
        add(p2);
        add(p3);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String args[]) {
        new FirstFrame();
    }
}