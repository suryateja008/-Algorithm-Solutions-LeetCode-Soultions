public class Solution {
    public int[] plusOne(int[] digits) {
       int carryOn=1;
       
       for(int i=digits.length-1;i>=0;i--)
       {
              carryOn+=digits[i];
              digits[i]=carryOn%10;
              carryOn/=10;
       }
       
       if(carryOn>0)
       {
           int[] s = new int[digits.length+1];
           s[0] = 1;
           return s;
        }
        
       return digits;
    }
}
