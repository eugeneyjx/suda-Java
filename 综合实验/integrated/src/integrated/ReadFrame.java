package integrated;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ReadFrame extends JFrame{
    ReadFrame() {
        super("���ļ�����");
        setSize(600,400);
        getContentPane().setLayout(new GridLayout(3,1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p1 = new JPanel();
        JLabel info = new JLabel("����ļ��������ݵ������ı�������");
        JButton btn1 = new JButton("���ļ�");

        p1.add(info);
        p1.add(btn1);

        JTextField tf = new JTextField();

        JPanel p3 = new JPanel();
        JButton btn_cut = new JButton("����");
        JButton btn_copy = new JButton("����");
        JButton btn_select = new JButton("ȫѡ");
        JButton btn_paste = new JButton("ճ��");
        JButton btn2 = new JButton("�ر�");
        p3.add(btn_cut);
        p3.add(btn_copy);
        p3.add(btn_select);
        p3.add(btn_paste);
        p3.add(btn2);

        btn1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFileChooser fc = new JFileChooser();
                        fc.showOpenDialog(p1.getParent());
                        try {
                            BufferedInputStream in=new BufferedInputStream(new FileInputStream(fc.getSelectedFile()));
                            byte[]b=new byte[in.available()];
                            in.read(b,0,b.length);
                            tf.setText(new String(b,0,b.length));
                            in.close();
                        } catch (FileNotFoundException fileNotFoundException) {
                            fileNotFoundException.printStackTrace();
                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                        }
                    }
                }
        );

        btn2.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dispose();
                    }
                }
        );
        btn_cut.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        tf.cut();
                    }
                }
        );
        btn_copy.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        tf.copy();
                    }
                }
        );
        btn_select.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        tf.selectAll();
                    }
                }
        );
        btn_paste.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        tf.paste();
                    }
                }
        );
        add(p1);
        add(tf);
        add(p3);

        setVisible(true);
    }
    public static void main(String args[]) {
        new ReadFrame();
    }
}
