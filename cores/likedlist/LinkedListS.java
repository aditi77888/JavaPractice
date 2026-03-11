public class LinkedListS {

    private Node head;
    private Node tail;

    private int size ;

    public LinkedListS(){
        this.size = 0;
    }

    public void insertAtFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail==null){
            tail = head;
        }
        size++;
    }
    public void insertAtLast(int value){
        Node node = new Node(value);
        if(tail == null){
            head = tail = node;
            return;
        }
        tail.next = node;
        tail = node ; 
    }
    public void insertAtIndexBefore(int value,int index){
        Node node = new Node(value);
        if(head == null){
            head=tail=node;
            return;
        }
        if(index==1){
            node.next = head;
            head = node;
            return;
        }
        int position = 1;
        Node temp = head;
        while(position<index-1 && temp.next != null){
            temp = temp.next;
            position++;
        }
        node.next = temp.next;
        temp.next = node;
        if(node.next == null){
        tail = node;
    }
        size++;
    }
    public void insertAtIndexAfter(int value,int index){
        Node node = new Node(value);
        int position = 1;
        Node temp = head;
        if(head == null){
            head = tail = node;
            return;
        }
        while(position < index){
            temp = temp.next;
            position++;
        }
        node.next = temp.next;
        temp.next = node;
        if((index==size)){
            tail = node;
        }
        
    }
    public void insertAtMiddle(int value){
        Node node = new Node(value);
        if(head == null){
            head=tail=node;
            return;
        }
        Node fast = head.next;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        node.next = slow.next;
        slow.next = node;

        size++;
    }
    public void display(){
        if(head==null){
            return;
        }
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("null \n");
    }
    
    private class Node{
        private int data;
        private Node next ;

        Node(int value){
            this.data = value;
            this.next = null;
        }

        Node(int value , Node next){
            this.data = value;
            this.next = next;
        }
    }
    
}
