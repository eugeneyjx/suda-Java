package experiment2;
import java.util.*;

public class Yanghuiclass {

	public static void main(String[] args) {
		System.out.print("请输入想要生成的杨辉三角行数n:");
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int[][] arr=new int[n][];
		for(int i=0;i<n;i++)
		{
			arr[i]=new int[i+1];
		}
		arr[0][0]=1;
		arr[1][0]=1;
		arr[1][1]=1;
		for(int i=2;i<n;i++)
		{
			arr[i][0]=1;
			arr[i][i]=1;
			for(int j=1;j<i;j++)
			{
				arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print("\t");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(arr[i][j]+"\t\t");
			}
			for(int j=0;j<n-i;j++)
			{
				System.out.print("\t");
			}
			System.out.print("\n");
		}
	}

}
