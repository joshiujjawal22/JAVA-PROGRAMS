import java.util.Scanner;

class main{
	public static void main(String[] args)
	{  int i;
		Scanner sc = new Scanner(System.in);
		 int l=sc.nextInt();
		int a[]= new int[l];
		for(i=0;i<l;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<l;i++){
        for(int j=i;j<l;){
            if(a[j+1] == a[i]){
                for(int k=j;k<l-1;k++){
                    a[k]=a[k+1];
                }
                l--;
            }
            else{
                j++;
            }
        }
    }
    for(i=0;i<l+1;i++)
		{
			System.out.print(a[i]);
		}


	}

}