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

    // Print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + (current.next != null ? " -> " : ""));
            current = current.next;
        }
        System.out.println();
    }

    // Merge two sorted linked lists
    public static Node mergeTwoLists(Node l1, Node l2) {
        Node duumy= new Node(-1);
        Node current = duumy;
        while(l1!=null && l2!=null)
        {
        if(l1.data<=l2.data)
        {
            current.next= l1;
            l1=l1.next;
            current=current.next;
        }
        else
        {
            current.next=l2;
            l2=l2.next;
            current=current.next;
        }
    }
    if(l1!=null)
    {
        current.next=l1;
    }
    else
    {
        current.next =l2;
    }
    return duumy.next;
    }
}

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        // Adding elements to the first list
        list1.add(1);
        list1.add(3);
        list1.add(5);

        // Adding elements to the second list
        list2.add(2);
        list2.add(4);
        list2.add(6);

        System.out.println("List 1:");
        list1.printList();

        System.out.println("List 2:");
        list2.printList();

        // Merge the two sorted lists
        Node mergedHead = LinkedList.mergeTwoLists(list1.head, list2.head);

        System.out.println("Merged List:");
        Node current = mergedHead;
        while (current != null) {
            System.out.print(current.data + (current.next != null ? " -> " : ""));
            current = current.next;
        }
        System.out.println();
    }
}
