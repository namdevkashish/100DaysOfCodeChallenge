//100 Days of Code Challenge
//LeetCode

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp_node = new ListNode(0);
        ListNode current_node = temp_node;
        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                current_node.next = list1;
                list1 = list1.next;
            }
            else {
                current_node.next = list2;
                list2 = list2.next;
            }
            current_node = current_node.next;    
        }
        if (list1 != null) {
            current_node.next = list1;
            list1 = list1.next;
        }
        if (list2 != null) {
            current_node.next = list2;
            list2 = list2.next;
        }
        return temp_node.next;
    }
}

/*
#TEST CASE 1:
Input
list1 = [1,2,4]
list2 = [1,3,4]

Output
[1,1,2,3,4,4]

#TEST CASE 2:
Input
list1 = []
list2 = []

Output
[]

#TEST CASE 3:
Input
list1 = []
list2 = [0]

Output
[0]

*/
