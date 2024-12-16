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

    // Sort the linked list containing only 0s and 1s
    public void sortZeroOneList() {
        int zero_count=0;
        int one_count=0;
        Node current=head;
        while(current!=null)
        {
            if(current.data==0)
            {
                zero_count++;
            }
            else{
                one_count++;
            }
            current=current.next;
        }
    Node start= head;
    while(zero_count>0)
    {
        start.data=0;
        start=start.next;
        zero_count--;
    }

    while(one_count>0)
    {
        start.data=1;
        start=start.next;
        one_count--;
    }

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

public class SortZeroOneList {  // Ensure this matches the filename
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Default input array of 0s and 1s
        int[] input = {1, 0, 1, 0, 1, 0, 0, 1};

        // Add elements to the linked list
        for (int num : input) {
            list.add(num);
        }

        System.out.println("Original list:");
        list.printList();

        // Sort the linked list
        list.sortZeroOneList();  // Call the sorting method

        System.out.println("Sorted list:");
        list.printList();
    }
}
