public class Solution {
    public int singleNumber(int[] A) {
        int oneBits = 0;
        int twoBits = 0;
        int threeBits = 0;
        
        for(int i : A)
        {
            oneBits ^= i;
            twoBits = twoBits | ((oneBits^i) & i);
            threeBits = ~(oneBits & twoBits);
            oneBits = oneBits & threeBits;
            twoBits = twoBits & threeBits;
        }
        return oneBits;
    }
}
