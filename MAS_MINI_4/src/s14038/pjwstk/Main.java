package s14038.pjwstk;

import s14038.pjwstk.attributes.Vehicle;
import s14038.pjwstk.bag.Car;
import s14038.pjwstk.bag.Car_Mot;
import s14038.pjwstk.bag.Mot;
import s14038.pjwstk.ordered.ListToDo;
import s14038.pjwstk.ordered.Task;
import s14038.pjwstk.own.Order;
import s14038.pjwstk.subset.Organization;
import s14038.pjwstk.subset.Person;
import s14038.pjwstk.unique.Address;
import s14038.pjwstk.unique.House;
import s14038.pjwstk.xor.Outsource;
import s14038.pjwstk.xor.Worker;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("Truck 1", "black");

        try {
            vehicle1.setMileage(20000);
            System.out.println(vehicle1);
            vehicle1.setMileage(100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            vehicle1.setSerialNo("KTX3213123");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            vehicle1.setSerialNo("XVT123");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Address address = new Address("Ujazdowska", 21);
        House house = new House(10, "white");
        house.setAddress(address);
        System.out.println(house);
        House house2 = new House(15, "brown");
        house2.setAddress(address);
        System.out.println(house2);


        Organization organization = new Organization("Stowarzyszenie emerytow");
        Person person = new Person("Stefan", "Kowalski");
        person.addChairman(organization);
        System.out.println("Chairman: " + organization.getChairman());
        person.addToOrganization(organization);
        person.addChairman(organization);
        System.out.println("Chairman: " + organization.getChairman());


        ListToDo listToDo = new ListToDo("Zakupy");
        new Task("Kapusta", "Kupic kapuste", listToDo);
        new Task("Ryba", "Kupic 1kg lososia", listToDo);
        new Task("Jablka", "Kupic 2kg jablek", listToDo);
        System.out.println(listToDo);


        Mot mot1 = new Mot("Krakow Kontrola Pojazdow", "KTZ11123");
        Mot mot2 = new Mot("Warszawa Kontrola Pojazdow", "WAWZ11123");


        Car car = new Car("RWX", "red");
        Car car2 = new Car("Mustang GT", "blue");
        new Car_Mot(car, mot1);
        new Car_Mot(car, mot2);
        new Car_Mot(car2, mot2);


        System.out.println("Mot for " + car.getName());
        for (Car_Mot car_mot : car.getMot_cars()) {
            System.out.println(" " + car_mot.getMot().getName() + " -> " + car_mot.getDate());
        }

        System.out.println("Cars in mot " + mot1.getName());
        for (Car_Mot car_mot : mot1.getMot_cars()) {
            System.out.println(" " + car_mot.getCar().getName() + " -> " + car_mot.getDate());
        }


        Outsource outsource = new Outsource("Firma informatyczna");
        Worker worker = new Worker("Jan", "Kowalski");
        s14038.pjwstk.xor.Task task = new s14038.pjwstk.xor.Task("Instalacja serwera", "Instalacja server");
        try {
            task.setOutsource(outsource);
            task.setWorker(worker);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(task);


        Order order = new Order();
        try {
            order.setId("O-1239-zas");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
