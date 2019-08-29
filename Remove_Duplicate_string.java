import java.util.*;
public class Main
{  
	public static void main(String[] args) {
	    int i;
	    String m_str=new String("");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
    String another[]=str.split(" ");
    for(i=0;i<(another.length)-1;i++){
    if(another[i].equalsIgnoreCase(another[i+1])) continue;
    else m_str+=another[i]+" ";
    
    }
    if(another[another.length-2].equalsIgnoreCase(another[another.length-1])) m_str+=another[another.length-1];
    else m_str+=another[another.length-1];
    System.out.println(m_str);
	}
}
