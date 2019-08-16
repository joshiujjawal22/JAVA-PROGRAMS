import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int n=0,s_num_r=0;
		 Scanner sc=new Scanner(System.in);
		 int num=sc.nextInt();
		 int s_num=num*num;
		 while(num>0)
		 {
		     n=n*10+num%10;
		     num=num/10;
		 }
		 int s_n=n*n;
		
		 while(s_num>0)
		 {
		     s_num_r=s_num_r*10+s_num%10;
		     s_num=s_num/10;
		 }
		 if(s_num_r==s_n) System.out.println("Yes,This is Adam number");
		 else System.out.println("No,This is not adam number");
		 
		 
	}
}
