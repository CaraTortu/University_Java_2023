package ie.javier.planeTicketing.classes;

public abstract class Person {
    protected Name name;
    protected String phoneNumber;

    Person () {
        this.name = new Name();
        this.phoneNumber = "";
    }

    Person (Name name, String phoneN) {
        this.name = name;
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

    public void setName(String title, String firstName, String surname) {
        this.name.setTitle(title);
        this.name.setFirstName(firstName);
        this.name.setSurname(surname);
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
