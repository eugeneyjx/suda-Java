package experiment2;

import java.util.*;
import java.lang.*;

public class Student {
	int no,age;
	String name;
	public Student()
	{
		this.name="";
		this.no=0;
		this.age=0;
	}
	
	public static Student[] ageadd(Student[] stu)
	{
		for(Student elem:stu)
		{
			elem.age++;
		}
		System.out.println("�ѽ�����ѧ������+1.");
		return stu;
	}
	
	public static void showinfo(Student[] stu)
	{
		for(int i=0;i<stu.length;i++)
		{
			System.out.println("��"+(i+1)+"λѧ������Ϣ��");
			System.out.print("������"+stu[i].name+" ");
			System.out.print("ѧ�ţ�"+stu[i].no+" ");
			System.out.print("���䣺"+stu[i].age+" ");
			System.out.print("\n");
		}
	}
	
	public static void show_stu_above_age(Student[] stu, int a)
	{
		System.out.println("�������"+a+"��ѧ����:");
		for(int i=0;i<stu.length;i++)
		{
			if(stu[i].age>a)
			{
				System.out.print("������"+stu[i].name+" ");
				System.out.print("ѧ�ţ�"+stu[i].no+" ");
				System.out.print("���䣺"+stu[i].age+" ");
				System.out.print("\n");
			}
		}
		
	}
	public static void show_info_sorted_by_age(Student[] stu)
	{
		Arrays.sort(stu, new MyComparator());
		System.out.println("�����������:");
		showinfo(stu);
	}
	
	
	public static void main(String[] args) {
		System.out.print("������ѧ��������");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		Student[] arr = new Student[n];
		for(int i=0;i<n;i++)
		{
			Student stu = new Student();
			Scanner s1=new Scanner(System.in);
			System.out.print("�������"+(i+1)+"λѧ����������");
			stu.name=s1.nextLine();
			Scanner s2=new Scanner(System.in);
			System.out.print("�������"+(i+1)+"λѧ����ѧ�ţ�");
			stu.no=s2.nextInt();
			System.out.print("�������"+(i+1)+"λѧ�������䣺");
			stu.age=s2.nextInt();
			arr[i]=stu;
		}
		ageadd(arr);
		showinfo(arr);
		show_stu_above_age(arr,20);
		show_info_sorted_by_age(arr);
	}

}

class MyComparator implements Comparator<Student> 
{ 	
	public int compare(Student o1, Student o2) {
    int result = o1.age - o2.age;
    return result;
	}
}

