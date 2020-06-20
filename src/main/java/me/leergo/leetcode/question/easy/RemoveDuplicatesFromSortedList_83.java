//83 - 删除排序链表中的重复元素	 

//给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。 
//
// 示例 1: 
//
// 输入: 1->1->2
//输出: 1->2
// 
//
// 示例 2: 
//
// 输入: 1->1->2->3->3
//输出: 1->2->3 
// Related Topics 链表

package me.leergo.leetcode.question.easy;

public class RemoveDuplicatesFromSortedList_83 {
    public static void main(String[] args) {
        Solution solution = new RemoveDuplicatesFromSortedList_83().new Solution();
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(3);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        ListNode cur = a;
        while (cur != null) {
            System.out.printf(cur.val + "\t");
            cur = cur.next;
        }
        System.out.println();
        solution.deleteDuplicates(a);
        cur = a;
        while (cur != null) {
            System.out.printf(cur.val + "\t");
            cur = cur.next;
        }
    }
    
    static class ListNode {
        int val;
        ListNode next;
        
        ListNode(int x) { val = x; }
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode current = head;
            while (current != null && current.next != null) {
                if (current.val == current.next.val) {
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }
            return head;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}