
import java.util.LinkedList;

class rearange_even_odd{
 class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class linkedList {
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

    // Rearrange linked list such that all odd-indexed nodes are listed first followed by even-indexed nodes
    public void rearrangeEvenOdd() {
       if(head!=null && head.next==null)
       {
        System.out.print("no need to rearanged");
        return;
       }
        Node odd= head;
        Node even= head.next;
        Node even_head= even;
       while(even!=null && even.next!=null)
       {
        odd.next=even.next;
        odd=odd.next;
        even.next=odd.next;
        even=even.next;
       }
       odd.next=even_head;
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

 
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Print the original linked list
        System.out.println("Original list:");
        list.printList();

        // Rearrange the list to group odd and even indexed nodes
        list.rearrangeEvenOdd();

        // Print the rearranged linked list
        System.out.println("Rearranged list (odd-indexed followed by even-indexed):");
        list.printList();
    }
}
 
--------------------------------------------------------------------------------------------------------------------------------

class RearrangeEvenOdd {
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

        // Rearrange linked list such that all odd-indexed nodes are listed first followed by even-indexed nodes
        public void rearrangeEvenOdd() {
            if (head == null || head.next == null) {
                System.out.print("No need to rearrange");
                return;
            }

            Node odd = head;
            Node even = head.next;
            Node evenHead = even;

            while (even != null && even.next != null) {
                odd.next = even.next; // Link odd nodes
                odd = odd.next;       // Move to the next odd node
                even.next = odd.next; // Link even nodes
                even = even.next;     // Move to the next even node
            }
            odd.next = evenHead; // Link the end of odd nodes to the head of even nodes
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

    public static void main(String[] args) {
        RearrangeEvenOdd rearranger = new RearrangeEvenOdd();
        LinkedList list = rearranger.new LinkedList();

        // Add elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Print the original linked list
        System.out.println("Original list:");
        list.printList();

        // Rearrange the list to group odd and even indexed nodes
        list.rearrangeEvenOdd();

        System.out.println("Rearranged list (odd-indexed followed by even-indexed):");
        list.printList();
    }
}
