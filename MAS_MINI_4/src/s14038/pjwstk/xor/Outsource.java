package s14038.pjwstk.xor;

import java.util.ArrayList;
import java.util.List;

public class Outsource {
    private String name;
    private List<Task> tasks;

    public Outsource(String name) {
        this.name=name;
        this.tasks=new ArrayList<>();
    }

    public void addTask(Task task) {
        if (!tasks.contains(task)) {
            tasks.add(task);
        }

    }

    @Override
    public String toString() {
        return "Outsource{" +
                "name='" + name + '\'' ;
    }
}
