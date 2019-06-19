//import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


//class Solution {
//    int count;
//    public int rangeSumBST(TreeNode root, int L, int R) {
//        count = 0;
//        dfs(root, L, R);
//        return count;
//    }
//
//    public void dfs(TreeNode node, int L, int R) {
//        if(node != null){
//            if(L <= node.val && node.val <= R)
//                count += node.value;
//            if (L < node.val)
//                dfs(node.left, L, R);
//            if (node.val < R)
//                dfs(node.right, L, R);
//    }
//    }
//}