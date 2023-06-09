package LinkedList;

public class deleteFromLast {

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 };

public static Node removeKthNode(Node head, int k)
    {
        Node dummy = new Node(0);
        dummy.next = head;

        Node f = dummy;
        Node s = dummy;

        for(int i=1; i<=k+1; i++){
            f = f.next;
        }

        while(f!=null){
            s=s.next;
            f=f.next;
        }
        s.next = s.next.next;

        return dummy.next;
    }
}

