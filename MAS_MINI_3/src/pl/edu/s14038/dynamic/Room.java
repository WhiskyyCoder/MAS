package pl.edu.s14038.dynamic;

public abstract class Room {
    protected int windows;
    protected int id;
    protected int beds;

    public Room(int windows, int id, int beds) {
        this.windows = windows;
        this.id = id;
        this.beds = beds;
    }
}
