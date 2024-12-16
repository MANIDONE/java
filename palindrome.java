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
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Function to check if the linked list is a palindrome
    public boolean isPalindrome() {

        Node slow= head;
        Node fast= head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
       Node first_head= head;
       Node reves_head= reverseList(slow);

       while(reves_head!=null)
       {
           if(first_head.data!=reves_head.data)
           {
            return false; 
           }

           first_head=first_head.next;
           reves_head=reves_head.next;
       }
       return true;
    }

    // Helper function to reverse a linked list
    private Node reverseList(Node head) {
        Node previous = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    // Print the linked list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

 class palindrome {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add elements to the list
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(1);

        // Print the linked list
        System.out.println("Linked List:");
        list.printList();

        // Check if the linked list is a palindrome
        if (list.isPalindrome()) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}
 