public class Solution {
    public int maxSubArray(int[] A) {
        
        if(A.length==0)
          return 0;
        
       int currentMax = 0, totalMax = Integer.MIN_VALUE;
	   
	   for(int i : A)
	   {
		   currentMax+=i;
		   
		   if(currentMax>totalMax)
			   totalMax= currentMax;
			   
		   if(currentMax < 0)
			   currentMax = 0;
		  
	   }
        return totalMax;
    }
}
