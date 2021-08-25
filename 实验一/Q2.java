package experiment1;

import javax.swing.JOptionPane;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=0,B=0,C=0,D=0,F=0;
		int x=0,sum=0,average,c=0;
		while(x!=-1)
		{
			String str=JOptionPane.showInputDialog("请输入学生成绩:");
			x=Integer.parseInt(str);
			if(x<=100&&x>=90) A++;
			else if(x<90&&x>=80) B++;
			else if(x<80&&x>=70) C++;
			else if(x<70&&x>=60) D++;
			else if(x<60&&x>=0) F++;
			else if(x==-1) break;
			else 
			{
				System.out.print("数据不合法！");
				continue;
			}
			c++;
			sum+=x;
		}
		average=sum/c;
		System.out.println("不及格人数:"+F+"\n及格人数:"+D+"\n中等人数:"+C+"\n良好人数:"+B+"\n优秀人数:"+A);
		System.out.println("平均分:"+average);
	}

}
