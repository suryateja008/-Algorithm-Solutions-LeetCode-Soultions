public class Solution {
    public String largestNumber(int[] num) {
        
         String res="";
         
         if(num.length==0)
	           return res;
	           
	        for(int i=0;i<num.length;i++)
	        {
	           for(int j=i+1;j<num.length;j++)
	           {
	               if(isGreat(num[i]+"",num[j]+""))
	               {
	                   int temp = num[i];
	                   num[i]=num[j];
	                   num[j]=temp;
	               }
	           }
	           res+=num[i];
	        }
	        
	        if(res.charAt(0)=='0')
	           return "0";
	           
	        return res;
        
    }
    
    public boolean isGreat(String i,String j)
    {
      if(Long.parseLong(i+j) > Long.parseLong(j+i))
			return false;
		
		return true;   
    }
}
