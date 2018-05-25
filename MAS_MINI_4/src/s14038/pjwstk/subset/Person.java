package s14038.pjwstk.subset;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String firstName;
    private String secondName;
    private List<Organization> memberOfOgranizations;
    private List<Organization> chairmanOfOrganizations;

    public Person(String lastName, String secondName) {
        this.firstName = lastName;
        this.secondName = secondName;
        this.memberOfOgranizations = new ArrayList<>();
        this.chairmanOfOrganizations=new ArrayList<>();
    }

    public void addToOrganization(Organization organization) {
        if (!memberOfOgranizations.contains(organization)) {
            memberOfOgranizations.add(organization);
            organization.addMember(this);
        }
    }

    public void addChairman(Organization organization) {

        if (memberOfOgranizations.contains(organization)) {
            chairmanOfOrganizations.add(organization);

        try {
            organization.setChairman(this);
        }catch (Exception e){
            System.out.println(e.getMessage());

        }}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        if (secondName != null ? !secondName.equals(person.secondName) : person.secondName != null) return false;
        if (memberOfOgranizations != null ? !memberOfOgranizations.equals(person.memberOfOgranizations) : person.memberOfOgranizations != null)
            return false;
        return chairmanOfOrganizations != null ? chairmanOfOrganizations.equals(person.chairmanOfOrganizations) : person.chairmanOfOrganizations == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + (memberOfOgranizations != null ? memberOfOgranizations.hashCode() : 0);
        result = 31 * result + (chairmanOfOrganizations != null ? chairmanOfOrganizations.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
