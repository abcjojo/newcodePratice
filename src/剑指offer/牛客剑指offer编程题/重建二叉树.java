package 剑指offer.牛客剑指offer编程题;

/**
 * @program: exercise
 * @description:  输入前序和中序 返回树
 * @author: Jojo.Lee
 * @create: 2019-08-24 21:34
 **/

class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
}

public class 重建二叉树 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return this.buildTree(pre,0,pre.length-1, in, 0, in.length-1);
    }
    private TreeNode buildTree(int [] preTree, int start1, int end1, int [] inTree, int start2, int end2){
        if (start1 > end1 || start2 > end2) return null;
        int rootdata = preTree[start1];
        TreeNode root = new TreeNode(rootdata);
        //在中序数组中找到当前根节点的位置
        int rootIndex = findRootIndex(inTree, rootdata);
        int offset = rootIndex-start2-1;
        TreeNode left = buildTree(preTree, start1+1, start1+1+offset, inTree,start2,start2+offset);
        TreeNode right = buildTree(preTree,start1+offset+2,end1,inTree,rootIndex+1,end2);
        root.left = left;
        root.right = right;
        return root;
    }
    public int findRootIndex(int [] inTree, int x){
        for (int i = 0; i < inTree.length; i++){
            if (inTree[i] == x) return i;
        }
        return -1;
    }

    //后序遍历    左 右  根节点
    public void postOrder(TreeNode localroot){
        if (localroot!=null){
            postOrder(localroot.left);
            postOrder(localroot.right);
            System.out.print(localroot.val+" ");
        }
    }
    public static void main(String[] args) {
        int [] pre = {1,2,4,8,9,5,10,3,6,7};
        int [] in = {8,4,9,2,10,5,1,6,3,7};
        重建二叉树 tree= new 重建二叉树();
        tree.postOrder(tree.reConstructBinaryTree(pre,in));
    }
}












