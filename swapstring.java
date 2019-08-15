import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int i,j,n;
	    int c[]={0,0,0,0,0,0,0,0};
	    String temp= "";
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		String arr[]=str.split(" ");
		for(i=0;i<arr.length;i++)
		{  n=arr[i].length();
		if(c[n]%2==0){
		   for(j=i+1;j<arr.length;j++)
		   {   
		       if(n==arr[j].length()) {
		           temp=arr[i];
		           arr[i]=arr[j];
		           arr[j]=temp;
		           c[n]++;
		           break;
		       }
		       else continue;
		   }
		}
		else c[n]++;
		   
		}
		for(i=0;i<arr.length;i++) System.out.print(arr[i]+ " ");
		
	}
}
