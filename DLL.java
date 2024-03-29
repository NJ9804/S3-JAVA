import java.util.Scanner;							
class Node								
 {									
    int data;				
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void delete(int key) {
        Node temp = head;

        while (temp != null && temp.data != key) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Element not found in the list.");
            return;
        } else {
            if (temp.prev == null)
                head = temp.next;
            else
                temp.prev.next = temp.next;
            if (temp.next != null)
                temp.next.prev = temp.prev;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class DLL
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();

        int choice;
        while(true) {
            System.out.println("1. Insert an element");
            System.out.println("2. Delete an element");
            System.out.println("3. Display the list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert: ");
                    int item = scanner.nextInt();
                    dll.insert(item);
                    break;
                case 2:
                    System.out.print("Enter the element to delete: ");
                    int deleteElement = scanner.nextInt();
                    dll.delete(deleteElement);
                    break;
                case 3:
                    System.out.println("List elements are:");
                    dll.display();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }

        }

    }
}



