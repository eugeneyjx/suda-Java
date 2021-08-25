package Listener;

interface Listener{
	void action();
}
public class test implements Listener{
	public void action() {System.out.println("stand up");}
	public void add(Listener a) {
		a.action();
	}
	public static void main(String[] args) {
		test x=new test();
		x.add(x);
		x.add(new test2());
	}
}

class test2 implements Listener {
	public void action() { System.out.println("sit down");}
}