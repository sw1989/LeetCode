/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            if (l2 == null) {
                return null;
            } else {
                return l2;
            }
        } else if (l2 == null) {
            return l1;
        } else {
            ListNode start;
            ListNode pointer;
            ListNode pointer1;
            ListNode pointer2;
            
            if (l1.val >= l2.val) {
                start = l2;
                pointer = l2;
                pointer1 = l1;
                
                if (l2.next != null) {
                    pointer2 = l2.next;
                } else {
                    l2.next = l1;
                    return start;
                }
            } else {
                start = l1;
                pointer = l1;
                pointer2 = l2;
                
                if (l1.next != null) {
                    pointer1 = l1.next;
                } else {
                    l1.next = l2;
                    return start;
                }
            }
            
            
            while(pointer1 != null || pointer2 != null) {
                
                if (pointer1 == null) {
                    pointer.next = pointer2;
                    break;
                } else if (pointer2 == null) {
                    pointer.next = pointer1;
                    break;
                } else {
                    if(pointer1.val >= pointer2.val) {
                        pointer.next = pointer2;
                        pointer = pointer.next;
                        pointer2 = pointer2.next;
                    } else {
                        pointer.next = pointer1;
                        pointer = pointer.next;
                        pointer1 = pointer1.next;
                    }
                }
            }
            
            return start;
        }
    }
    
}