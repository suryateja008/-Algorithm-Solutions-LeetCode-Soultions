public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> l = new ArrayList<Integer>();
        Stack<TreeNode> s = new Stack<TreeNode>();
        
        if(root==null)
           return l;
          
          while(true)
          {
              while(root!=null)
              {
                  s.push(root);
                  root=root.left;
              }
              
              if(!s.isEmpty())
              {
                  TreeNode t = (TreeNode)s.pop();
                  l.add(t.val);
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
