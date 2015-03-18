public class Solution {
    public boolean isPalindrome(String pal) {
        
        
		pal = pal.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		int len = pal.length();
		
		if(len==0)
		  return true;
		  
		for(int i=0;i<(len/2);i++){
			if(pal.charAt(i)!=pal.charAt(len-i-1))
				return false;
		}
		
		return true;
    }
}
