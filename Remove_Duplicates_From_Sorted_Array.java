public class Solution {
    public int removeDuplicates(int[] A) {
        int i=0,j=1;
        
        if(A.length==0)
            return 0;
          
        while(j<A.length)
        {
            if(A[i]!=A[j])
            {
                A[++i]=A[j];
            }
            j++;
        }
        return i+1;
    }
}
