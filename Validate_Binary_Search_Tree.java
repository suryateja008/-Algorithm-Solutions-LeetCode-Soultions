public class Solution {
    public boolean isValidBST(TreeNode root) {
        
        return inorderTraverse(root);
    }
    
    TreeNode prev = null;
    public boolean inorderTraverse(TreeNode root) {
        
        if (root != null){
            
            
        if (!inorderTraverse(root.left))
            return false;
            
        if (prev != null && (root.val <= prev.val)) 
                return false;

        prev = root;
        
        if (!inorderTraverse(root.right))
              return false;
        }
            
        return true;
    }
}
