public class ll1{
    Node head; // This is the class member
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        ll1 list = new ll1();
        list.head = n1; // Assigning n1 to the class member head
        n1.next = n2;
        list.insert(30, 2);
        list.traverse();
    }

    void insert(int data, int position){
        // Node head = new Node(12);
        Node toAdd = new Node(data);
        if (position == 0){
            toAdd.next=head;
            head=toAdd;
            return;
        }

        Node prev = head;

        for(int i = 0; i<position-1; i++){
            prev=prev.next;
        }
        toAdd.next=prev.next;
        prev.next=toAdd;
    }

    void traverse(){
        Node cur = head;
        while (cur != null){
            System.out.println(cur.data);
            cur=cur.next;
        }
    }
}

class Node{
    int data;
    Node next;
    Node (int data){
        this.data=data;
        next=null;
    }
}