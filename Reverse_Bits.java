public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int i=0;
        
        for(int j=0;j<32;j++)
        {
            i <<=1;
            i |= n & 1;
            n >>= 1;
        }
        return i;
    }
}
