import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   int i,j,c=0,flag=0;
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		String find=sc.nextLine();
		String str_1[]=str1.split(" ");
		String str_2[]=str2.split(" ");
		for(i=0;i<str_1.length;i++) 
		{
		    if(str_1[i].equals(find)) {System.out.println("True");flag=1;break;}
		}
		if(flag==0) System.out.println("False");
		flag=0;
		for(i=0;i<str_2.length;i++) 
		{
		    if(str_2[i].equals(find)) {System.out.println("True");flag=1;break;}
		}
		if(flag==0) System.out.println("False");
	}
}
