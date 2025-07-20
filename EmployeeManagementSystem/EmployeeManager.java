public class EmployeeManager {
    private Employee[] employees;
    private int size;

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    // Add Employee
    public void addEmployee(Employee emp) {
        if (size >= employees.length) {
            System.out.println("Employee list is full.");
            return;
        }
        employees[size++] = emp;
        System.out.println("Employee added: " + emp);
    }

    // Search by ID
    public Employee searchEmployee(int empId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == empId) {
                return employees[i];
            }
        }
        return null;
    }

    // Delete by ID
    public void deleteEmployee(int empId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == empId) {
                // Shift elements left
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[size - 1] = null;
                size--;
                System.out.println("Employee with ID " + empId + " deleted.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    // Traverse all employees
    public void listEmployees() {
        if (size == 0) {
            System.out.println("No employees found.");
            return;
        }
        System.out.println("All Employees:");
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }
}
