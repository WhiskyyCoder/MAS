package pl.edu.s14038.multiaspects.transportaspect;

import pl.edu.s14038.multiaspects.Building;

public class BusStation extends Building {
    private int max_coaches;

    public BusStation(String color, int windows, String name, int max_coaches) {
        super(color, windows, name);
        this.max_coaches = max_coaches;


    }
}
