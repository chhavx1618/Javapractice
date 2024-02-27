class stackll{
    public static void main(String[] args) {
        stack myStack = new stack();

        myStack.push(1);
        myStack.peek();
        myStack.push(2);
        myStack.peek();
        myStack.push(3);
        myStack.peek();
        myStack.pop();
        myStack.size();
        myStack.pop();
        myStack.pop();
        myStack.isEmpty();
        myStack.pop();
        myStack.size();
    }
}

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class stack {


    Node head;
    int size;


    public stack(){
        head=null;
        size=0;
    }


    void push(int data){


        Node temp = new Node(data);
        temp.next=head;
        size++;
        head=temp;


    }

    int peek(){
        if (head==null){
            System.out.println("stack empty");
            return -1;
        }
       // System.out.println(head);
        System.out.println(head.data);
        return head.data;
    }

    int pop(){
        if (head==null){
            System.out.println("empty");
            return -1;
        }
        int res = head.data;
        head=head.next;
        size--;
        System.out.println(res);
        return res;
        
    }

    boolean isEmpty(){
        System.out.println((head==null));
        return (head==null);
    }

    int size(){
        System.out.println(size);
        return size;
    }

}
