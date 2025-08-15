package DoublyLinkedList;

public class LinkedListD {

    private Node head;
    private Node tail;
    int size = 0;

    public void addFromFront(Employee employee){
        Node node = new Node(employee);

        if(head ==null){
            tail = node;
        } else {
            head.setPrevious(node);
        }
        node.setNext(head);
        head = node;
        size++;
    }

    public void addFromEnd(Employee employee){
        Node node = new Node(employee);

        if(tail == null){
            head = node;
        } else {
            tail.setNext(node);
        }
        node.setPrevious(tail);
        tail = node;
        size++;
    }

    public void addBefore(Employee existingEmp, Employee newEmployee){
        Node curr = head;
        Node preNode = null;
        Node node = new Node(newEmployee);
        while(curr != null){
            if(curr.getEmployee().getName().equals(existingEmp.getName()) && preNode == null){
                node.setNext(head);
                head.setPrevious(node);
                head =node;
                return;
            } else if(curr.getEmployee().getName().equals(existingEmp.getName()) && preNode != null){
                preNode.setNext(node);
                node.setPrevious(preNode);
                node.setNext(curr);
                curr.setPrevious(node);
                return;
            }else {
                preNode = curr;
                curr = curr.getNext();
            }
        }
    }

    public Node removeFromFront(){
        if(isEmpty()) return null;
        Node remove = head;

        if(head.getNext() == null){
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }
        head = head.getNext();
        remove.setNext(null);
        return remove;
    }

    public Node removeFromENd(){
       if(tail == null){
           return null;
       }
       Node remove = tail;
       if(tail.getPrevious() == null){
           head = null;
       } else{
           tail.getPrevious().setNext(null);
       }

       remove.setPrevious(null);
       tail = tail.getPrevious();
       return remove;

    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }


    public void printFromFront(){
        Node curr = head;
        System.out.print("Head -> ");
        while(curr != null){
            System.out.print(curr);
            System.out.print(" -> ");
            curr = curr.getNext();
        }
        System.out.println("null");
    }
}
