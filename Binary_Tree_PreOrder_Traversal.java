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
    List<Integer> l = new ArrayList<Integer>();
    
    public List<Integer> preorderTraversal(TreeNode root) {
        
        Stack<TreeNode> s = new Stack<TreeNode>();
        
        if(root==null)
          return l;
        
        while(true)
        {
            while(root!=null)
            {
                l.add(root.val);
                s.push(root);
                root=root.left;
            }
            if(!s.isEmpty())
            {
             TreeNode t = (TreeNode)s.pop();
             root=t.right;
            }
            else
            {
                break;
            }
        }
       return l;
    }
    
   
}
