public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        
        String res ="";
	    String num = Integer.toBinaryString(n);
	
        for(int i=num.length()-1;i>=0;i--)
    	 res = res+num.charAt(i);
	
	for(int i=res.length();i<32;i++)
	     res = res+0;
	
	return ((int)Long.parseLong(res,2));
        
    }
}
