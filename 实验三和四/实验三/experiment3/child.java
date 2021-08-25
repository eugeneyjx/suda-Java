package experiment3;

class parent {
	static int x=100;
	void m() {
		System.out.println(x);
	}
}

class child extends parent {
	static int x=200;
	void m() {
		System.out.println("x="+x);
		System.out.println("super.x="+super.x);
		super.m();
	}
	public static void main(String[] args) {
		child a=new child();
		a.m();
		System.out.println(a.x);
	}
}