package Fight;

///定义接口
interface Fight{
   void fight();
}
//肥肥和瘦瘦去实现这个接口
class FatFat implements Fight{
   public void fight(){
       System.out.println("FatFat 打人很痛!");
   }
}
class ThinThin implements Fight{
   public void fight(){
       System.out.println("ThinThin 打人一点都不痛！！哈哈。");
   }
}

public class test <T extends Fight> {
	
	public void f(T t) {
		t.fight();
	}

	public static void main(String[] args) { //测试
		FatFat fat=new FatFat();
		test<FatFat> t=new test<FatFat>();
		t.f(fat);
	}

}
