import java.util.*;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {  int i,j;
         Scanner sc= new Scanner(System.in);
      	String a=sc.nextLine();
      for(i=0;i<a.length();i++)
      { System.out.println(a.charAt(i));
       if(a.charAt(i)==(a.charAt(a.length()-i-1)))
       {for(j=i;j<a.length()-i;j++) {System.out.print(a.charAt(j));}
        System.out.println();
      }
    }
    }
}
