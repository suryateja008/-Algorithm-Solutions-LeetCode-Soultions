c class Solution {
    public ArrayList<ArrayList<Integer>> generate(int num) {
        
        ArrayList<ArrayList<Integer>> l = new  ArrayList<ArrayList<Integer>>();
	     ArrayList<Integer> ll,temp;
	     
	        if(num>0)
	        {
    	        ll = new ArrayList<Integer>();
    			ll.add(1);
    			l.add(ll);
	        }
			
	for(int i=2;i<=num;i++)
	{
		ll = new ArrayList<Integer>();
		temp = l.get(i-2);
		
		   for(int j=0;j<i;j++)
		   {
			    if(j==0 || j==(i-1))
			    {
			     ll.add(1);	
			    }
			    else
			    {
			    	ll.add(temp.get(j-1)+temp.get(j));
			    }
		   }
		   l.add(ll);
	}
        
        return l;
    }
}
