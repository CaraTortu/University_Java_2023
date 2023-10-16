package ie.javier.planeTicketing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ie.javier.planeTicketing.classes.*;

/*
 * TODO: Add security to the endpoints in case someone infiltrates the container, 
 */

@RestController
public class FlightAppAPI {
    private HashSet<Employee> employees;
    final public static String dbName = "test.db";


    FlightAppAPI() {
        File file = new File(dbName);
        ObjectInputStream inputStream;

        this.employees = new HashSet<Employee>();

        try {
            // Check if the file exists. If it doesnt, create it and return an empty hashset.
            if (!file.exists()) {
                file.createNewFile();
                return;
            }

            // Read the DB
            inputStream = new ObjectInputStream(new FileInputStream(file));

            // Cast the object to Hashset<K>
            this.employees = (HashSet<Employee>)inputStream.readObject();
  
            // Close the input stream
            inputStream.close();
        } catch (Exception e) { return; }
    }

    // Writes the employees to the database.
    // @param String filename
    // @returns boolean
    boolean writeToDB() {
        File file = new File(dbName);
        ObjectOutputStream outputStream;
        
        try { 
            // Check if file exists and create a new one if it doesnt.
            if (!file.exists()) file.createNewFile();

            // Write the file
            outputStream = new ObjectOutputStream(new FileOutputStream(file));
            outputStream.writeObject(this.employees);
            outputStream.flush();
            outputStream.close();

            // Return success
            return true;
        } catch (Exception e) { return false; }
    }

    // Returns a JSON object with all employees
    @GetMapping("/employees")
    HashSet<Employee> getAllEmployees() {
        return this.employees;
    }

    // Adds a new employee to our HashSet
    @PostMapping("/employees")
    boolean setNewEmployee(@RequestBody Employee employeeToAdd) {
        boolean status = this.employees.add(employeeToAdd);
        this.writeToDB();
        return status;
    }

    // Deletes all employees in the hashset
    @DeleteMapping("/employees")
    boolean deleteAllEmployees() {
        this.employees = new HashSet<Employee>();
        this.writeToDB();
        return true;
    } 
}
