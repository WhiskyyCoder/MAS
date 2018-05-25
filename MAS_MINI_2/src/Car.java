import java.util.*;

public class Car {
    private String name;
    private String color;
    private List<Engine> engines;
    private Map<String, Part> parts;
    private List<Car_Mot> mot_cars;

    private static List<Engine> allEngines = new ArrayList<>();

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
        this.mot_cars = new ArrayList<>();
        this.parts = new HashMap<>();
        this.engines = new ArrayList<>();
    }

    public Part lookUpPart(String name) throws Exception {
        if (!parts.containsKey(name)) {
            throw new Exception("Not found part : " + name);
        }

        return parts.get(name);
    }

    public void addPart(Part part) {
        if (!parts.containsKey(part.getName())) {
            parts.put(part.getName(), part);
            //bidirectional
            part.setCar(this);
        }
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

    public Car addEngine(Engine engine) {

        if (engines.size() < 2 && !allEngines.contains(engine))
            engines.add(engine);

        return this;
    }


    public void show() {
        System.out.println("Car : " + name + "\n color: " + color + "\n " + engines + " \n Parts: ");
        for (String key : parts.keySet()) {
            System.out.println("  " + key);
        }
    }
}
