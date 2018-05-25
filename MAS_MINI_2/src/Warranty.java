import java.util.Date;

public class Warranty {

    private Date from;
    private Date to;
    private Part part;
    private String serial;

    public  Warranty(Date from,Date to,Part part,String serial){
        this.part=part;
        this.from=from;
        this.to=to;
        this.serial=serial;


    }

    @Override
    public String toString() {
        return serial;
    }
}
