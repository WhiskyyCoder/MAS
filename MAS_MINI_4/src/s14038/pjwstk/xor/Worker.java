package s14038.pjwstk.xor;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String firstName;
    private String lastName;
    private List<Task> tasks;

    public Worker(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        if (!tasks.contains(task)) {
            tasks.add(task);
        }

    }

    @Override
    public String toString() {
        return "Worker{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' ;
    }
}
