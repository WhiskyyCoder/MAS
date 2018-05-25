package pl.edu.s14038.dynamic;

public class Lux extends Room {
    int kings_bed;
    boolean extra_equipment;

    public Lux(int windows, int id, int beds_basic, int kings_bed, boolean extra_equipment) {
        super(windows, id, beds_basic);
        this.kings_bed = kings_bed;
        this.extra_equipment = extra_equipment;
    }

    public Lux(Room roomLast, int kings_bed, boolean extra_equipment) {
        super(roomLast.windows, roomLast.id, roomLast.beds);
        this.kings_bed = kings_bed;
        this.extra_equipment = extra_equipment;

    }

    public void show() {

        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Lux{" +
                "kings_bed=" + kings_bed +
                ", extra_equipment=" + extra_equipment +
                ", windows=" + windows +
                ", id=" + id +
                ", beds=" + beds +
                '}';
    }
}
