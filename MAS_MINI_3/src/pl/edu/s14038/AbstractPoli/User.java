package pl.edu.s14038.AbstractPoli;

public abstract class User {
    protected String firstName;
    protected String lastName;
    protected String password;
    protected String email;

    public abstract String generatePassword();

    public void showDetails() {
        System.out.print("Name and surname: " + firstName + " => " + email + " : " + lastName + " Password: " + password);
    }

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = generatePassword();
        this.email = email;
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

    public User setEmail(String email) {
        this.email = email;
        return this;
    }
}
