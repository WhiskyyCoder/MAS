package s14038.pjwstk.bag;

import java.util.HashSet;
import java.util.Set;

public class Mot {
    private String name;
    private String no_license;
    private Set<Car_Mot> mot_cars;
    public Mot(String name, String no_license) {
        this.name = name;
        this.no_license = no_license;
        this.mot_cars=new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public Mot setName(String name) {
        this.name = name;
        return this;
    }
    public Set<Car_Mot> getMot_cars(){return mot_cars;}
    public void addToCar_MOT(Car_Mot carmot){
        if(!mot_cars.contains(carmot)){
            mot_cars.add(carmot);
        }

    }
    public String getNo_license() {
        return no_license;
    }

    public Mot setNo_license(String no_license) {
        this.no_license = no_license;
        return this;
    }
}
