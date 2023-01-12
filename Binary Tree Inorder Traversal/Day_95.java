//100 Days of Code Challenge
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
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> output_arr = new ArrayList<>();

        if(root == null) {
            return output_arr;
        }
        TreeNode current = root;
        while(current != null || !stack.isEmpty()) {
            while(current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            output_arr.add(current.val);
            current = current.right;
        }
        return output_arr;
    }
}

/*
#TEST CASE 1:
Input
root =
[1,null,2,3]
Output
[1,3,2]

#TEST CASE 2:
Input
root =
[]
Output
[]

#TEST CASE 3:
Input
root =
[1]
Output
[1]

*/
