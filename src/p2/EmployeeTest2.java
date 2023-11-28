package p2;

import p1.Employee;

public class EmployeeTest2 {
    public static void main(String[] args) {
        Employee emp4 = new Employee("Сергей", 25);
        //Employee emp2 = new Employee(10,"Иван",20,"IT"); нельзя, стоит default
        //Employee emp3 = new Employee(11,"Степан",30,500.3,"IT"); нельзя, стоит private
        emp4.showId();
        emp4.showSalary();
        emp4.showSurname();
        //System.out.println(emp1.salary); нельзя, стоит private
        //System.out.println(emp4.id); нельзя, стоит default
        System.out.println(emp4.surname);
    }
}
