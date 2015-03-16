public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
       int c = 0;
       
       if(n<0){
            c=1;
            n = n+Integer.MIN_VALUE;
        }
      
    
      while(n>0){
    	      n = n & (n-1);    	  
    		  c++;
      }
      return c;
    }
}
