package TaskManagementSystem;

public class Task {
    int taskId;
    String taskName;
    String status;
    Task next;
    public Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
        this.next = null;    // <-- THIS LINE IS REQUIRED
    }
    public void display() {
        System.out.println("Task ID: " + taskId);
        System.out.println("Task Name: " + taskName);
        System.out.println("Status: " + status);
    }
    
}
