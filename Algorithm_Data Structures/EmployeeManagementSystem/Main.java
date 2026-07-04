package EmployeeManagementSystem;
public class Main {

    public static void main(String[] args) {

        EmployeeManagement management = new EmployeeManagement(5);

        management.addEmployee(new Employee(101, "Alice", "Manager", 75000));
        management.addEmployee(new Employee(102, "Bob", "Developer", 60000));
        management.addEmployee(new Employee(103, "Charlie", "Tester", 50000));

        System.out.println("\nAll Employees:");
        management.traverseEmployees();

        System.out.println("\nSearching Employee ID 102:");

        Employee emp = management.searchEmployee(102);

        if (emp != null)
            emp.display();
        else
            System.out.println("Employee not found.");

        System.out.println("\nDeleting Employee ID 102");
        management.deleteEmployee(102);

        System.out.println("\nEmployees after deletion:");
        management.traverseEmployees();
    }
}