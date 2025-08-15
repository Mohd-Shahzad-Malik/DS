package StackP;

public class Application {
    public static void main(String[] args) {

        Employee emp = new Employee(1, "java developer", "Shahzad");
        Employee emp1 = new Employee(2, "SECI developer", "Zeba");
        Employee emp2 = new Employee(3, "Business Analyst", "Shahbaz");
        Employee emp3 = new Employee(4, "Home maker", "Musharrat");

        ArrayStack arr = new ArrayStack(10);

        arr.push(emp);
        arr.push(emp1);
        arr.push(emp2);
        arr.push(emp3);

        arr.printStack();

        System.out.println(arr.peek());
        System.out.println(arr.peek());
        System.out.println("pop " +arr.pop());
        System.out.println(arr.peek());

    }
}
