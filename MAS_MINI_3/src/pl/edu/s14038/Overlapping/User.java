package pl.edu.s14038.Overlapping;

import pl.edu.s14038.AbstractPoli.Helper;
import pl.edu.s14038.AbstractPoli.Ticket;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.EnumSet;

public class User {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    //from admin
    private int secretPin;
    //from helper
    private String phoneNo;
    private EnumSet<KindUser> kindUser = EnumSet.noneOf(KindUser.class);
    //from helper
    private ArrayList<Ticket> tickets = new ArrayList<>();

    public void addKind(KindUser kind) {
        if (!kindUser.contains(kind)) {
            kindUser.add(kind);
        }

    }

    public void removeKind(KindUser kind) {
        if (kindUser.contains(kind)) {
            kindUser.remove(kind);
        }

    }

    //from helper
    public void addTicket(Ticket ticket) {
        if (kindUser.contains(KindUser.Helper))
            tickets.add(ticket);
    }

    public void removeTicket(Ticket ticket) {
        if (kindUser.contains(KindUser.Helper))
            tickets.remove(ticket);
    }

    public String generatePassword() {
        String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwx";
        SecureRandom rnd = new SecureRandom();
        System.out.println(kindUser);
        if (kindUser.contains(KindUser.Administrator)) {
            StringBuilder sb = new StringBuilder(5);
            for (int i = 0; i < 5; i++)
                sb.append(AB.charAt(rnd.nextInt(AB.length())));
            return sb.toString() + "administrator" + sb.toString();
        }
        if (kindUser.contains(KindUser.Helper)) {
            StringBuilder sb = new StringBuilder(10);
            for (int i = 0; i < 10; i++)
                sb.append(AB.charAt(rnd.nextInt(AB.length())));
            return sb.toString();

        }

        return null;
    }

    public void showDetails() {
        System.out.print("Name and surname: " + firstName + " => " + email + " : " + lastName + " Password: " + password + " Secret pin: " + secretPin + " phone: " + phoneNo + " kinds: " + kindUser + "\n");
    }

    public void showTickets() {
        if (kindUser.contains(KindUser.Helper)) {
            tickets.forEach(System.out::print);
            System.out.println("");
        }

    }

    public User(String firstName, String lastName, String email, KindUser user) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = generatePassword();
        this.email = email;
        this.kindUser.add(user);
    }


    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getPassword() {

        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public int getSecretPin() {
        return secretPin;
    }

    public User setSecretPin(int secretPin) {
        if (kindUser.contains(KindUser.Administrator))
            this.secretPin = secretPin;
        return this;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhoneNo() {
        if (kindUser.contains(KindUser.Helper)) {
            return phoneNo;
        }
        return null;
    }

    public User setPhoneNo(String phoneNo) {
        if (kindUser.contains(KindUser.Helper))
            this.phoneNo = phoneNo;
        return this;
    }
}
