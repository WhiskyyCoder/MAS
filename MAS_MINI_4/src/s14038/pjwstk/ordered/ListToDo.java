package s14038.pjwstk.ordered;

import java.util.LinkedList;
import java.util.List;

public class ListToDo {

    private String name;
    private List<Task> tasks;


    public ListToDo(String name) {
        this.name = name;
        tasks = new LinkedList<>();
    }

    public void addTask(Task task) {
        if (!tasks.contains(task)) {

            tasks.add(task);
            task.setListTodo(this);
        }

    }

    @Override
    public String toString() {
        return "ListToDo{" +
                "name='" + name + '\'' +
                ", tasks=" + tasks +
                '}';
    }
}
