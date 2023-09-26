package ie.javier.planeTicketing;

public abstract class Person {
    protected Name name;
    protected String phoneNumber;

    Person () {
        this.name = new Name();
        this.phoneNumber = "";
    }

    Person (String title, String first_name, String surname, String phoneN) {
        this.name = new Name(title, first_name, surname);
        this.phoneNumber = phoneN;
    }

    // GETTERS
    public Name getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    // SETTERS
    public void setName(Name name) {
        this.name = name;
    }

    public void setName(String title, String first_name, String surname) {
        this.name.setTitle(title);
        this.name.setFirstName(first_name);
        this.name.setSurname(surname);
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
