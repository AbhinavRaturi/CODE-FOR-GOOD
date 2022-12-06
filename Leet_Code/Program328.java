// https://leetcode.com/problems/odd-even-linked-list/description/
package Leet_Code;

public class Program328 {
    public static void main(String[] args) {
        ListNode headA = new ListNode(1);
        // 1,2,3,4,5,6,7,8
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);
        headA.next.next.next = new ListNode(4);
        headA.next.next.next.next = new ListNode(5);
        headA.next.next.next.next.next = new ListNode(6);
        headA.next.next.next.next.next.next = new ListNode(7);
        headA.next.next.next.next.next.next.next = new ListNode(8);
        
        
        Program328 p = new Program328();
        p.printNode(headA);
        Solution s = new Solution();
        System.out.println();
        p.printNode(s.oddEvenList(headA));
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
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return head;
        }
        int counter = 0;
        ListNode endNode = head, tempNode = head;
        while(endNode.next != null){
            endNode = endNode.next;
            counter++;
        }
        if(counter %2 == 1)
            counter = (counter/2)+1;
        else   
            counter = (counter/2);
        while(counter-- >0){
            endNode.next = tempNode.next;
            tempNode.next = tempNode.next.next;
            endNode.next.next = null;
            tempNode =tempNode.next;
            endNode = endNode.next;
        }
        return head;
    }
}