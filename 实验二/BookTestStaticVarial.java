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
		System.out.println("请输入卖出的书的编号(1,2,3),输入-1来停止:");
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
					System.out.println("输入不合法"); continue;
			}
		}
		System.out.println("第一本书的销量："+a.salenumber);
		System.out.println("第二本书的销量："+b.salenumber);
		System.out.println("第三本书的销量："+c.salenumber);
		System.out.println("总销量:"+Book.gensalenumber);
	}

}
