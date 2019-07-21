import java.util.Scanner;

class main{
	public static void main(String[] args)
	{  int i,sum;
		Scanner sc = new Scanner(System.in);
		 int l=sc.nextInt();
		 int count=0,j=0;
		 int arr[] = new int[10];
		 sum= sc.nextInt();
		 for(i=0;i<l;i++)
		{
			arr[i]=sc.nextInt();
		}
 for(i=0;i<l;i++){
   for(j=i+1;j<l;j++)
   {
     if(arr[i]+arr[j]==sum)
       System.out.print("(" + arr[i] + "," + arr[j] + ")");
   }
 }
 
	}
}