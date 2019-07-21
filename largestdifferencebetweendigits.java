class main
{
	public static void main(String[] args)
	{  
	int a[]={5,1,3,2,4,6};
	int large = a[2]-a[1];
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			int temp=a[i]-a[j];
			if(large<temp) large=temp;
			}
	}
		System.out.print(large);
	}
}