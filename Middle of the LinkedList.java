class Solution {
    public ListNode middleNode(ListNode head) {
        if (head == null)
            return null;

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next; // Move fast pointer two steps
            slow = slow.next;     // Move slow pointer one step
        }

        return slow;
    }
}
