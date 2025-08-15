package DoublyLinkedList;

import SingilyLinkedList.LinkedListC;

public class Application {
    public static void main(String[] args) {

        Employee emp = new Employee(1, "java developer", "Shahzad");
        Employee emp1 = new Employee(2, "SECI developer", "Zeba");
        Employee emp2 = new Employee(3, "Business Analyst", "Shahbaz");

        LinkedListD list = new LinkedListD();

        list.addFromFront(emp);
        list.addFromFront(emp1);
        list.addFromFront(emp2);

        list.printFromFront();
        Employee em = new Employee(4, "Home Maker", "Musharrat");
        list.addBefore(emp2, em);
        list.printFromFront();

    }
}
