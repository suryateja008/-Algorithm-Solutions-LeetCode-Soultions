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
    
    public boolean isBalanced(TreeNode root) 
    {
        if(checkHeight(root)==-1)
           return false;
           
           return true;
        
    }
    
    public int checkHeight(TreeNode r)
    {
        int left=0,right=0;
        
         if(r==null)
          return 0;
          
         left = checkHeight(r.left);
         
          if(left==-1)
             return -1;
            
         right = checkHeight(r.right);
         
          if(right==-1)
             return -1;
            
         if(Math.abs(left - right) > 1)
              return -1;
         else
              return 1+Math.max(left, right);
    }
    
}
        
   
