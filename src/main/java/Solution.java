import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        List<Integer> result = new ArrayList<>();

        // there is no root node
        // return empty list
        if (root == null) {
            return result;
        }

        TreeNode current = root;

        // if root is not null, that means current will not be null
        // this while loop will run
        while (current != null || !stack.isEmpty()) {

            // we are going to move leftward
            // start by pushing the root to the stack
            // then root.left
            // then left.left
            // etc
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // pop current off of stack and add to list
            current = stack.pop();
            result.add(current.val);

            // now check the right node
            current = current.right;
        }
        return result;
    }
}
