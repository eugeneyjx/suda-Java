package experiment3;

class accessTest1{
	static int x=8;
}
class samePackage {
	public static void main(String[] args) {
		System.out.println(accessTest1.x);
	}
}
