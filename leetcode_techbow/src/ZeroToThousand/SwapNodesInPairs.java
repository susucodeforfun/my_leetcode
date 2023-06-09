package ZeroToThousand;

import LinkedList.ListNode;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode newHead = head.next;
        head.next = swapPairs(head.next.next);
        newHead.next = head;
        return newHead;
    }
}
