public class Solution {
    public ArrayList<Integer> grayCode(int num) {
        
        ArrayList<Integer> a = new ArrayList<Integer>();
		
		for(int i=0;i<Math.pow(2, num);i++)
	      a.add(((i >> 1)^i));
	      
	    return a;
    }
}
