public class Solution {
    public int sqrt(int x) {
        
        long s=0,e=x/2+1,m=0,mul=0;
		 
		 while(s<=e)
		 {
			 m=(s+e)/2;
             mul = m*m;
           
			 if(mul==x)
			 {
				 return (int)m;
			 }
			 else if(mul>x)
			 {
				 e=m-1;
			 }
			 else
			 {
			     s=m+1;
			 }
		 }
		 
	       return (int)e;
    }
}
