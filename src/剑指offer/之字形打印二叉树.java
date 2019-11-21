package 剑指offer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class 之字形打印二叉树 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        if (pRoot == null)
            return res;

        ArrayList<Integer> list = new ArrayList<>();
        Deque<TreeNode> queue = new LinkedList<>();

        queue.addFirst(pRoot);
        TreeNode last = pRoot;
        boolean flag = true;
        TreeNode nextlast = null;
        TreeNode node = null;

        while (!queue.isEmpty()) {

            if (flag) {
                node = queue.pollFirst();

                if (node.left!=null){
                    nextlast = nextlast == null ? node.left : nextlast;
                    queue.addLast(node.left);
                }
                if (node.right != null) {
                    nextlast = nextlast == null ? node.right : nextlast;
                    queue.addLast(node.right);
                }
                list.add(node.val);
            }else{
                node = queue.pollLast();

                if (node.right != null) {
                    nextlast = nextlast == null ? node.right : nextlast;
                    queue.addFirst(node.right);
                }
                if (node.left != null) {
                    nextlast = nextlast == null ? node.left : nextlast;
                    queue.addFirst(node.left);
                }
                list.add(node.val);
            }

            if (last == node) {
                res.add(list);
                list = new ArrayList<>();

                last = nextlast;
                nextlast = null;
                flag = !flag;
            }

        }



        return res;
    }
    //层序遍历二叉树
    public void printTree(TreeNode pNode) {

        ArrayList<Integer> list = new ArrayList<>();
        if (pNode == null)
            return;

        LinkedList<TreeNode> queue = new LinkedList<>();

        queue.add(pNode);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            list.add(node.val);

            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }

        System.out.println(list);
    }
}















