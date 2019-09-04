import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        int size=sc.nextInt();
	    int n=sc.nextInt();
	    int arr[]=new int[size+1];
	    for(i=1;i<=size;i++) arr[i]=0;
		int a,b,k;
	    while(n!=0){
	    a=sc.nextInt();
	    b=sc.nextInt();
	    k=sc.nextInt();
	    for(i=a;i<=b;i++) arr[i]+=k;
	        n--;
	    }
	    int max=arr[1];
	    for(i=1;i<=size;i++) if(max<arr[i]) max=arr[i];
	    System.out.print(max);
		
	}
}
