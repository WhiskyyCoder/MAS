public class Engine {
    private String model;
    private int cylinder;
    private Car car;


    public static Engine createEngine(Car car, String model, int cylinders) throws Exception {
        if (car == null) {
            throw new Exception("Part could not exist without whole");
        }
        Engine engine = new Engine(model, cylinders);
        car.addEngine(engine);
        engine.car = car;

        return engine;
    }

    private Engine(String model, int cylinder) {
        this.model = model;
        this.cylinder = cylinder;
    }

    @Override
    public String toString() {
        return "Engine: " + model + "\n Cylinders: " + cylinder;
    }
}
