package com.github.whiskyycoder;


public class App {
    public static void main(String[] args) throws Exception {
        final String ekstensjaPlik = "c:\\test\\Ekstensja.bin";
        Car.readExtension(ekstensjaPlik);

//        Engine engine = new Engine(40, "SKODAXXXDERR2", 4);
//        Car car = new Car("Fabia", 4, null, engine);
//        car.fillUp("Orlen Warszawa", 40, 400);
//        car.fillUp("BP Krakow", 430);
//        car.fillUp("Orlen Warszawa", 530);
//
//        engine = new Engine(80, "RS7MWMSKKSKWMMSW2", 4);
//        Car car2 = new Car("RS7", 3, "NaviSystem 2.0", engine);
//        car2.fillUp("BP", 49, 350);
//        car2.fillUp("Orlen Krakow", 70, 500);
//        car2.showPetrolStations();

        Engine engine = new Engine(100, "SCANIAvxk45672", 8);
        Car car3 = new Car("Scania 500", 2, null, engine);
        car3.fillUp("BP", 700);

        Car.saveExtension(ekstensjaPlik);

        Car.showExtension();
        System.out.println("Average consumption : " + Car.getTotalAverageFuelConsumption());


    }

}
