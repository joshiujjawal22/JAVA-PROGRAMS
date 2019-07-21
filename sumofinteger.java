import java.util.Scanner;
class soi
{
public static void main(String[] args)
{ int sum=0;
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
 int a=sc.nextInt();
 sum+=a;
}
System.out.print("sum is" + sum);
}
}
