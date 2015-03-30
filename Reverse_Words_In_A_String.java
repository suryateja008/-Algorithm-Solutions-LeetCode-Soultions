public class Solution {
    public String reverseWords(String s) {
        if(s==null || s.length()==0)
            return s;
            
        
            s = s.trim().replaceAll("\\s+"," ");
	        String result = "";
	        String[] r = s.split(" ");
	        
	        for(int i=r.length-1;i>=1;i--)
	        {
	        	result += r[i]+" ";
	        }
        
	        result += r[0];
        
        return result;
    }
}
