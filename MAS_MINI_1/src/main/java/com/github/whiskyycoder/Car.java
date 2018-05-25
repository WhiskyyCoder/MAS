package com.github.whiskyycoder;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Car implements Serializable {
    private static final long serialVersionUID = 6529685098267757690L;
    //Waveband for radio Eska
    private static final String waveBandEska = "101.1";
    //ekstensja
    private static Vector<Car> extension = new Vector<Car>();
    private String name;
    //complex
    private Engine engine;
    private int tanked_fuel;
    private int distance_to_tank;
    //repeatable
    private List<String> petrolStations = new LinkedList<String>();
    private int doors;
    //optional
    private String navigationModel;


    public Car(String name, int doors, String navigation, Engine engine) throws Exception{
        if(name==null||engine==null){
            throw new Exception("Name or engine should be initialized");
        }
        this.name = name;
        this.doors = doors;
        this.navigationModel = navigation;
        this.engine = engine;
        extension.add(this);
    }

    //overload
    public void fillUp(String petrolStation, int amountTank, int distance_to_tank) {
        this.petrolStations.add(petrolStation);
        this.tanked_fuel = amountTank;
        this.distance_to_tank = distance_to_tank;
    }

    //tank to full
    public void fillUp(String petrolStation, int distance_to_tank) {
        this.petrolStations.add(petrolStation);
        this.tanked_fuel = engine.getMaxVolume();
        this.distance_to_tank = distance_to_tank;
    }

    public static void showExtension() {

        extension.forEach(System.out::print);
    }

    public static double getTotalAverageFuelConsumption() {
        double totalSum = 0.0;

        for (Car car : extension)
            totalSum += car.getFuelConsumption();

        return Math.round(totalSum / extension.size());
    }

    public static void readExtension(String path) {
        try {
            File file = new File(path);
            file.createNewFile();
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            extension = ((Vector<Car>) in.readObject());
        } catch(EOFException ex){

        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void saveExtension(String path) throws Exception {
        File file = new File(path);
        file.createNewFile();
        FileOutputStream oFile = new FileOutputStream(file, false);
        ObjectOutputStream out = new ObjectOutputStream(oFile);
        out.writeObject(extension);
    }

    //countable
    public double getFuelConsumption() {

        if (distance_to_tank > 0)
            return Math.round((((double) tanked_fuel / (double) distance_to_tank) * 100));
        return 0;
    }


    public String getNavigationModel() {
        if (navigationModel == null)
            return "Navigation system not avaliable in car";
        return navigationModel;
    }


    @Override
    public String toString() {
        return "Car's name: " + name + "\n Engine: [" + engine + "]" +
                " \n Average Fuel Consumption: " + getFuelConsumption() + "l / 100 km\n Navi: " +
                getNavigationModel() + "\n Waveband: " + waveBandEska + "\n";
    }


    public String getName() {
        return name;
    }

    public Car setName(String name) {
        this.name = name;
        return this;
    }


    public int getTanked_fuel() {
        return tanked_fuel;
    }

    public Car setTanked_fuel(int tanked_fuel) {
        this.tanked_fuel = tanked_fuel;
        return this;
    }

    public int getDistance_to_tank() {
        return distance_to_tank;
    }

    public Car setDistance_to_tank(int distance_to_tank) {
        this.distance_to_tank = distance_to_tank;
        return this;
    }

    public void showPetrolStations() {


        petrolStations.forEach(System.out::println);
    }

}
