import java.util.Scanner;
class main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
if(str.length()<6)
{
	char ch[]=str.toCharArray();
	for(int i=0;i<str.length();i++)
	{
		if(ch[i]=='a' ||ch[i]=='e' ||ch[i]=='i' ||ch[i]=='o' ||ch[i]=='u') ch[i]='$';

	}
	for(int i=0;i<str.length();i++) System.out.print(ch[i]);
}
else System.out.println(str);		
}
}
