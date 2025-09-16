package doublyll;

public class DLLOperations {
    public Node head;
    public Node tail;

    //  traversals
    public void display(){
        Node temp = head;

        if(head == null){
            System.out.println("DLL is empty");
            return;
        }

        while(temp != null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Insertions
    // Insert at the beginning
    public void ins_beg(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;    
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    // Insert at the end
    // Insert at the end
public void ins_end(int data) {
    Node newNode = new Node(data);
    if (head == null) {
        head = tail = newNode;
        return;
    }
    tail.next = newNode;
    newNode.prev = tail;
    tail = newNode;  
}


    // Insert at a given position
    public void ins_spec(int data,int pos){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        if(pos == 0){
            ins_beg(data);
            return;
        }
        Node curr = head;
        int count = 0;

        while(curr != null && count < pos-1){
            curr = curr.next;
            count++;
        }
        if(curr == null){
            System.out.println("Position out of bounds, inserting at the end");
            ins_end(data);
            return;
        }
        curr.next.prev = newNode;
        newNode.next = curr.next;
        newNode.prev = curr;
        curr.next = newNode;

    }

    // Searching
    public void search(int key){
        Node temp = head;
        int pos = 0;

        if(head == null){
            System.out.println("DLL is empty");
            return;
        }

        while(temp != null){
            if(temp.data == key){
                System.out.println("Element " + key + " found at position " + pos);
                return;
            }
            temp = temp.next;
            pos++;
        }
        System.out.println("Element " + key + " not found in the DLL");
    }

    // deletions
    // Delete from the beginning
    public void del_beg(){
        if(head == null){
            System.out.println("DLL is empty");
            return;
        }
        if(head.next == null){
            head = null;
            tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    // Delete from the end
    public void del_end() {
    if (head == null) {
        System.out.println("DLL is empty");
        return;
    }
    if (head == tail) { 
        head = tail = null;
        return;
    }

    Node temp = tail;
    tail = tail.prev;
    tail.next = null;
    temp.prev = null; 
}

    // Delete from a specific position
    public void del_spec(int pos){
        if(head == null){
            System.out.println("DLL is empty");
            return;
        }
        if(pos == 0){
            del_beg();
            return;
        }
        Node curr = head;
        Node back = null;
        int count = 0;

        while(curr != null && count < pos){
            back = curr;
            curr = curr.next;
            count++;
        }
        if(curr == null){
            System.out.println("Position out of bounds");
            return;
        }
        if(curr.next == null){
            del_end();
            return;
        }
        
        back.next = curr.next;
        curr.next.prev = back;
    }
}
