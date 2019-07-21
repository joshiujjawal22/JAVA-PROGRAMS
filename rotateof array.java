class main
{
	public static void main(String[] args)
	{  int n=2;
		int a[]={5,4,3,2,1};
		while(n>0){
  int tmp=a[0];
 for(int i=0;i<a.length;i++){
	if(i!=(a.length-1)) a[i]=a[i+1];
}
  a[a.length-1]=tmp;
}
}
}