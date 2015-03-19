public class Solution {
    public int singleNumber(int[] A) {
        
        int ans=0;
        
        for(int a : A)
               ans=ans^a;
        
        return ans;
    }
}
