package QueueP;

import java.util.EmptyStackException;

public class ArrayQueueEnh1 {
    private int front;
    private int back;
    private Employee[] employees;

    public ArrayQueueEnh1(int capacity){
        employees = new Employee[capacity];
    }

    public void add(Employee employee){
        if(size() == employees.length-1){
            int len = size();
            Employee [] emp = new Employee[2*employees.length];
            System.arraycopy(employees, front, emp, 0, employees.length - front);
            System.arraycopy(employees, 0, emp, employees.length-front, back);
            employees = emp;

            front = 0;
            back = len;
         }
        employees[back] = employee;
        if(back < employees.length-1){
            back++;
        } else {
            back = 0;
        }
    }

    public Employee remove(){
        if(size()==0){
            throw new EmptyStackException();
        }

        Employee employee = employees[front];
        employees[front] = null;
        front++;
        if(size() == 0){
            back = 0;
            front =0;
        } else if (front == employees.length){
            front = 0;
        }
        return  employee;
    }

    private int size(){
        if(front <= back){
            return back - front;
        } else {
            return  back - front + employees.length;
        }
    }

    public void printQueue(){
        if(front <= back){
            for (int i = front; i < back; i++) {
                System.out.println(employees[i]);
            }
        } else {
            for (int i = front; i < employees.length; i++) {
                System.out.println(employees[i]);
            }
            for (int i = 0; i < back; i++) {
                System.out.println(employees[i]);
            }
        }
    }
 }
