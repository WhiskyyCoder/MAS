package pl.edu.s14038.multiaspects.transportaspect;

import pl.edu.s14038.multiaspects.Building;

import java.util.HashMap;

public class Airport extends Building {
    private int max_planes;

    public Airport(String color, int windows, String name, int planes) {
        super(color, windows, name);
        this.max_planes = planes;


    }
}
