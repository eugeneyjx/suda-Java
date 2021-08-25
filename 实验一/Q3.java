package experiment1;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=10;i<=100;i++)
		{
			if(i%3==0||i%5==0)
			{
				System.out.print(i+" ");
				count++;
			}
			if(count==5) 
			{
				count=0;
				System.out.println();
			}
		}
	}

}
