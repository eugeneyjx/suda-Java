package experiment1;

import javax.swing.*;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=JOptionPane.showInputDialog("请输入梯形的上底:");
		double x=Double.parseDouble(str); //上底
		str=JOptionPane.showInputDialog("请输入梯形的下底:");
		double y=Double.parseDouble(str); //下底
		str=JOptionPane.showInputDialog("请输入梯形的高:");
		double z=Double.parseDouble(str); //高
		double s=(x+y)*z/2;//计算梯形面积
		JOptionPane.showMessageDialog(null,"面积="+s);
		}
	}