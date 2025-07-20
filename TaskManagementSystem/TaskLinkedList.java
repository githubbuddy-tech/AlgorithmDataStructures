public class TaskLinkedList {
    private class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head;

    // Add Task at End
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
        System.out.println("Task added: " + task);
    }

    // Search by Task ID
    public Task searchTask(int taskId) {
        Node temp = head;
        while (temp != null) {
            if (temp.task.taskId == taskId)
                return temp.task;
            temp = temp.next;
        }
        return null;
    }

    // Delete Task by ID
    public void deleteTask(int taskId) {
        if (head == null) return;

        if (head.task.taskId == taskId) {
            head = head.next;
            System.out.println("Task deleted: " + taskId);
            return;
        }

        Node prev = head;
        Node current = head.next;

        while (current != null && current.task.taskId != taskId) {
            prev = current;
            current = current.next;
        }

        if (current != null) {
            prev.next = current.next;
            System.out.println("Task deleted: " + taskId);
        } else {
            System.out.println("Task not found.");
        }
    }

    // Traverse All Tasks
    public void listTasks() {
        Node temp = head;
        if (temp == null) {
            System.out.println("No tasks available.");
            return;
        }
        System.out.println("Task List:");
        while (temp != null) {
            System.out.println(temp.task);
            temp = temp.next;
        }
    }
}
