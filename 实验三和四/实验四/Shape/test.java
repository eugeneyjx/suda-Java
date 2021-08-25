package Shape;

abstract class Shape {
	abstract public double area();
}
public class test extends Shape{
	public double area()
	{
		return 0.1;
	}
	public static void main(String[] args) {
		test x=new test();
		System.out.println(x.area());
	}
}
