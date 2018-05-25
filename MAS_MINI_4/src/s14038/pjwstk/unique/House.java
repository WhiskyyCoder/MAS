package s14038.pjwstk.unique;

import java.util.LinkedList;
import java.util.List;

public class House {
    private Address address;
    private static List<Address> addresses=new LinkedList<>();
    private int windows;
    private String color;

    public House( int windows, String color) {
        this.windows = windows;
        this.color = color;
    }

    public House setAddress(Address address) {
        if (!addresses.contains(address)) {
            addresses.add(address);
            this.address=address;
        }
        return this;
    }

    @Override
    public String toString() {
        return "House{" +
                "address=" + address +
                ", windows=" + windows +
                ", color='" + color + '\'' +
                '}';
    }
}
