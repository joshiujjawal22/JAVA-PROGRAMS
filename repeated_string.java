import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int i,j,c=0;
	String s=sc.nextLine();
	int n=sc.nextInt();
	char ch[]=s.toCharArray();
	String main=new String("");
	for(i=0;i<n;){
      main+=s; 
      i=i+s.length();
      if(n-i<s.length())
      {
          for(j=0;j<n-i;j++) main+=ch[j];
          i+=j;
          }
	}
	for(i=0;i<main.length();i++) if(main.charAt(i)=='a') c++;
	System.out.println(c);
  }
}
                                                            More Efficient Code;
----------------*************-------------------------------********************---------------********************************************
       import java.util.Scanner;
public class Main
{
	public static void main(String[] args) { 
	Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
	int n=sc.nextInt();
        int i;
        long c=0;
     for(i=0;i<s.length();i++){
        if( s.charAt(i)=='a') c++;
     }
     
     long q=n/s.length();
     c=c*q;
     long r=n%(long)s.length();
     for(i=0;i<r;i++) if( s.charAt(i)=='a') c++;
     System.out.println(c);
     }
     }
