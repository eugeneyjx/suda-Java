package integrated;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class WriteFrame extends JFrame {
    WriteFrame() {
        super("写文件操作");
        setSize(600,400);
        getContentPane().setLayout(new GridLayout(3,1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p1 = new JPanel(new BorderLayout());
        JLabel info = new JLabel("请在下列文本区域中输入内容");
        p1.add(info,"West");

        JTextField tf = new JTextField();

        JPanel p3 = new JPanel();
        JButton btn_cut = new JButton("剪切");
        JButton btn_copy = new JButton("复制");
        JButton btn_select = new JButton("全选");
        JButton btn_paste = new JButton("粘贴");
        JButton btn1 = new JButton("保存");
        JButton btn2 = new JButton("关闭");
        btn1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFileChooser fc = new JFileChooser();
                        fc.showSaveDialog(p3.getParent());
                        File newFile = fc.getSelectedFile();
                        OutputStreamWriter osw;
                        try {
                            osw = new OutputStreamWriter(new FileOutputStream(newFile));
                            String text = tf.getText();
                            osw.write(text, 0, text.length());
                            osw.flush();
                            osw.close();
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
        p3.add(btn_cut);
        p3.add(btn_copy);
        p3.add(btn_select);
        p3.add(btn_paste);
        p3.add(btn1); p3.add(btn2);

        add(p1);
        add(tf);
        add(p3);
        setVisible(true);
    }
    public static void main(String args[]) {
        new WriteFrame();
    }
}
