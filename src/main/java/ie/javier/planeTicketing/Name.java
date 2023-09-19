package ie.javier.planeTicketing;


public class Name {
    private String title;
    private String firstName;
    private String surname;

    // Overloading constructors

    public Name() {
        this.title = "";
        this.firstName = "";
        this.surname = "";
    }

    public Name(String title_super, String firstname_super, String surname_super) {
        this.title = title_super;
        this.firstName = firstname_super;
        this.surname = surname_super;
    }

    // Getters
    
    public String getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getSurname() {
        return surname;
    }

    // Setters

    public void setTitle(String title_super) {
        this.title = title_super;
    }
 
    public void setFirstName(String firstName_super) {
        this.firstName = firstName_super;
    }
 
    public void setSurname(String surname_super) {
        this.surname = surname_super;
    }
        
    // Overriden Object class methods
    @Override
    public String toString() {
        return "Title: " + title + " | First Name: " + firstName + " | Surname: " + surname;
    }
    
    @Override
    public boolean equals(Object object) {
        return object.hashCode() == this.hashCode();
    }

    // Custom class methods
    public boolean isFemale() {
        return (this.title == "Miss" || this.title == "Ms" || this.title == "Mrs");
    }
}
