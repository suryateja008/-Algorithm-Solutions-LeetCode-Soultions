public class Solution {
    public int majorityElement(int[] a) {
        
        if(a.length==1)
           return a[0];
           
        int majorIndex = 0,count = 1;
	   
	   for(int i=1;i<a.length;i++)
	   {
		   if(a[i]==a[majorIndex])
		   {
			   count++;
		   }
		   else
		   {
			   count--;
		   }
		   
		   if(count==0)
		   {
			   count=1;
			   majorIndex = i;
		   }
	   }
        return a[majorIndex];
    }
}
