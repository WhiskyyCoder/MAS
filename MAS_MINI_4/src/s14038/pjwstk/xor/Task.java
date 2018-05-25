package s14038.pjwstk.xor;


public class Task {
    private String name;
    private String content;
    private Outsource outsource;
    private Worker worker;

    public Task(String name, String content) {
        this.name = name;
        this.content = content;
    }


    public Task setOutsource(Outsource outsource) throws Exception {
        if (this.worker == null) {
            this.outsource = outsource;
            outsource.addTask(this);
        } else {
            throw new Exception("Istnieje juz powiazanie  w ramach ograniczenia {XOR}!");
        }
        return this;
    }

    public Task setWorker(Worker worker) throws Exception {
        if (this.outsource == null) {
            this.worker = worker;
            worker.addTask(this);
        } else {
            throw new Exception("Istnieje juz powiazanie  w ramach ograniczenia {XOR}!");
        }
        return this;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", outsource=" + outsource +
                ", worker=" + worker +
                '}';
    }
}
