package pl.edu.s14038.AbstractPoli;

import java.util.Date;

public class Ticket {
    private int id;
    private Date date;
    private String content;

    public Ticket(int id, Date date, String content) {
        this.id = id;
        this.date = date;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Ticket id: " + id + " " + date + " " + content;
    }
}
