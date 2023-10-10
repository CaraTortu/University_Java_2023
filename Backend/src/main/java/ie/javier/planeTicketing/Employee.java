package ie.javier.planeTicketing;

interface Payable {
   double calculatePay(double taxPercentage);
   double incrementSalary(double incrementAmount);
}

public class Employee extends Person implements Payable {
    private static int number = 10000;
    private Date dateOfBirth;
    private Date startDate;
    private double salary;
    private int employeeNumber;

    public Employee() {
        this.salary = 0;
        this.dateOfBirth = this.startDate = new Date();
        this.employeeNumber = number++;
    }

    public Employee(String title, String first_name, String surname, String phoneN, Date dob, Date startDate, double salary) {
        super(title, first_name, surname, phoneN);
        
        this.dateOfBirth = dob;
        this.startDate = startDate;
        this.salary = salary;
        this.employeeNumber = number++;
    }

    // GETTERS

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public double getSalary() {
        return this.salary;
    }

    // SETTERS
    
    public void setDateOfBirth(Date dob) {
        this.dateOfBirth = dob;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }

    @Override
    public double calculatePay(double taxPercentage) {
        double total_payment = this.salary / 12;
        return total_payment - (total_payment * taxPercentage / 100);
    }

    @Override
    public double incrementSalary(double incrementAmount) {
        this.salary = Math.min(150000, this.salary + incrementAmount);
        return this.salary;
    }
    
    @Override
    public String toString() {
        return String.format("%s,    %s, %s, %s, €%.2f.", this.employeeNumber, this.phoneNumber, this.dateOfBirth, this.startDate, this.salary);
    }
}
