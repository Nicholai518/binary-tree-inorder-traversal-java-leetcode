import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode node_val_4 = new TreeNode(4);
        TreeNode node_val_5 = new TreeNode(5);
        TreeNode node_val_2 = new TreeNode(2, node_val_4, node_val_5);

        TreeNode node_val_6 = new TreeNode(6);
        TreeNode node_val_3 = new TreeNode(3, node_val_6, null);

        TreeNode root = new TreeNode(1, node_val_2, node_val_3);

        List<Integer> result = solution.inorderTraversal(root);
        System.out.println("Example One : " + Arrays.toString(result.toArray()));
    }
}
