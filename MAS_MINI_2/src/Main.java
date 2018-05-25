import java.util.Date;

public class Main {

    public static void main(String args[]) {

        Car car = new Car("RWX", "red");
        Car car2 = new Car("Mustang GT", "blue");
        try {
            Engine.createEngine(car, "Spalinowy", 4);
            Engine.createEngine(car, "Elektryczny", 2);
            Engine.createEngine(car, "Dodatkowy", 1);
            Engine.createEngine(car2, "Spalinowy", 6);
        } catch (Exception e) {
            e.printStackTrace();
        }



        Mot mot1 = new Mot("Krakow Kontrola Pojazdow", "KTZ11123");
        Mot mot2 = new Mot("Warszawa Kontrola Pojazdow", "WAWZ11123");

        new Car_Mot(car, mot1);
        new Car_Mot(car, mot2);
        new Car_Mot(car2, mot2);


        System.out.println("Mot for " + car.getName());
        for (Car_Mot car_mot : car.getMot_cars()) {
            System.out.println(" "+car_mot.getMot().getName() + " -> " + car_mot.getDate());
        }

        System.out.println("Cars in mot " + mot1.getName());
        for (Car_Mot car_mot : mot1.getMot_cars()) {
            System.out.println(" "+car_mot.getCar().getName() + " -> " + car_mot.getDate());
        }



        Part part = new Part("mirror", 10, 2);
        part.addWarranty(new Date(),new Date(),"kgw");
        Part part2 = new Part("windscreen", 15, 1);
        part2.addWarranty(new Date(),new Date(),"XYZ");
        Part part3 = new Part("seat", 10, 2);
        part2.addWarranty(new Date(),new Date(),"BKG");
        System.out.print(part);



        car.addPart(part);
        car.addPart(part2);
        car2.addPart(part3);

        car.show();
        car2.show();



        try {

            System.out.println("Lookup part :" + car.lookUpPart("windscreen"));

        } catch (Exception ex) {
            ex.printStackTrace();
        }




    }

}
