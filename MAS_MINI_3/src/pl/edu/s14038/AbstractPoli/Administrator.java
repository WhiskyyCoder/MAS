package pl.edu.s14038.AbstractPoli;

import java.security.SecureRandom;

public class Administrator extends User {
    public int secretPin;

    public Administrator(String name, String lastname, String email, int secretPin) {
        super(name, lastname, email);
        this.secretPin = secretPin;
    }

    @Override
    public String generatePassword() {
        String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVW";
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder(5);
        for (int i = 0; i < 5; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString() + "administrator" + sb.toString();


    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.print(" secretPin: " + secretPin + "\n");
    }
}
