

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    // Add a new node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current= head;
        Node previous=null;
        while(current!=null)
        {
            previous=current;
            current=current.next;
        }
        previous.next= newNode;
    }

    // Print all the nodes of the linked list
    public void printList() {
        Node current = head;
        if (current == null) {
            System.out.println("The list is empty.");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Delete a node by value
    public void delete(int data) {
        if(head.data==data)
        {
            head=head.next;
            return;
        }
        Node newNode = new Node(data);
        Node current=head;
        if (head == null) {
            head = newNode;
            return;
        }
        Node previous = null;
        while (current != null && current.data != data) {
            previous = current;
            current = current.next;
        }

       
        if (current != null) {
            previous.next = current.next;
        }
        

    }

    // Search for a node in the linked list by value
    public boolean  search(int data) {
       
        if(head==null)
        {
            return false;
        }
        Node current=head;
        while(current!=null)    {
            if(current.data==data)
            {
                return true;
            }
            current=current.next;
        }   
        return false;
    }

    // Insert a new node at the beginning of the list
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }// Insert a new node at the kth position in the list
    public void insertAtKthPosition(int data, int k) {
        Node newNode = new Node(data);
        if (k == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for (int i = 0; i < k - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            return;
        }
        newNode.next = current.next;
        current.next = newNode;

    }

    // Reverse the linked list
    public void reverse() {
        Node previous = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }      
        head = previous;

    

    }

    /* private static class delete {

        public delete() {     

        }
    } */

    public void mid_element() { 
       
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("The middle element is: " + slow.data);
       
    }
}

public class linkedlist{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(0);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Print the linked list
        System.out.println("Original List:");
        list.printList();

        // Insert at the head
         System.out.println("\nAfter inserting 18 at the head:");
         list.insertAtHead(18);
         list.printList();
 
        // // Insert at kth position
         System.out.println("\nAfter inserting 25 at position 3:");
         list.insertAtKthPosition(25, 3);
         list.printList();

        // // Delete a node
         System.out.println("\nAfter deleting node with value 20:");
         list.delete(0);
        
         list.delete(20);
         list.printList();

        // // Search for a value
         System.out.println("\nSearch for value 30:");
         boolean found = list.search(30);
         System.out.println("Found: " + found);

        // // Reverse the linked list
         System.out.println("\nAfter reversing the list:");
         list.reverse();
         list.printList();

         System.out.println("\n After find mid element");
         list.mid_element();
         list.printList();
        
    }
}
