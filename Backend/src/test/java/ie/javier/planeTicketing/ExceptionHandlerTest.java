package ie.javier.planeTicketing;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.junit.Test;

import ie.javier.planeTicketing.classes.*;

public class ExceptionHandlerTest {

    @Test
    public void all() {
        ArrayList<Person> persons = new ArrayList<Person>();

        // Add employees
        persons.add(new Employee(new Name("Ms", "Faye", "Mcguire"), "087 1234567", new Date(7, 12, 2000), new Date(12, 10, 2020), 24000));
        persons.add(new Employee(new Name("Mr", "Ben", "Carson"), "086 1234567", new Date(20, 10, 1980), new Date(10, 10, 2012), 42000));
        persons.add(new Employee(new Name("Mr", "Mark", "Logan"), "087 9876543", new Date(1, 1, 1994), new Date(2, 8, 2018), 28000));

        // Add persons
        persons.add(new Passenger(new Name("Mr", "Homer", "Simpson"), "087 1234567", "homer.simpson@atu.ie", 0, false,
                "1111111111111111", new Date(3, 4, 2027), 474));
        persons.add(new Passenger(new Name("Mr", "Homer", "Simpson"), "087 1234567", "homer.simpson@atu.ie", 0, false,
                "1111111111111111", new Date(3, 4, 2027), 474));

        int userIdNumber = 0;

        // Get a valid Employee index
        while (true) {
            String userId = JOptionPane.showInputDialog(null, String.format("Employee to view [1-%d]", persons.size()));

            try {
                userIdNumber = Integer.parseInt(userId);

                if (userIdNumber < 1 || userIdNumber > persons.size()) {
                    JOptionPane.showMessageDialog(null, "ERROR: Invalid ID given. Please try again");
                    continue;
                }

                break;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ERROR: Invalid integer given. Please try again");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR: Something went wrong. Please try again.");
            }
        }

        // Access the user
        System.out.println(persons.get(userIdNumber));
    }
}
