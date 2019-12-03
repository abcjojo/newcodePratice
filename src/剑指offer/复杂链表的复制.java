package 剑指offer;

public class 复杂链表的复制 {

    public RandomListNode Clone(RandomListNode pHead) {

        RandomListNode curNode = pHead;

        if (pHead == null) {
            return pHead;
        }

        //第一步，复制每个节点，   例：a->b->c->d ~~~~~ a->a1->b->b1->c->c1->d->d1
        while (curNode != null) {
            RandomListNode copy = new RandomListNode(curNode.label);
            RandomListNode temp = curNode.next;

            curNode.next = copy;
            copy.next = temp;

            curNode = temp;
        }

        curNode = pHead;

        //第二步，将每个复制后的节点的random节点指向该指的节点

        while (curNode != null) {
            curNode.next.random = curNode.random == null? null : curNode.random.next;
            curNode = curNode.next.next;
        }

        //第三步，将复制好的链表从原来的链表中分离出来，变成两个相同的链表
        curNode = pHead;
        RandomListNode head = pHead.next;
        while (curNode != null) {
            RandomListNode temp = curNode.next;
            curNode.next = curNode.next.next;
            temp.next = temp.next == null ? null : temp.next.next;

            curNode = curNode.next;
        }

        return head;
    }
}
