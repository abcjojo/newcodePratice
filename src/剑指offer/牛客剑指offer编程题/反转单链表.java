package 剑指offer.牛客剑指offer编程题;

import org.junit.Test;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-10-12 22:15
 **/
public class 反转单链表 {
    public ListNode ReverseList(ListNode head) {

        ListNode preNode = null;
        ListNode curNode = head;
        ListNode nextNode = null;
        ListNode temp = curNode;
        while (curNode != null) {
            temp = curNode;
            nextNode = curNode.next;
            curNode.next = preNode;

            preNode = curNode;
            curNode = nextNode;
        }

        return temp;
    }

    @Test
    public void test(){
        int array[] = {1,2,3,4,5};
        ListNode list = buildListNode(array);

        ListNode head = list;
        while (head != null) {
            System.out.print(head.val+"  ");
            head = head.next;
        }
        System.out.println();
        ListNode rehead = ReverseList(list);
        while (rehead != null) {
            System.out.print(rehead.val+"  ");
            rehead = rehead.next;
        }

    }

    public ListNode buildListNode(int[] array){

        ListNode head = new ListNode(array[0]);
        ListNode curNode = head;

        for (int i=1; i<array.length; i++){
            ListNode tmp = new ListNode(array[i]);
            curNode.next = tmp;
            curNode = curNode.next;
        }
        return head;
    }
}
