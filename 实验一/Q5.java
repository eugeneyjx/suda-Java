package experiment1;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ex=1;
		for(double x=0.2;x<=1.0;x+=0.2)
		{
			for(int i=1;i<=20;i++)
			{
				ex+=Math.pow(x, i)/doFactorial(i);
			}
			System.out.printf("x=%.1f时, ex=%.5f\n",x,ex);
			ex=1;
		}
		
	}
	
	 public static int doFactorial(int n)
	 {
		 if(n<0) return -1;//传入的数据不合法
		 if(n==0) return 1;
		 else if(n==1)//递归结束的条件
			 return 1;
		 else
		 {
			 return n*doFactorial(n-1);
		 }
}
}
