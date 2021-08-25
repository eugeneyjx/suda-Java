package experiment1;

import javax.swing.JOptionPane;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=JOptionPane.showInputDialog("«Î ‰»În:");
		int n=Integer.parseInt(str);
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			sum+=Math.pow(2, i);
		}
		System.out.print(sum);
	}

}
