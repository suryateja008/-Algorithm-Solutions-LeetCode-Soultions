public class Solution {
    public boolean isIsomorphic(String s, String t) {
        
         if(s.length()!=t.length())
           return false;
           
        HashMap<Character,Character> h = new HashMap<Character,Character>();
        HashMap<Character,Character> h2 = new HashMap<Character,Character>();
		int len = s.length();
        
		for(int i=0;i<len;i++)
		{
			char cs = s.charAt(i);
			char ct = t.charAt(i);
			
			if(h.containsKey(cs))
			{
				if(h.get(cs)!=ct)
					return false;
				
			}
			else
			{
				 if(h2.containsKey(ct))
				 {
						
							return false;
				 }
			    h.put(cs, ct);
			    h2.put(ct, cs);
			}
		}
		
		return true;
    }
}
