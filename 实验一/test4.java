package experiment1;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]=new int[20];
		int sum=0;
		double average;
		for(int k=0;k<x.length;k++)
		{
			x[k]=100+(int)(Math.random()*900);
			sum+=x[k];
			System.out.print(x[k]+" ");
		}
		average=sum*1.0/20.0;
		System.out.print("\n"+average);
	}
}
