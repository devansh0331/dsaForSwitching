// https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/?envType=problem-list-v2&envId=plakya4j

class Oct19_2026 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head == null) return head;
        if(head.next == null && n == 1) return null;
        

        int length = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            length++;
        }

      
        ListNode ans = head;

        for(int i = 0; i < length - n - 1; i++){
            ans = ans.next;
        }
        
        if(length == n){
            head = head.next;
        }
        else{
            ans.next = ans.next.next;

        }
        return head;
    }
}