/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        // three pointers approch(in-place)
        ListNode prev = null; // it's coming from back/last
        ListNode current = head; // itcomes from the first
        while(current != null){  // untill the current flow not becomes null
            ListNode next = current.next; //to track present list
            current.next = prev; // to reverse the list
            prev = current; //  we move prev to current
            current = next; // to get back to track
        }
        return prev; // returning the new LinkedList
    }
}