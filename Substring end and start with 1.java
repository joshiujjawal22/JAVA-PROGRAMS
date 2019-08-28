import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   int i,j,c=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char str[]=new char[n];
		for(i=0;i<n;i++) str[i]=sc.next().charAt(0);
		for(i=0;i<n;i++)
		{ 
		    for(j=i;j<n;j++)
		    { 
		        if(str[i]=='1' && str[j]=='1') c++;
		    }
		   
		}
		 System.out.println(c);
		
		
	}
    
}
