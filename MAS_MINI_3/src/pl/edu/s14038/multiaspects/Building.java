package pl.edu.s14038.multiaspects;

public class Building {
    protected String color;
    protected int windows;
    protected String name;
    protected Disabled disabled;
    protected Integer max_support_tools;
    protected Double price_for_repair;

    public Building(String color, int windows, String name) {
        this.color = color;
        this.windows = windows;
        this.name = name;
    }

    public Disabled getDisabled() {
        return disabled;
    }

    public Building setDisabled(Disabled disabled) {
        this.disabled = disabled;
        return this;
    }

    public Integer getMax_support_tools() {
        if (max_support_tools != null) {
            return max_support_tools;
        } else {
            return 0;
        }

    }

    public Building setMax_support_tools(Integer max_support_tools) {
        this.max_support_tools = max_support_tools;
        return this;
    }

    public Double getPrice_for_repair() {
        if (price_for_repair != null) {
            return price_for_repair;
        } else {
            return 0.0;
        }

    }

    public Building setPrice_for_repair(Double price_for_repair) {
        this.price_for_repair = price_for_repair;
        return this;
    }

    @Override
    public String toString() {
        return "Name : " + name + " Color: " + color + " Windows: " + windows + " Price for repiar" + getPrice_for_repair() + " Disabled: " + disabled + " Max tools:" + getMax_support_tools();
    }

    public void show() {
        System.out.println(toString());
    }
}
