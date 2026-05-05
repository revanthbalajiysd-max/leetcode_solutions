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
    public ListNode rotateRight(ListNode head, int k) {
      if(head == null || head.next == null || k == 0) return head;
      /* if head or one element in the list or no.of rotations zero then return the head because only one element is present 
      if not then find the length given list*/
      ListNode current = head;
      int n = 0;
      while(current != null){
        n++;
        current = current.next;
      }  
      k %= n; // to remove the unwanted fully cycle rotation or Normalize
      if(k == 0){
        return head;
      }
      ListNode slow = head, fast = head; // two pointers we create slow and fast, fast move k time forward
      for(int i = 0; i < k; i++){
        fast = fast.next;
      }
      while(fast.next != null){ // now both moving together
        fast = fast.next;
        slow = slow.next;
      }
      ListNode newHead = slow.next; // assign next value of slow
      slow.next = null; // breaking the slow next node now it divided into two parts
      fast.next = head; // lastNode is attached to head means front part
      return newHead; // just starting from the new node that it
    }
}