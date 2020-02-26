package 剑指offer.牛客剑指offer编程题;

import org.junit.Test;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-08-21 22:2
 **/
public class 删除链表中重复的节点 {
        public ListNode deleteDuplication(ListNode pHead) {

            if (pHead==null || pHead.next==null){return pHead;}

            ListNode Head = new ListNode(0);
            Head.next = pHead;

            ListNode preNode = pHead;
            ListNode curNode = pHead.next;

            while (curNode != null) {
                if (curNode.next!=null && curNode.val == curNode.next.val) {
                    while (curNode.next!=null&&curNode.val == curNode.next.val) {
                        curNode = curNode.next;
                    }
                    preNode.next = curNode.next;
                    curNode = curNode.next;
                }else{
                    preNode = preNode.next;
                    curNode= curNode.next;
                }
            }
            return Head.next;
        }
        @Test
        public void test(){

            ListNode l0 = new ListNode(1);
            ListNode l1 = new ListNode(1);
            ListNode l2 = new ListNode(1);
            ListNode l3 = new ListNode(1);
            ListNode l4 = new ListNode(1);
            ListNode l5 = new ListNode(1);
            ListNode l6 = new ListNode(1);
            ListNode l7 = new ListNode(5);

            l0.next = l1;
            l1.next = l2;
            l2.next = l3;
            l3.next = l4;
            l4.next = l5;
            l5.next = l6;
            l6.next = l7;
//            ListNode head = l1;
//            while (head != null){
//                System.out.print(head.val+"  ");
//                head = head.next;
//            }
//            System.out.println();

            ListNode head = deleteDuplication(l0);
            while (head != null){
                System.out.print(head.val+"  ");
                head = head.next;
            }
        }
}