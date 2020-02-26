package 剑指offer.牛客剑指offer编程题;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-10-19 18:52
 **/
public class 二叉树中序遍历的下一个节点 {

    public TreeLinkNode GetNext(TreeLinkNode pNode) {

        if (pNode==null) return null;

        if (pNode.right != null) {
            pNode = pNode.right;

            while(pNode.left!=null){
                pNode = pNode.left;
            }
            return pNode;
        }

        while (pNode.next != null) {
            if (pNode.next.left == pNode) {
                return pNode.next;
            }
            pNode = pNode.next;
        }

        return null;
    }

}
