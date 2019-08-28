import java.util.Scanner;
class main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();

String str_split[]=str.split(" ");
for(int i=0;i<str_split.length;i++)

{	StringBuffer buff=new StringBuffer(str_split[i]);
	System.out.print(buff.reverse()+" ");
}
}
}
