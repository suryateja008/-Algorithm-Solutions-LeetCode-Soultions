public class Solution {
    public int findPeakElement(int[] a) {
     int start = 0,end=a.length-1,mid=0;
     
	   while(start<=end){
		   mid = (start+end)/2;
		   if((mid==0 || a[mid] >= a[mid-1]) && (mid==a.length-1 || a[mid] >= a[mid+1]) ){
			   return mid;
		   }else if(mid > 0 && (a[mid-1] > a[mid] )){
			   end = mid -1;
		   }else{
			   start = mid+1;
		   }
	   }
		   return mid;
		   
	   }
}
