package experiment1;

import javax.swing.JOptionPane;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=0,B=0,C=0,D=0,F=0;
		int x=0,sum=0,average,c=0;
		while(x!=-1)
		{
			String str=JOptionPane.showInputDialog("������ѧ���ɼ�:");
			x=Integer.parseInt(str);
			if(x<=100&&x>=90) A++;
			else if(x<90&&x>=80) B++;
			else if(x<80&&x>=70) C++;
			else if(x<70&&x>=60) D++;
			else if(x<60&&x>=0) F++;
			else if(x==-1) break;
			else 
			{
				System.out.print("���ݲ��Ϸ���");
				continue;
			}
			c++;
			sum+=x;
		}
		average=sum/c;
		System.out.println("����������:"+F+"\n��������:"+D+"\n�е�����:"+C+"\n��������:"+B+"\n��������:"+A);
		System.out.println("ƽ����:"+average);
	}

}
