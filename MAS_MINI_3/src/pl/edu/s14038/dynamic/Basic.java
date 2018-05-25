package pl.edu.s14038.dynamic;

public class Basic extends Room {
    private boolean smokers;

    public Basic(int windows, int id, int beds, boolean smokers_allowed) {
        super(windows, id, beds);
        this.smokers = smokers_allowed;
    }

    public Basic(Room roomLast, boolean smokers_allowed) {
        super(roomLast.windows, roomLast.id, roomLast.beds);
        this.smokers = smokers_allowed;

    }

    public void show() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Basic{" +
                "smokers=" + smokers +
                ", windows=" + windows +
                ", id=" + id +
                ", beds=" + beds +
                '}';
    }
}
