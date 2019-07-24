import java.util.Scanner;
class Main{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int i=0;
		for(int j=0;j<str.length();j++)
		{
			if(str.charAt(j) == ' ' && str.charAt(j+1) !=' ')
			{ 
				i++;
			}
		}
		if(i==0){
		System.out.println("Please provide an input.");
	}
	else{
		System.out.println(i+1);
	}
	}
}
