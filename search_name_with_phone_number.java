import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int flag=0,j=0;

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		String name[]=new String[n];
		    int p_no[]=new int[n];
	
		for(int i=0;i<n;i++){
		    name[i]=sc.next();
		 p_no[i]=sc.nextInt();
		   }
	
			
		int required=sc.nextInt();
		    for(int i=0;i<n;i++){		        
		    if(p_no[i]==required){ j=i;flag=1;break;}
		   
		        }
		        	
		        if(flag==1) System.out.println(name[j]);
		        else System.out.println("Not found");
		        
		  
		}
	}
