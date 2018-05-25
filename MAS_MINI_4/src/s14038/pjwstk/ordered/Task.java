package s14038.pjwstk.ordered;

public class Task {
    private String name;
    private String content;
    private ListToDo listTodo;

    public Task(String name, String content, ListToDo listTodo) {
        this.name = name;
        this.content = content;
        this.listTodo = listTodo;
        listTodo.addTask(this);
    }

    public Task setListTodo(ListToDo listTodo) {
        if(listTodo!=null)
        this.listTodo = listTodo;
        listTodo.addTask(this);
        return this;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                '}';
    }
}
