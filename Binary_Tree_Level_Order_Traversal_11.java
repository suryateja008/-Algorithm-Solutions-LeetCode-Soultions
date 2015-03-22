/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
         List<List<Integer>> sol = new ArrayList<List<Integer>>();
        
        if (root == null)
		   return sol;
		
    	Queue<TreeNode> currentLvl = new LinkedList<TreeNode>();
    	Queue<TreeNode> nextLvl = new LinkedList<TreeNode>();
    	
    	List<Integer> l = new ArrayList<Integer>();
    	
    	currentLvl.add(root);
    	
    	while(!currentLvl.isEmpty())
    	{
    	    TreeNode n = currentLvl.remove();
    	    l.add(n.val);
    	    
    	    if(n.left!=null)
    	       nextLvl.add(n.left);
    	       
    	    if(n.right!=null)
    	       nextLvl.add(n.right);   
    	       
    	   if(currentLvl.isEmpty())
    	   {
    	       currentLvl=new LinkedList<TreeNode>(nextLvl);
    	       sol.add(0,new ArrayList<Integer>(l));
    	       nextLvl.clear();
    	       l.clear();
    	   }
    	}
        return sol;
    }
}
