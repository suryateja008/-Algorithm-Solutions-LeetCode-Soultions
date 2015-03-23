public class Solution {
    public int romanToInt(String s) {
        
        if(s.length()==0)
          return 0;
          
        int res=0;
	
	   for(int i=0;i<s.length();i++)
	   {
		     if(i>=1 && Rr(s.charAt(i))>Rr(s.charAt(i-1)))
		     {
		    	 res+=Rr(s.charAt(i))-2*Rr(s.charAt(i-1));
		     }
		     else
		     {
		    	 res+=Rr(s.charAt(i));
		     }
	   }
	   return res;
    }
    
    public static int Rr(char c)
	{
		switch(c)
		{  
		        case 'I': return 1;  
		        case 'V': return 5;  
		        case 'X': return 10;  
		        case 'L': return 50;  
		        case 'C': return 100;  
		        case 'D': return 500;  
		        case 'M': return 1000;  
		        default: return 0;  
		}  
	}
}
