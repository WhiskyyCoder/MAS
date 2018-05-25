package pl.edu.s14038.AbstractPoli;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Helper extends User {
    private String phoneNo;
    private ArrayList<Ticket> tickets = new ArrayList<>();

    public Helper(String name, String lastname, String email, String phoneNo) {
        super(name, lastname, email);
        this.phoneNo = phoneNo;

    }

    @Override
    public String generatePassword() {
        String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwyz";
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder(10);
        for (int i = 0; i < 10; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();

    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public void removeTicket(Ticket ticket) {
        tickets.remove(ticket);
    }

    public void showTickets() {
        tickets.forEach(System.out::print);
        System.out.println("");

    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.print(" phoneNo: " + phoneNo + "\n");
    }
}
