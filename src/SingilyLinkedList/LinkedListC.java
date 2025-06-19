package SingilyLinkedList;

public class LinkedListC {

    private Node head;
    private int size;

    public void addEmployee(Employee emp){
        Node node = new Node(emp);
        node.setNext(head);
        head = node;
        size++;
    }

    public Employee removeEmployee(){
        if(head == null){
            System.out.println("no record found");
            return null;
        }
        Employee remove = head.getEmployee();
        head = head.getNext();
        size--;
        return remove;
    }

    public int size(){
        return size;
    }

    public void printEmployee(){
        Node curr = head;
        System.out.print("Head -> ");
        while(curr !=null){
            System.out.print(" -> " + curr);
            curr = curr.getNext();
        }
    }
}
