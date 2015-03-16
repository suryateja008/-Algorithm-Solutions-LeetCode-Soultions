public class Solution {
    public int titleToNumber(String s) {
      
	  int len = s.length();
	  int number = 0;
	  
	  for(int i=0;i<len;i++)
		   number += (s.charAt(i)-'A'+1)*(Math.pow(26, len-(i+1)));
	  
      return number;  
    }
}
