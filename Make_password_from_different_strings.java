import java.util.Scanner;
class main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str1=sc.nextLine();
String str2=sc.nextLine();
String str3=sc.nextLine();
String fnal=new String("");
fnal+=str1.substring(0,2);
int n2=str2.length();
if(n2%2!=0) fnal+=str2.substring(n2/2,n2/2+1);
int n3=str3.length();
fnal+=str3.substring(n3-2,n3);
System.out.println(fnal);
}
}
