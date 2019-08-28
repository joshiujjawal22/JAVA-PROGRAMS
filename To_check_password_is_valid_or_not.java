import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(str.charAt(0)>'A' && str.charAt(0)<'Z') 
		{
		    if((str.charAt(4)>33 &&  str.charAt(4)<47) || (str.charAt(4)>58 &&  str.charAt(4)<64) )
		    System.out.println("Valid");
		    else {System.out.println("Not valid");}
		}
		else System.out.println("Not Valid");
	
		}
	}
