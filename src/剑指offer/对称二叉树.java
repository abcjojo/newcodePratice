package 剑指offer;

public class 对称二叉树 {
    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot==null)
            return true;

        return helper(pRoot.left,pRoot.right);
    }
    public boolean helper(TreeNode left, TreeNode right){
        if (left == null && right == null)
            return true;
        if ((left==null && right!=null) || (left!=null && right==null))
            return false;
        if (left.val != right.val)
            return false;

        return helper(left.left,right.right) && helper(left.right,right.left);
    }

}
