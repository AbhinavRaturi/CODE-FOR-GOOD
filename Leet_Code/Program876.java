//  https://leetcode.com/problems/middle-of-the-linked-list/
package Leet_Code;

public class Program876 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        // head.next.next.next.next = new ListNode(5);
        Program876 p = new Program876();
        p.printNode(head);
        Solution876 s = new Solution876();
        System.out.println("\nCounter : " + s.countNode(head));
        p.printNode(s.middleNode(head));
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

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution876 {
    public ListNode middleNode(ListNode head) {
        int counter = countNode(head);
        counter /=2;
        System.out.println(counter);
        for(int i=0;i<counter;i++){
            head = head.next;
        }

        return head;
    }

    public int countNode(ListNode head) {
        if (head == null)
            return 0;
        ListNode countNode = head;
        int counter = 0;
        while (countNode != null) {
            counter++;
            countNode = countNode.next;
        }
        return counter;
    }
}