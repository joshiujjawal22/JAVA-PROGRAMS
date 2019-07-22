

                                //JAGGED ARRRAY:
import java.util.*;

class Main
{
	public static void main(String[] args)
	{
	int arr[][]=new int[3][];
	arr[0] = new int[5]; //jagging of arrays...
	arr[1] = new int[4];
	arr[2] = new int[2];
	Scanner sc= new Scanner(System.in);
	for(int i=0;i<arr.length;i++)
	{
	    for(int j=0;j<arr[i].length;j++)
	    {
	       arr[i][j]= sc.nextInt();
	    }
	}
	for(int k=0;k<arr.length;k++)
	{
	    for(int f=0;f<arr[k].length;f++)
	    {
	       System.out.print(arr[k][f] + " ");
	    }
	    System.out.println();
	}
}
}


