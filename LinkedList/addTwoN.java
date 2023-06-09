package LinkedList;

public class addTwoN {
    
    class LinkedListNode {
        int data;
        LinkedListNode next;
        
        public LinkedListNode(int data) {
            this.data = data;
        }
    }


public class Solution {
    static LinkedListNode addTwoNumbers(LinkedListNode l1, LinkedListNode l2) {
        LinkedListNode head = new LinkedListNode(1);
        LinkedListNode result = head;
        int carry = 0;

        while(l1 != null && l2 != null){
            int sum = l1.data + l2.data + carry;
            carry = sum/10;
            sum = sum%10;

            LinkedListNode s = new LinkedListNode(sum);
            result.next = s;

            l1=l1.next;
            l2=l2.next;
            result = result.next;
        }

        while(l1!=null){
            int sum = l1.data + carry;
            carry = sum/10;
            sum = sum%10;

            LinkedListNode s = new LinkedListNode(sum);

            result.next = s;

            l1 = l1.next;
            result = result.next; 
        }

        while(l2!=null){
            int sum = l2.data + carry;
            carry = sum/10;
            sum = sum%10;

            LinkedListNode s = new LinkedListNode(sum);

            result.next = s;

            l2 = l2.next;
            result = result.next; 
        }

        if(carry!=0){
            
            LinkedListNode s = new LinkedListNode(carry);

            result.next = s;
        }

        return head.next;
    }
}
}
