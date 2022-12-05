// https://leetcode.com/problems/intersection-of-two-linked-lists/
package Leet_Code;

public class Program160 {
    public static void main(String[] args) {
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);
        headA.next.next.next = new ListNode(4);
        headA.next.next.next.next = new ListNode(5);

        ListNode headB = new ListNode(1);
        headB.next = new ListNode(2);
        headB.next.next = new ListNode(2);
        headB.next.next.next = new ListNode(4);
        headB.next.next.next.next = new ListNode(5);
        Program160 p = new Program160();
        System.out.print("HeadA: ");
        p.printNode(headA);
        System.out.print("\nHeadB: ");
        p.printNode(headB);
        Solution160 s = new Solution160();
        System.out.println();
        p.printNode(s.getIntersectionNode(headA, headB));
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

class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode ptrA = headA, ptrB = headB;
    while (ptrA != ptrB) { 
        ptrA = ptrA == null ? headB : ptrA.next;
        ptrB = ptrB == null ? headA : ptrB.next;
	}
	return ptrA;
    }
}
