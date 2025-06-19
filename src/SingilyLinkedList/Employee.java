package SingilyLinkedList;

public class Employee {

    private int id;
    private String Name;
    private String Designation;

    public Employee(int id, String designation, String name) {
        this.id = id;
        Designation = designation;
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Designation='" + Designation + '\'' +
                '}';
    }
}
