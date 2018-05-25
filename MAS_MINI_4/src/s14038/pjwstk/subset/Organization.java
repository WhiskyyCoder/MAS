package s14038.pjwstk.subset;

import java.util.ArrayList;
import java.util.List;

public class Organization {
    private String name;
    private List<Person> people;
    private Person chairman;

    public Organization(String name) {
        this.name = name;
        people=new ArrayList<>();
    }

    public void addMember(Person person){
        if(!people.contains(person)){
            people.add(person);
            person.addToOrganization(this);
        }
    }

    public void setChairman(Person person) throws Exception{
        if(people.contains(person) && chairman==null){
            this.chairman=person;
            person.addChairman(this);
        }else{
            throw new Exception("This person is not member of  "+ this.name);
        }
    }

    public Person getChairman() {
        return chairman;
    }
}
