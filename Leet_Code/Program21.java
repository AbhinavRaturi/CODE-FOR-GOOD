package Leet_Code;

public class Program21 {
    public static void main(String[] args) {
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(4);


        ListNode headB = new ListNode(1);
        headB.next = new ListNode(3);
        headB.next.next = new ListNode(4);


        Program21 p = new Program21();
        Solution21 s = new Solution21();
        p.printNode(s.mergeTwoLists(headA, headB));
        
    }

    public void printNode(ListNode head) {
        ListNode tempHead = head;
        while (tempHead != null) {
            System.out.print(tempHead.val + " ");
            tempHead = tempHead.next;
        }
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummNode = new ListNode(0);
        ListNode taiNode = dummNode;
        while(true){
            if(list1 == null){
                taiNode.next = list2;
                break;
            }
            if(list2 == null){
                taiNode.next = list1;
                break;
            }
            if(list1.val <= list2.val){
                taiNode.next = list1;
                list1 = list1.next;    
            }
            else{
                taiNode.next = list2;
                list2 = list2.next;
            }
            taiNode = taiNode.next;
        }
        return dummNode.next;
    }
}