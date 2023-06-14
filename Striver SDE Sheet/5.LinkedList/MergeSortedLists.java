// Easy Solution present in Program 21 of LeetCode
public class MergeSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        if(list1.val > list2.val){
            ListNode tempNode = list1;
            list1 = list2;
            list2 = tempNode;
        }
        ListNode resNode = list1;
        while(list1 != null && list2 != null){
            ListNode temp = null;
            while(list1 != null && list1.val <= list2.val){
                temp = list1;
                list1 = list1.next;
            }
            temp.next = list2;

            ListNode swapNode = list1;
            list1 = list2;
            list2 = swapNode;
        }
        return resNode;
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