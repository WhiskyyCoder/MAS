package pl.edu.s14038.Multiinheritance;

import pl.edu.s14038.AbstractPoli.Ticket;

public interface IHelper {
    String generatePassword();
    void showDetails();
    void showTickets();
    void addTicket(Ticket ticket);
    void removeTicket(Ticket ticket);

}
