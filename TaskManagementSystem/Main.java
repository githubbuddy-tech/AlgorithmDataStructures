public class Main {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(new Task(1, "Design Database", "Pending"));
        taskList.addTask(new Task(2, "Develop API", "In Progress"));
        taskList.addTask(new Task(3, "Test Application", "Pending"));

        taskList.listTasks();

        System.out.println("\nSearching for Task ID 2:");
        Task task = taskList.searchTask(2);
        System.out.println(task != null ? task : "Not Found");

        System.out.println("\nDeleting Task ID 2:");
        taskList.deleteTask(2);

        System.out.println("\nAfter Deletion:");
        taskList.listTasks();
    }
}
