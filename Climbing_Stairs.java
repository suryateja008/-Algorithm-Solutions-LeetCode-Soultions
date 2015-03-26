public class Solution {
    public int climbStairs(int n) {
        int[] data = new int[n+1];
        
        if(n<=2)
          return n;
          
        data[0]=1;data[1]=1;data[2]=2;

       for(int i=2;i<=n;i++)
       {
           data[i] = data[i-1]+data[i-2];
       }
       return data[n];
			
	
        
    }
}
