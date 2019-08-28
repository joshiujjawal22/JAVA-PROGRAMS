import java.util.Scanner;
class main{
public static void main(String args[]){
	int i,j=0;
Scanner sc=new Scanner(System.in);
int n=Integer.parseInt(sc.nextLine());
String str[]=new String[n];
for(i=0;i<n;i++)
{
	str[i]= sc.nextLine();
}
int ch[]=new int[n];
for(i=0;i<n;i++)
{
	String spl[]=str[i].split(" ");
	ch[i]=Integer.parseInt(spl[2]);
}


int max=ch[0];
int c=i;
for(i=1;i<n;i++)
{
	if(ch[i]>max) {max=ch[i]; c=i;}
}
System.out.println(str[c]);
}
}
