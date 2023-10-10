package ie.javier.planeTicketing;

public class Passenger extends Person {
    private String emailAddress;
    private int noBags;
    private boolean priorityBoarding;
    private CreditCard creditCard;

    Passenger (String number, Date expiry_date, int security_code) {
        super();
        this.emailAddress = "";
        this.noBags = 0;
        this.priorityBoarding = false;
        this.creditCard = new CreditCard(number, expiry_date, security_code);
    }

    Passenger (String title, String first_name, String surname, 
            String phone_number, String email, int noBags, 
            boolean priority_boarding, String card_number, Date expiry_date, int security_code) {
        super(title, first_name, surname, phone_number);
        this.emailAddress = email;
        this.phoneNumber  = phone_number;
        this.emailAddress = email;
        this.noBags = noBags;
        this.priorityBoarding = priority_boarding;
        this.creditCard = new CreditCard(card_number, expiry_date, security_code);
    }

    // GETTERS
    public String getEmailAddress() {
        return this.emailAddress;
    } 

    public int getNoBags() {
        return this.noBags;
    } 

    public boolean getPriorityBoarding() {
        return this.priorityBoarding;
    }

    public String getCardNumber() {
        return this.creditCard.getCardNumber();
    }
    
    // SETTERS
    public void setEmailAddress(String email) {
        this.emailAddress = email;
    }

    public void setNoBags(int noBags) {
        this.noBags = noBags;
    }

    public void setPriorityBoarding(boolean priority) {
        this.priorityBoarding = priority;
    }

    @Override
    public String toString() {
        return "NAME: " + this.name + " | EMAIL ADDRESS: " + this.emailAddress + "\nCARD DETAILS: " + this.creditCard + "\n" + this.noBags + " bag(s) Registered, " + (this.priorityBoarding ? "Has" : "No") + " Priority Boarding";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Passenger)) {
            return false;
        } 
    
        return this.emailAddress == ((Passenger)obj).emailAddress;
    }
}
