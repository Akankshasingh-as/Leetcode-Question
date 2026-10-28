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
    public boolean isPalindrome(ListNode head) {
       ListNode slow = head;
       ListNode fast = head;
       while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
       }
       ListNode second = reverse(slow);
       ListNode first = head;
       boolean b = true;
       while(second != null){
        if(first.val != second.val){
            b = false;
            break;
        }
        second = second.next;
        first = first.next;
       }
       return b;
    }
    public static ListNode reverse(ListNode h){
        ListNode pre  = null;
        ListNode cur = h;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}