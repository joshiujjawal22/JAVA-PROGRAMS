import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int i,c=0;
	  Scanner sc = new Scanner(System.in);
	  int n_a=sc.nextInt(); //Size of first array.
	  int a[]=new int[n_a];
	
	  for(i=0;i<n_a;i++)
	  {
	      a[i]=sc.nextInt();
	  }
	int n_b=sc.nextInt(); //Size of second array.
	  int b[]=new int[n_b];
        
	  for(i=0;i<n_b;i++)
	  {
	      b[i]=sc.nextInt();
	  }
	  if(n_a==n_b)
	  {
	      for(i=0;i<n_a;i++)
	      {
	          if(a[i]>=b[i]) c++;
	      }
	    if(c==n_b) System.out.println("Compatible");
	    else System.out.println("Not Compatible");
	  }
	  else System.out.println("Not Compatible");
	  
	}
}
