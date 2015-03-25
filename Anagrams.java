public class Solution {
    public List<String> anagrams(String[] name) {
        
        HashMap<String,ArrayList<String>> h = new HashMap<String,ArrayList<String>>();
		
		for(int i=0;i<name.length;i++)
		{
			char[] c = name[i].toCharArray();
			Arrays.sort(c);
			String s = String.valueOf(c);
			 if(h.containsKey(s))
			 {   
				 h.get(s).add(name[i]);
			 }
			 else
			 {
				 ArrayList<String> a = new ArrayList<String>();
				 a.add(name[i]);
				 h.put(s,a);
			 }
			
		}
		
		ArrayList<String> result = new ArrayList<String>();
		for(ArrayList<String> l :h.values())
		{
			if(l.size()>1)
			{
				result.addAll(l);
			}
		}
		return result;
    }
}
