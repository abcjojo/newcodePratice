package 剑指offer.牛客剑指offer编程题;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-08-25 10:57
 **/

public class 链表的倒数第k个节点 {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (k<1) return null;
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < k - 1 && fast != null; i++){
            fast = fast.next;
        }
        if (fast == null) {
            return null;
        }

        while (fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
