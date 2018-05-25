package s14038.pjwstk.bag;

import java.util.*;

public class Car {
    private String name;
    private String color;
    private List<Car_Mot> mot_cars;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
        this.mot_cars = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public List<Car_Mot> getMot_cars() {
        return mot_cars;
    }

    public void addToCar_MOT(Car_Mot carmot) {
        if (!mot_cars.contains(carmot)) {
            mot_cars.add(carmot);
        }

    }



    public void show() {
        System.out.println("Car : " + name + "\n color: " + color + "\n  ");

    }
}
