public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5); // capacity = 5

        // Add employees
        manager.addEmployee(new Employee(101, "Alice", "Manager", 80000));
        manager.addEmployee(new Employee(102, "Bob", "Developer", 60000));
        manager.addEmployee(new Employee(103, "Charlie", "Designer", 55000));

        // List all employees
        manager.listEmployees();

        // Search employee
        Employee e = manager.searchEmployee(102);
        System.out.println("\nSearch Result: " + (e != null ? e : "Not Found"));

        // Delete employee
        manager.deleteEmployee(102);

        // List after deletion
        manager.listEmployees();
    }
}
