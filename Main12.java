public class Main12 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class SortedChain {
        Node head;

        public void insert(int data) {
            Node newNode = new Node(data);
            if (head == null || head.data >= newNode.data) {
                newNode.next = head;
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null && current.next.data < newNode.data) {
                    current = current.next;
                }
                newNode.next = current.next;
                current.next = newNode;
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

    public static void main(String[] args) {
        SortedChain sc = new SortedChain();
        sc.insert(10);
        sc.insert(5);
        sc.insert(20);
        sc.insert(3);
        sc.display(); // Output will be in sorted order: 3 5 10 20
    }
}
