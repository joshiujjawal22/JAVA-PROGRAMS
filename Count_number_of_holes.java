import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int holes=0;
	    Scanner sc= new Scanner(System.in);
	    int n=sc.nextInt(); //no. of test cases.
	    
	int a[]={1,0,0,0,1,0,1,0,2,1};
	while(n!=0)
	{  int num=sc.nextInt();//number in which operation to be performed.
	holes=0;
	    while(num>0){   
	    int i=num%10;
	   holes=holes+a[i]; 
	   num=num/10;
	    }
	    System.out.println(holes); n--;
	}
	
	}
}
