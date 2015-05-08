public class Solution {
    public boolean isHappy(int n) {
        
          int x=0;
	     HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
	     
		 while(n!=1)
		 {
			 if(h.containsKey(n))
			 {
				 return false;
			 }
			 else
			 {
				 h.put(n, 0);
			 }
			 x=n;
			 n=0;
			 while(x>0)
			 {
				 n+=(x%10)*(x%10);
				 x=x/10;
			 }
			 
		 }
		 
		 return true;
	    
    }
}
