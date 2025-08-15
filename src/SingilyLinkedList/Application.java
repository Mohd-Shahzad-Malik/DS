package SingilyLinkedList;

public class Application {
    public static void main(String[] args) {

        Employee emp = new Employee(1, "java developer", "Shahzad");
        Employee emp1 = new Employee(2, "SECI developer", "Zeba");
        Employee emp2 = new Employee(3, "Business Analyst", "Shahbaz");

        LinkedListC list = new LinkedListC();

//        list.addEmployee(emp);
//        list.addEmployee(emp1);
//        list.addEmployee(emp2);
//        list.printEmployee();

        LinkedListC l = new LinkedListC();
        l.sortedList(4);
        l.sortedList(7);
        l.sortedList(2);
        l.sortedList(5);
        System.out.println(l.size());
        l.printEmployee();;


    }
}
