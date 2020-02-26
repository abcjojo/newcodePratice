package 剑指offer.牛客剑指offer编程题;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-08-31 11:04
 **/

public class 二叉树的深度 {
    public int TreeDepth(TreeNode root) {

        if (root == null) return  0;

        int leftnode = TreeDepth(root.left);
        int rightnode = TreeDepth(root.right);

        return Math.max(leftnode,rightnode)+1;

    }
}
