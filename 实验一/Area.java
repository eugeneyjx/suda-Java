package experiment1;

import javax.swing.*;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=JOptionPane.showInputDialog("���������ε��ϵ�:");
		double x=Double.parseDouble(str); //�ϵ�
		str=JOptionPane.showInputDialog("���������ε��µ�:");
		double y=Double.parseDouble(str); //�µ�
		str=JOptionPane.showInputDialog("���������εĸ�:");
		double z=Double.parseDouble(str); //��
		double s=(x+y)*z/2;//�����������
		JOptionPane.showMessageDialog(null,"���="+s);
		}
	}