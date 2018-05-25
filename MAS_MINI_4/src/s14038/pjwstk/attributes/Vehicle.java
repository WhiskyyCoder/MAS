package s14038.pjwstk.attributes;

public class Vehicle {
    private String name;
    private String color;
    private int mileage;
    private String serial;

    private final String startAllowed = "XVT";

    public Vehicle(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public Vehicle setMileage(int mileage) throws Exception {
        if (this.mileage > mileage)
            throw new Exception("Given data must not lower from current value");
        this.mileage = mileage;
        return this;
    }

    public Vehicle setSerialNo(String serial) throws Exception {
        if (!serial.startsWith(startAllowed))
            throw new Exception("Serial must starts with: " + startAllowed);

        this.serial = serial;
        return this;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                '}';
    }

    public String getName() {
        return name;
    }

    public Vehicle setName(String name) {
        this.name = name;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Vehicle setColor(String color) {
        this.color = color;
        return this;
    }

    public String getSerial() {
        return serial;
    }

    public Vehicle setSerial(String serial) {
        this.serial = serial;
        return this;
    }

    public String getStartAllowed() {
        return startAllowed;
    }
}
