public class Solution {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int i,count=0;
        for(i=0;i<c.length;i+=2)
        {  int flag=0;
            if(c[i]==1) {i--;}
              if(i!=0) count++;
            if(i+2==c.length && c[i+1]==0) count++; 
        }
            
            return count;

    }
