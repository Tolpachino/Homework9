package p1;

public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public void showSurname() {
        System.out.println(surname);
    }

    public void showId() {
        System.out.println(id);
    }

    public void showSalary() {
        System.out.println(salary);
    }

    private Employee(int id1, String surname1, int age1, double salary1, String department1) {
        id = id1;
        surname = surname1;
        age = age1;
        salary = salary1;
        department = department1;
    }

    Employee(int id1, String surname1, int age1, String department1) {
        this(id1, surname1, age1, 0.0, department1);
    }

    public Employee(String surname1, int age1) {
        this(0, surname1, age1, 0.0, null);
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Сергей", 25);
        Employee emp2 = new Employee(10,"Иван",20,"IT");
        //Employee emp3 = new Employee(11,"Степан",30,500.3,"IT"); нельзя, стоит private
        emp1.showId();
        emp2.showSalary();
        emp2.showSurname();
       //System.out.println(emp1.salary);
        System.out.println(emp1.id);
        System.out.println(emp2.surname);
    }
}