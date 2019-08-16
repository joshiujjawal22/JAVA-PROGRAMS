import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int i,j;
        Scanner sc=new Scanner(System.in);
        
        int n_a=sc.nextInt(); //Size of first array.
        int a[]= new int[n_a];
        for(i=0;i<n_a;i++) a[i]=sc.nextInt(); //scanning of first array.
        int n_b=sc.nextInt(); //Size of second array.
        int b[]= new int[n_b];
        for(i=0;i<n_b;i++) b[i]=sc.nextInt(); //Scanning of second array.
        int c[]=new int[n_b]; 
        
        
        for(i=0;i<n_b;i++)
        {  c[i]=0;
            for(j=0;j<n_a;j++) 
            { if(b[i]>=a[j]) c[i]++;
        }
            System.out.print(c[i] + " ");
        }
        
        
	}
}
