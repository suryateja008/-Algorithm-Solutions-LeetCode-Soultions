public class Solution {
    public int removeElement(int[] A, int target) {
        int i=0,j=0;
        
       for(i=0;i<A.length;i++){
           if(A[i]!=target){
               A[j++]=A[i];
           }
       }
       return j;
    }
}
