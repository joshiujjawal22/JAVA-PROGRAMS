import java.util.*;

public class Main

{

    public static void main(String[]args) {
        int n,l=0,sp=0,ep=0;
        Scanner inp=new Scanner(System.in);
        n=inp.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=inp.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int d=a[i+1]-a[i],c=0,e=0;
            for(int j=i;j<n-1;j++){
                if(a[j+1]-a[j]==d){
                    c++;
                }else{
                    e=j+1;
                    break;
                }
            }
            if(c>l){
                l=c;
                sp=i;
                ep=e;
            }
        }
        int sum=0;
        for(int i=sp;i<ep;i++){
            sum+=a[i];
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println(sum);
        
    }

}
