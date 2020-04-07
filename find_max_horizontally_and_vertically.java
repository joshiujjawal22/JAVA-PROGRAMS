import java.util.*;

class Main{
	public static void main(String args[]){
	int max=Integer.MIN_VALUE;
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[][]=new int[n][n];
	for(int i=0;i<n;i++)
	for(int j=0;j<n;j++) 
	a[i][j]=sc.nextInt();
	
	for(int i=0;i<n;i++)
	{	int max1=1;
		int max2=1;
		for(int j=0;j<n;j++)
		{
			max1*=a[i][j];
			max2*=a[j][i];
		}
		max=Math.max(max,Math.max(max1,max2));
	}
	System.out.println(max);
	}
}
