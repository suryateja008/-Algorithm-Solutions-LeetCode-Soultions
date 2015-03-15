public class Solution {
    public String addBinary(String a, String b) {
        
        int carry =0;
        String res="";
	int alen = a.length();
	int blen = b.length();
	
	for(int i=alen-1, j=blen-1;i>=0||j>=0;i--,j--){
		int aval = (i>=0)? a.charAt(i)-'0' :0;
		int bval = (j>=0)? b.charAt(j)-'0' :0;
		int val = (aval+bval+carry)%2;
		carry = (aval+bval+carry)/2;
		res=val+res;
	}
	
	   if(carry == 1)
		   res=carry+res;
		   
    return res;
    }
}
