public class Solution {
    public boolean isValid(String ss) {
        Stack<Character> s = new Stack<Character>();
        char c;
        for(int i=0;i<ss.length();i++)
        {    
            c = ss.charAt(i);
            if(c=='(' || c=='[' || c=='{')
            {
                s.push(c);
            }
            else if(!s.isEmpty())
            {
                switch(c)
                {
                    case ')':
                        if('('!=s.pop())
                          return false;
                    break;
                    
                    case '}':
                        if('{'!=s.pop())
                          return false;
                    break;
                    
                    case ']':
                        if('['!=s.pop())
                          return false;
                    break;
                }
            }
            else
            {
                    return false;    
            }
        }
        
        if(s.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
