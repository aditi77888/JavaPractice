

public class singlyLinkedList{
    public static void main(String[] args) {
        LinkedListS list = new LinkedListS();

        list.insertAtFirst(20);
        list.insertAtLast(40);
        list.display();
        list.insertAtIndexBefore(30,2);
        list.display();
        list.insertAtIndexBefore(35,3 );
        list.display();
        list.insertAtIndexBefore(10, 1);
        list.display();
        list.insertAtIndexAfter(12, 1);
        list.insertAtIndexAfter(32, 4);
        list.display();
        list.insertAtMiddle(50);
        list.display();
        list.insertAtMiddle(45);
        list.display();
    }
}
