import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int i,j,c=0;
	char temp;
	int n=sc.nextInt(); //no. of nuts or bolts
	char nuts[]=new char[n];
	char bolts[]=new char[n]; 
	System.out.println("Nuts");
	for(i=0;i<n;i++) nuts[i]=sc.next().charAt(0);
	System.out.println("BOLTS");
	for(i=0;i<n;i++) bolts[i]=sc.next().charAt(0);
	for(i=0;i<n-1;i++) 
	{
	    for(j=i+1;j<n;j++)
	{
	    if(nuts[i]>nuts[j])
	    {   temp=nuts[i];
	        nuts[i]=nuts[j];
	        nuts[j]=temp;
	    }
	}
	}
	for(i=0;i<n-1;i++) 
	{
	    for(j=i+1;j<n;j++)
	{
	    if(bolts[i]>bolts[j])
	    {   temp=bolts[i];
	        bolts[i]=bolts[j];
	        bolts[j]=temp;
	    }
	}
	}
	for(i=0;i<n;i++) if(nuts[i]==bolts[i]) c++;
System.out.println(c);
	if(c==n) {
	    for(i=0;i<n;i++) System.out.println(nuts[i]+" ");
	    for(i=0;i<n;i++) System.out.println(bolts[i]+" ");
	}
	else System.out.println("Nuts and Bolts did not match");
}
}

