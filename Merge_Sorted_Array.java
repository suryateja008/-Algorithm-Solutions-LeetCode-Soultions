public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        
        int tlen = m+n-1;
        m--;n--;
        
        while(m>-1 && n>-1)
        {
            if(A[m]>B[n])
            {
                A[tlen--]=A[m--];
            }
            else
            {
                A[tlen--]=B[n--];
            }
        }
        
        while(m>-1)
        {
            A[tlen--]=A[m--];
        }
        
        while(n>-1)
        {
            A[tlen--]=B[n--];
        }
        
    }
}
