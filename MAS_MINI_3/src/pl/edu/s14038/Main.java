package pl.edu.s14038;

import pl.edu.s14038.AbstractPoli.Administrator;
import pl.edu.s14038.AbstractPoli.Helper;
import pl.edu.s14038.AbstractPoli.Ticket;
import pl.edu.s14038.AbstractPoli.User;
import pl.edu.s14038.Multiinheritance.AdministratorHelper;
import pl.edu.s14038.Overlapping.KindUser;
import pl.edu.s14038.dynamic.Basic;
import pl.edu.s14038.dynamic.Lux;
import pl.edu.s14038.multiaspects.Disabled;
import pl.edu.s14038.multiaspects.transportaspect.Airport;

import java.util.Date;

public class Main {

    public static void main(String[] args){


        User helper=new Helper("Stefan","Kowalski","test@test.pl","8882121821");
        User administrator=new Administrator("Janusz","Kowalski","test21@test.pl",2345);
        helper.showDetails();
        administrator.showDetails();



        pl.edu.s14038.Overlapping.User user=new pl.edu.s14038.Overlapping.User("Jan","Nowak","email@op.pl", KindUser.Helper);
        user.setPassword("test");
        user.setPhoneNo("323232232");
        user.showDetails();
        user.setSecretPin(2343);
        user.showDetails();

        user.addKind(KindUser.Administrator);
        user.setSecretPin(2343);
        user.showDetails();
        user.addTicket(new Ticket(2,new Date(),"Naprawa dysku"));
        user.addTicket(new Ticket(3,new Date(),"Naprawa drukarki"));
        user.showTickets();



        AdministratorHelper admhelper=new AdministratorHelper("Admin","Helper","test@test.pl",2356,"123232313");
        admhelper.showDetails();
        admhelper.addTicket( new Ticket(3,new Date(),"Naprawa komputera"));
        admhelper.showTickets();



        Airport airport=new Airport("blue",600,"Warsaw Airport",150);
        airport.setDisabled(Disabled.Suitable);
        airport.show();


        Basic basic=new Basic(3,1,2,false);
        basic.show();
        Lux lux=new Lux(basic,2,true);
        lux.show();




    }


}
