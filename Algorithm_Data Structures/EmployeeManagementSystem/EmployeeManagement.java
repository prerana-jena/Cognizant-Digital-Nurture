package EmployeeManagementSystem;
public class EmployeeManagement {

    private Employee[] employees;
    private int count;

    public EmployeeManagement(int size) {
        employees = new Employee[size];
        count = 0;
    }

    // Add Employee
    public void addEmployee(Employee employee) {
        if (count == employees.length) {
            System.out.println("Employee array is full.");
            return;
        }

        employees[count++] = employee;
        System.out.println("Employee added successfully.");
    }

    // Search Employee
    public Employee searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                return employees[i];
            }
        }
        return null;
    }

    // Traverse Employees
    public void traverseEmployees() {
        if (count == 0) {
            System.out.println("No employees available.");
            return;
        }

        for (int i = 0; i < count; i++) {
            employees[i].display();
        }
    }

    // Delete Employee
    public void deleteEmployee(int id) {

        int index = -1;

        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Employee not found.");
            return;
        }

        for (int i = index; i < count - 1; i++) {
            employees[i] = employees[i + 1];
        }

        employees[count - 1] = null;
        count--;

        System.out.println("Employee deleted successfully.");
    }
}