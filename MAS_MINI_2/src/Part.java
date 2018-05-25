import java.util.Date;

public class Part {
    private String name;
    private double weight;
    private int amount;
    private Car car;
    private Warranty warranty;


    public Part(String name, double weight,int amount) {
        this.name=name;
        this.weight=weight;
        this.amount=amount;

    }

    public void addWarranty(Date from,Date to,String serial){
        if(this.warranty==null) {
            this.warranty = new Warranty(from, to, this, serial);
        }
    }
    public Car getCar(){return car;}

    public void setCar(Car car){this.car=car;}

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return ""+name+" = "+amount +" warranty "+warranty;
    }
}
