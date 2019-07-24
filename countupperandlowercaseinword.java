class Main{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int c=0; //count of lower case 
		int C=0; //Count of upper case
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				C++;
			}
			else if(ch>='a' && ch<='z')
			{
				c++;
			}
		}
		System.out.println("No. of uppercase letters: " + C);
		System.out.println("No. of lowercase letters: " + c);
	}
}
