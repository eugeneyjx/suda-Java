package Fight;

///����ӿ�
interface Fight{
   void fight();
}
//�ʷʺ�����ȥʵ������ӿ�
class FatFat implements Fight{
   public void fight(){
       System.out.println("FatFat ���˺�ʹ!");
   }
}
class ThinThin implements Fight{
   public void fight(){
       System.out.println("ThinThin ����һ�㶼��ʹ����������");
   }
}

public class test <T extends Fight> {
	
	public void f(T t) {
		t.fight();
	}

	public static void main(String[] args) { //����
		FatFat fat=new FatFat();
		test<FatFat> t=new test<FatFat>();
		t.f(fat);
	}

}
