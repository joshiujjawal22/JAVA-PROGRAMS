import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int i,j,main=0;
	 String str=new String();
	 Scanner sc=new Scanner(System.in);
	 str=sc.nextLine();
	 int n=str.length();
	 char ch[]=str.toCharArray();
	 for(i=1;i<n;i++)
	 { int c_1=0,c_0=0;
	     for(j=0;j<i;j++)
	     {
	         if((int)ch[j]=='1') c_1++;
	         else c_0++;
	         
	     }
	     if(c_1>=c_0) main++;
	 }
	 if(main==n-1) System.out.println("Magical string");
	 else System.out.println("Not Magical");
	 
	}
}
