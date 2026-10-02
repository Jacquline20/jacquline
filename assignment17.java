import java.util.ArrayList;

public class TodoList {
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<String> tasks = new ArrayList<>();

        // Adding tasks
        tasks.add("Complete Java assignment");
        tasks.add("Study for exam");
        tasks.add("Go for a walk");

        System.out.println("To-Do List:");
        for (String task : tasks) {
            System.out.println(task);
        }

        // Removing a task
        tasks.remove("Go for a walk");

        System.out.println("\nAfter removing a task:");

        // Iterating through the ArrayList
        for (String task : tasks) {
            System.out.println(task);
        }
    }
}
