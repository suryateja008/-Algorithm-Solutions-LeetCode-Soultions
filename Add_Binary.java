public class Solution {
    public String addBinary(String a, String b) {
        
   StringBuffer ss = new StringBuffer(); 
	int carry =0;
	int alen = a.length();
	int blen = b.length();
	
	for(int i=alen-1, j=blen-1;i>=0||j>=0;i--,j--){
		int aval = (i>=0)? a.charAt(i)-'0' : 0;
		int bval = (j>=0)? b.charAt(j)-'0' :0;
		int val = (aval+bval+carry)%2;
		carry = (aval+bval+carry)/2;
		ss.insert(0,val);
		
	}
	
	   if(carry == 1)
		   ss.insert(0,carry);
		   
    return ss.toString();
    }
}
