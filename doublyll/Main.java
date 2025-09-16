package doublyll;

public class Main {
    public static void main(String[] args) {
        DLLOperations dll = new DLLOperations();

        // Insertions
        System.out.println("Inserting at the start:");
        dll.ins_beg(20);
        dll.ins_beg(10);
        // traversal
        dll.display();
        System.out.println("Inserting at the end:");
        dll.ins_end(30);
        dll.ins_end(40);
        // traversal
        dll.display();
        System.out.println("Inserting at the Specific Position:");
        dll.ins_spec(25, 2);
        dll.display();
        // search
        dll.search(10);

        // deletions
        System.out.println("Deleting from the start:");
        dll.del_beg();
        dll.display();
        System.out.println("Deleting from the end:");
        dll.del_end();
        dll.display();
        System.out.println("Deleting from the Specific Position:");
        dll.del_spec(1);
        dll.display();
    }
}
