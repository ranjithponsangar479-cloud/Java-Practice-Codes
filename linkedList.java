class Node
{
    int data;
    Node next;

    public Node(int data) 
    {
        this.data = data;
        this.next = null;
    }
}

public class Main 
{
    public static void main(String[] args)
    {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        head.next = second;
        second.next = third;
        System.out.print("Linked List: ");
        Node current = head;
        
        while (current != null) 
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}