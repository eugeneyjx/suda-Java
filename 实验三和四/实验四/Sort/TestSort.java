package Sort;

import java.util.Collections;

interface Sortable {
	int Compare(Sortable s);
}

class Student implements Sortable {
	int score;
	Student(int s){
		score=s;
	}
	public int Compare(Sortable s) {
		Student ss=null;
		if(s instanceof Student) {
			ss=(Student)s;
		}
		if(this.score>ss.score) return 1;
		else if(this.score==ss.score) return 0;
		else return -1;
	}
	public String toString() {
		return ""+this.score;
	}
}

class Rectangle implements Sortable {
	int length,width;
	Rectangle(int l, int w){
		length=l;
		width=w;
	}
	int area() {
		return length*width;
	}
	public int Compare(Sortable r) {
		Rectangle rr=null;
		if(r instanceof Rectangle) {
			rr=(Rectangle)r;
		}
		if(this.area()>rr.area()) return 1;
		else if(this.area()==rr.area()) return 0;
		else return -1;
	}
	public String toString() {
		return ""+area();
	}
}

class Sort {
	public static void SelectSort(Sortable [] a) {
		Sortable m=null;
			for(int i=0;i<a.length-1;i++){//升序
				for(int j=i+1;j<a.length;j++){
					if(a[j].Compare(a[i])<0){
						m=a[i];
						a[i]=a[j];
						a[j]=m;
					}
				}
			}
	}
}

public class TestSort {
	TestSort(){
		Student[] s=new Student[5];
		for(int i=0;i<s.length;i++){
			s[i]=new Student((int)(Math.random()*100));
		}
		Sort.SelectSort(s);
		System.out.println("下面是按升序输出学生成绩");
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
		}
		
		Rectangle[] ss=new Rectangle[5];
		for(int i=0;i<ss.length;i++){
			ss[i]=new Rectangle((int)(Math.random()*100),(int)(Math.random()*100));
		}
		Sort.SelectSort(ss);
		System.out.println("下面是按升序输出矩形面积");
		for(int i=0;i<ss.length;i++){
			System.out.println(ss[i]);
		}
	 }

	public static void main(String[] args) {
		new TestSort();
	}

}
