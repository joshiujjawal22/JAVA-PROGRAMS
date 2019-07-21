import java.util.Scanner;
class main 
{
public static void main(String[] args)
{
int b=1,c=0,d;
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
 
 while(n>0)
 {
 d=n%10;
  c=c+d*b;
  n=n/10;
  b=b*2;
  }
 System.out.print(c);
}
}