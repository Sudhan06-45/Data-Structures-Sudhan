package SinglyLL;

public class Main {
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        n1.next = n2;
        System.out.println("First node: " + n1.data);
        System.out.println("Second node: " + n1.next.data);
    }
}
