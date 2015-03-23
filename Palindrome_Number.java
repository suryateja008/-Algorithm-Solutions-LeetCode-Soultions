public class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0)
          return false;
        
        int num=x;
		int val=0;
		while(num!=0)
		{
		val=val*10+num%10;
		num/=10;
		}
		
		if(x==val)
		return true;
		
		return false;
		
    }
}
