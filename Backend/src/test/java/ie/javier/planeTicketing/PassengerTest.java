package ie.javier.planeTicketing;

import java.util.ArrayList;
import org.junit.Test;

public class PassengerTest {
    
    @Test
    public void all() {
        ArrayList<Passenger> passengers = new ArrayList<Passenger>();
        passengers.add(new Passenger("Mr", "Homer", "Simpson", "087 1234567", "homer.simpson@atu.ie", 0, false, "1111111111111111", new Date(3, 4, 2027), 474));
        passengers.add(new Passenger("Mrs", "Marge", "Simpson", "084 3438837", "Marge.simpson@atu.ie", 1, true, "8273648372048593", new Date(2, 1, 2025), 938));
        
        int females = 0;

        System.out.println("LIST OF NAMES:");
        for (int i = 0; i < passengers.size(); i++) {
            Passenger p = passengers.get(i);
            System.out.println(String.format("%s     %s     %d bag(s), %s Priority Boarding.", p.getName(), p.getEmailAddress(), p.getNoBags(), p.getPriorityBoarding() ? "Has" : "No"));
            
            if (p.getName().isFemale()) {
                females++;
            }
        }

        System.out.println("\nMALE/FEMALE PASSENGER COUNT:");
        System.out.println(String.format("%d MALE(S), %d FEMALE(S)", passengers.size()-females, females));
    
        System.out.println("\nPASSENGER CREDIT CARD DETAILS:");
        for (int i = 0; i < passengers.size(); i++) {
            Passenger p = passengers.get(i);
            System.out.println(String.format("%s Card Number: %s", p.getName(), p.getCardNumber()));
        }
    }
}
