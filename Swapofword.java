import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		String str=sc.nextLine();
		String str_arr[]=str.split(" ");
		StringBuffer temp;
			int n=str_arr.length;
		StringBuffer Strb_arr[]=new StringBuffer[n];
	
		for(i=0;i<n;i++)
		{
		 Strb_arr[i]=new StringBuffer(str_arr[i]);
		}
		for(i=1;i<n-1;i++)
		{
		    Strb_arr[i]=Strb_arr[i].reverse();
		}
		temp=Strb_arr[0];
		Strb_arr[0]=Strb_arr[n-1];
		Strb_arr[n-1]=temp;
		for(i=0;i<n;i++) System.out.print(Strb_arr[i] + " ");
		System.out.println();
		for(i=0;i<n;i++) System.out.println(str_arr[i] + "->"+ str_arr[i].length());
	}
}
