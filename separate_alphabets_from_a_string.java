import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
         int i,j;
     String fill=new String("");
        Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
     
        for(j=0;j<str.length();j++)
        {
          if((str.charAt(j)>'a' && str.charAt(j)<'z') || (str.charAt(j)>'A' && str.charAt(j)<'Z'))
          {fill+=str.charAt(j);}
         }
      for(j=0;j<str.length();j++)
        {
          if((str.charAt(j)>'a' && str.charAt(j)<'z') || (str.charAt(j)>'A' && str.charAt(j)<'Z')) continue;
          else {fill+=str.charAt(j);}
         }
      System.out.println(fill);
      
    }
    }
