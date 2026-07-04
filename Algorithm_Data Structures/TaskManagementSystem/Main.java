package TaskManagementSystem;

public class Main {

    public static void main(String[] args) {

        TaskManagement tm = new TaskManagement();

        tm.addTask(101, "Design UI", "Pending");
        tm.addTask(102, "Write Code", "In Progress");
        tm.addTask(103, "Testing", "Pending");

        System.out.println("All Tasks:");
        tm.traverseTasks();

        System.out.println("Searching Task ID 102");

        Task task = tm.searchTask(102);

        if (task != null)
            task.display();
        else
            System.out.println("Task not found.");

        System.out.println("Deleting Task ID 102");
        tm.deleteTask(102);

        System.out.println("\nTasks after deletion:");
        tm.traverseTasks();
    }
}
