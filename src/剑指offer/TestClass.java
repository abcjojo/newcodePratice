package 剑指offer;

import jdk.nashorn.internal.ir.SplitNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class TestClass {

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

    @Test
    public void test(){
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        TreeNode node9 = new TreeNode(9);
        TreeNode node10 = new TreeNode(10);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        node3.left = node6;
        node3.right = node7;


        node6.left = node8;
        node7.right = node9;

        //printTree(node1);
        System.out.println(Print(node1));

    }

    public ArrayList<ArrayList<Integer>> temp(TreeNode pNode){

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        if (pNode == null)
            return res;

        ArrayList<Integer> list = new ArrayList<>();
        Deque<TreeNode> queue = new LinkedList<>();

        boolean flag = true;
        TreeNode last = pNode;
        TreeNode nlast = null;
        TreeNode node = pNode;

        queue.add(node);

        while (!queue.isEmpty()) {
            if (flag) {

                node = queue.pollFirst();
                list.add(node.val);

                if (node.left != null){
                    nlast = nlast == null ? node.left : nlast;
                    queue.addLast(node.left);
                }
                if (node.right != null) {
                    nlast = nlast == null ? node.right : nlast;
                    queue.addLast(node.right);
                }

            }else{

                node = queue.pollLast();
                list.add(node.val);

                if (node.right != null) {
                    nlast = nlast == null ? node.right : nlast;
                    queue.addFirst(node.right);
                }

                if (node.left != null) {
                    nlast = nlast ==null ? node.left : nlast;
                    queue.addFirst(node.left);
                }
            }
            if (node == last) {
                res.add(list);
                if (!queue.isEmpty()) {
                    flag = !flag;
                    last = nlast;
                    nlast = null;
                    list = new ArrayList<>();
                }
            }
        }

        return res;
    }
}
