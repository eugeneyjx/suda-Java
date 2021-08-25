package experiment2;

import java.util.*;


class Book {
	String title;
	int salenumber;
	static int gensalenumber;
	static {
	gensalenumber=0;
	}
	Book()
	{
		title="";
		salenumber=0;
	}
	void sale()
	{
		salenumber++;
		gensalenumber++;
	}
}

public class BookTestStaticVarial {
	
	public static void main(String[] args) {
		Book a=new Book();
		Book b=new Book();
		Book c=new Book();
		Scanner s=new Scanner(System.in);
		System.out.println("��������������ı��(1,2,3),����-1��ֹͣ:");
		int n=0;
		while(n!=-1)
		{
			n=s.nextInt();
			switch(n)
			{
				case 1:
					a.sale(); break;
				case 2:
					b.sale(); break;
				case 3:
					c.sale(); break;
				case -1:
					break;
				default:
					System.out.println("���벻�Ϸ�"); continue;
			}
		}
		System.out.println("��һ�����������"+a.salenumber);
		System.out.println("�ڶ������������"+b.salenumber);
		System.out.println("���������������"+c.salenumber);
		System.out.println("������:"+Book.gensalenumber);
	}

}
