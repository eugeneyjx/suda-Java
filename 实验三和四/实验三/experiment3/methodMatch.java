package experiment3;

class methodMatch {
	int x=200;
	public methodMatch() {
		x=300;
	}
	public methodMatch(int y) {
		x=y;
	}
	public void m1(double k) { x=(int) ((int)x+k); }
	public void m1() {x=x-1;}
	public void m1(int x,int y) {
		this.x=this.x+x*y;
	}
	public static void main(String[] args) {
		methodMatch a=new methodMatch();
		a.m1(2,3);
		methodMatch b=new methodMatch(20);
		b.m1(50.2);
		a.m1(9);
		System.out.println("a.x="+a.x);
		System.out.println("b.x="+b.x);
	}
}
