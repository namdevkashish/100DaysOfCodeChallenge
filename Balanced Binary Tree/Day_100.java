//100 Days of Code Chalenge
//LeetCode

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int height(TreeNode root) {
        if (root == null) return -1;
        int height = 1 + Math.max(height(root.left), height(root.right));
        return height;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return Math.abs(height(root.left) - height(root.right)) < 2 && isBalanced(root.left) && isBalanced(root.right);
    }
}

/*
#TEST CASE 1:
Input
root =
[3,9,20,null,null,15,7]
Output
true

#TEST CASE2:
Input
root =
[1,2,2,3,3,null,null,4,4]
Output
false

#TEST CASE 3:
Input
root =
[]
Output
true

*/
