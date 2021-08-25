package experiment1;

import javax.swing.JOptionPane;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=JOptionPane.showInputDialog("请输入数字:");
		int x=Integer.parseInt(str);
		str=JOptionPane.showInputDialog("请输入需要转换的进制数:");
		int jz=Integer.parseInt(str);
		String result="";
		while(x!=0)
		{
			result=x%jz+result;
			x/=jz;
		}
		System.out.print(result);
	}
}
