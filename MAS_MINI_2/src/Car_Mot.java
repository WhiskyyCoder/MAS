import java.util.Date;

public class Car_Mot {
    private Car car;
    private Mot mot;
    private Date date;

    public Car_Mot(Car car, Mot mot){
        this.car=car;
        this.mot=mot;
        this.date= new Date();
        car.addToCar_MOT(this);
        mot.addToCar_MOT(this);
    }

    public Car getCar(){return this.car;}
    public Mot getMot() {
        return mot;
    }
    public Date getDate() {
        return date;
    }

}
