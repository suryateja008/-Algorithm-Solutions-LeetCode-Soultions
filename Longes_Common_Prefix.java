public class Solution {
    public String longestCommonPrefix(String[] strs) {
    
    if(strs==null || strs.length==0)
       return "";
       
    String string = strs[0];
    boolean flag;
    int i=0;
    
     for(;i<string.length();i++)
     {
    	 flag=true;
    	 for(String s:strs)
    	 {
    		 if(s.length()-1<i || s.charAt(i)!=string.charAt(i))
    		 {
    			 flag=false;
    			 break;
    		 }
    	 }
    	 if(!flag)
    		 break;
    	 
     }
      return string.substring(0, i);  
    }
}
