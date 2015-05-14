public class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] res = {-1,-1};
        int s = 0;
        s = start(nums,0,nums.length-1,target);
        
        if(s<0 || s>nums.length-1 || nums[s]!=target)
          return res;
          
          res[0]=s;
          res[1]=end(nums,s,nums.length-1,target);
          
        return res;
    }
    
    public  int  start(int[] num, int start , int end,int key)
	{   int mid =0;
		while(start<=end)
		{
			mid = (start+end)/2;
			if(num[mid]<key)
				start = mid+1;
			else
				end = mid-1;
		}
		return start;
	}
	
	public  int  end(int[] num, int start , int end,int key)
	{   int mid =0;
		while(start<=end)
		{
			mid = (start+end)/2;
			if(num[mid]>key)
				end = mid-1;
			else
				start = mid+1;
		}
		return end;
	}
}
