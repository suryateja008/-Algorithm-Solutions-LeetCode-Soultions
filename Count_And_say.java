public class Solution {
    public String countAndSay(int n) {
        
          String s="1",temp="";
    	  int c =1,i=0;
    	    
          for(int j=0;j<n-1;j++)
          {
	    	c=1;
	    	temp=s;
	    	s="";
	    	
	    for(i=1;i<temp.length();i++)
	    {
	    	
	    	 if(temp.charAt(i-1)==temp.charAt(i)){
	    		 c++;
	    	 }
	    	 else
	    	 {
	    		 s+= (c+"") + temp.charAt(i-1);
	    		 c=1;
	    	 }
	    }
	        s+= (c+"") + temp.charAt(i-1);
	    
	 }  
	      
        return s;
    }
}
