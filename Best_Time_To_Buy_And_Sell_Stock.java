public class Solution {
    public int maxProfit(int[] prices) {
        
         int min=Integer.MAX_VALUE; int max =0;  
         int difference = 0;
         
         for(int i=0;i<prices.length;i++)
         {
             if(prices[i]<min)
                min = prices[i];
             difference = prices[i]-min;
             
             if(difference>max)
                max = difference;
         }
         return max;
    }
}
