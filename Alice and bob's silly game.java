import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
   int i,j,c,k;
    int a[]=new int[n+1];
    int main_count=0;
    for(i=1;i<=n;i++)
    {
        a[i]=i;
    }
   for(i=1;i<=n;i++)
   {    c=0;
   if(a[i]>0){
       for(j=1;j<=n;j++)
       {
           if(a[i]%j==0) c++;


       }
       if(c==2) {
           main_count++;
           for(k=1;k<=n;k++)
           {
               if(a[k]%a[i]==0) {if(k!=i) a[k]=1;}
          
           }
           a[i]=1;
       }
   }
   else continue;
}
if(main_count%2==0) System.out.println("Bob");
    else System.out.println("Alice");
	}
}

