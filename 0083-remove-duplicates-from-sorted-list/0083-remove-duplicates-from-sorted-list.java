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
    public ListNode deleteDuplicates(ListNode head) {
          ListNode curnode = head;
          while(curnode != null && curnode.next!=null){
            if(curnode.val == curnode.next.val){
                curnode.next = curnode.next.next;
            }else{
                curnode = curnode.next;
            }
          }
          return head;
    }
}