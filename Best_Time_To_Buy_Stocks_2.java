public class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length==0 || prices.length==1)
              return 0;
          
        int min=prices[0] ,max = prices[0],diff = 0,sum=0;
       
        
        for(int i=1;i<prices.length;i++)
        {
        	
               if(prices[i]>max)
            	  max=prices[i];
               
               if(prices[i]<=max)
               {
            	   diff = max-min;
            	   if(diff>0)
            		   sum+=diff;
            	   max=min=prices[i];
               }
            
        }
        if(min<max){
        	sum+=max-min;
        }
           
           return sum;
        
    }
}
