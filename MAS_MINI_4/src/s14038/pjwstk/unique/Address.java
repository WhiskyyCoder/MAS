package s14038.pjwstk.unique;

public class Address {
    String nameStreet;
    int nr;

    public Address(String nameStreet, int nr) {
        this.nameStreet = nameStreet;
        this.nr = nr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (nr != address.nr) return false;
        return nameStreet != null ? nameStreet.equals(address.nameStreet) : address.nameStreet == null;
    }

    @Override
    public int hashCode() {
        int result = nameStreet != null ? nameStreet.hashCode() : 0;
        result = 31 * result + nr;
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "nameStreet='" + nameStreet + '\'' +
                ", nr=" + nr +
                '}';
    }
}
