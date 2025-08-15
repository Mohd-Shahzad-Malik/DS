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

    public void addEmployee(Integer emp){
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

    public void sortedList(Integer num){
        if(head == null || head.getNum() >= num){
            addEmployee(num);
            return;
        }
        //find insertion point
        Node curr = head.getNext();
        Node previous = head;
        while(curr != null && curr.getNum() < num){
            previous = curr;
            curr = curr.getNext();
        }

        Node node = new Node(num);
        node.setNext(curr);
        previous.setNext(node);
        size++;
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
