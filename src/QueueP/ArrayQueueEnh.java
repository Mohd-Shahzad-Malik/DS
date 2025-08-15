package QueueP;

import java.util.EmptyStackException;

public class ArrayQueueEnh {
    private int front;
    private int back;
    private Employee[] employees;

    public ArrayQueueEnh(int capacity){
        employees = new Employee[capacity];
    }

    public void add(Employee employee){
        if(size() == employees.length-1){
            Employee [] emp = new Employee[2*employees.length];
            System.arraycopy(employees, 0, emp, 0, employees.length);
            employees = emp;
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
        }
        return  employee;
    }

    private int size(){
        return back - front;
    }
 }
