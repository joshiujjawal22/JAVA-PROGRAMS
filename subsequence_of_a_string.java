import java.util.*;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    { int i,j;
     String fill=new String();
        Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
      for(i=0;i<str.length();i++)
      {		fill="";
        for(j=i;j<str.length();j++)
        { 
         fill+=str.charAt(j);
          System.out.println(fill);
          
}
      }
    }
    }
