package 剑指offer.牛客剑指offer编程题;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-10-13 17:08
 **/
public class 树的子结构 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {

        boolean flag = false;
        if (root1 == null || root2 == null) return  false;

        if (root1.val == root2.val) flag = isSameTree(root1,root2);
        if (!flag)      flag = isSameTree(root1.left,root2);
        if (!flag)      flag = isSameTree(root1.right,root2);

        return flag;
    }

    public boolean isSameTree(TreeNode root1, TreeNode root2){

        if (root2==null) return true;
        if (root1==null) return false;
        if (root1.val!=root2.val) return false;

        return (isSameTree(root1.left,root2.left)&&isSameTree(root1.right,root2.right));

    }
}
