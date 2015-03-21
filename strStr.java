public class Solution {
    public int strStr(String haystack, String needle) {
        int c=0;
        
        for(int i=0;i<=haystack.length()-needle.length();i++)
        {   c=0;
            for(int j=0;j<needle.length();j++)
            {
                  if(haystack.charAt(i+j)==needle.charAt(j))
                  {
                       c++;
                      
                  }
                    else
                  { 
                      break;
                  }
                
            }
            if(c==needle.length())
               return i;
        }
        
         
            
        return -1;
    }
}
