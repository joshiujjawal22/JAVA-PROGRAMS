import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 int i,num=0,j,c=0,d=0;
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=sc.nextInt();
		for(i=0;i<str.length();i++)
		{   num=0;
		    for(j=i;j<str.length();j++){
		    num=num*10+(str.charAt(j)-'0');
		    if(num%n==0){ 
		        ++c;
		      System.out.println(num);
		      System.out.println(c);
		  if(j==str.length()-1) break;
		  else continue;
		 }
		   
		    }
		}
		
	}
}


