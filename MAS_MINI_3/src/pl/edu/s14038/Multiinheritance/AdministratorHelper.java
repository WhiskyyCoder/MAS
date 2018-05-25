package pl.edu.s14038.Multiinheritance;

import pl.edu.s14038.AbstractPoli.Ticket;


public class AdministratorHelper extends Administrator implements IHelper {
    private String phoneNo;
    private Helper helper;

    public AdministratorHelper(String name, String lastname, String email, int pin, String phoneNo) {
        super(name, lastname, email, pin);
        this.helper=new Helper(name,lastname,email,phoneNo);
        this.phoneNo = phoneNo;
    }

    public void showTickets() {
        helper.showTickets();

    }

    public void addTicket(Ticket ticket){
        helper.addTicket(ticket);
    }

    public void removeTicket(Ticket ticket){
        helper.removeTicket(ticket);
    }


    public void showDetails() {
        System.out.println(firstName + " " + lastName + " " + email + " " + secretPin + " " + phoneNo + " haslo: " + generatePassword());
    }
}
