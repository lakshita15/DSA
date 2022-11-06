/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    
    public boolean findData(TreeNode root , int data ){
        TreeNode curr = root;
        while (curr != null)
    {
        if (curr.val == data)
            return true;
        else if (curr.val < data)
            curr = curr.right;
        else
            curr = curr.left;
    }   
       return false; 
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       TreeNode LCA = null , curr = root;
        while(curr!=null){
          if(curr.val <p.val && curr.val < q.val){
            curr = curr.right;
        }else if(curr.val > p.val && curr.val > q.val){
            curr = curr.left;
        }  else{
            LCA = curr;
              break;
          }
        }
        if(LCA!= null && findData(LCA, p.val) && findData(LCA, q.val)){
            return LCA;
        } else{
            return null;
        }
      // return null;
    }
}