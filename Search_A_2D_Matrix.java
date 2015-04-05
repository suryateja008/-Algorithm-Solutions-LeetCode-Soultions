public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        
        for(i=0;i<matrix.length;i++)
        {
            if(target>=matrix[i][0] && target<=matrix[i][matrix[i].length-1])
               break;
        }
        
        if(i>=matrix.length)
	        return binary(matrix[matrix.length-1],target);
	        
	        
	        return binary(matrix[i],target); 
        
    }
    
    
    public boolean binary(int[] A,int key)
    { 
        int start=0,end=A.length-1,mid=0;
        
        while(start<=end)
        {
            mid=(start+end)/2;
            
            if(A[mid]==key)
                return true;
                
            if(A[mid]>key)
            {
                end = mid - 1;
            }
            else
            {
                start=mid + 1;
            }
        }
        return false;
    }
}
