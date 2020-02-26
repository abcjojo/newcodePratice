package 剑指offer.牛客剑指offer编程题;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-08-28 18:12
 **/
public class 合并两个排序的链表 {
    public ListNode Merge(ListNode list1,ListNode list2) {
         if (list1 == null && list2 == null) return null;
         if (list1 == null) return list2;
         if (list2 == null) return list1;

         ListNode root = new ListNode(0);
         ListNode curNode = root;
         while (list1 != null && list2 != null){
             if (list1.val <= list2.val){
                 curNode.next = list1;
                 ;list1 = list1.next;
             }else{
                 curNode.next = list2;
                 list2 = list2.next;
             }
             curNode = curNode.next;
         }
        while (list1 != null) {
            curNode.next = list1;
            list1 = list1.next;
            curNode = curNode.next;
        }
        while (list2 != null) {
            curNode.next = list2;
            list2 = list2.next;
            curNode = curNode.next;
        }
        return root.next;
    }
}
