public class Solution {
    public void sortColors(int[] A) {
        
        int start=0,mid=0,end=A.length-1;
        
        while(mid<=end)
        {
            switch(A[mid])
            {
                case 0:
                    swap(start++,mid++,A);
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(mid,end--,A);
                    break;
            }
        }
    }
    
      public void swap(int i ,int j,int[] a)
        {
            int temp = a[i];
            a[i]=a[j];
            a[j]=temp;
        }
}
