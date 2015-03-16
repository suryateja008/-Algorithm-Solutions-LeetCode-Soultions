public class Solution {
    public int[] twoSum(int[] numbers, int target) {
     
     	HashMap h = new HashMap<Integer,Integer>();
     	int[] a = new int[2];
	
	for(int i=0;i<numbers.length;i++){
	       int num= numbers[i];
		
		   if(h.containsKey(num)){
		       a[0] = Integer.parseInt(h.get(num)+"")+1;
		       a[1] = i+1;
		       break;
		   }else{
			   h.put(target - numbers[i], i);
		}
	}
	
	return a;
	
    }
}
