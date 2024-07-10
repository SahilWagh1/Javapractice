import java.util.Scanner;

public class linkedlist {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node insertNode = new Node(data);

        if (head == null) {
            head = insertNode;
            tail = insertNode;
        } else {
            tail.next = insertNode;
            tail = insertNode;
        }
    }

    public void display() {
        Node curNode = head;

        if (curNode == null) {
            System.out.println("Linkedlist is empty!");
        }
        while (curNode != null) {
            System.out.println(curNode.data);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        Scanner sc = new Scanner(System.in);
        System.out.println("how many elements do you want add?");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            list.addNode(sc.nextInt());
        }
        sc.close();
        list.display();
    }
}
