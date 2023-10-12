package ie.javier.planeTicketing;

import java.util.HashSet;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ie.javier.planeTicketing.classes.*;

/*
 * TODO: Add security to the endpoints in case someone infiltrates the container, 
 * TODO: Add file serialization / deseralization as a DB.
 */

@RestController
public class FlightAppAPI {

    private HashSet<Employee> employees;

    FlightAppAPI() {
        this.employees = new HashSet<Employee>();
    }

    // Returns a JSON object with all employees
    @GetMapping("/employees")
    HashSet<Employee> getAllEmployees() {
        return this.employees;
    }

    // Adds a new employee to our HashSet
    @PostMapping("/employees")
    boolean setNewEmployee(@RequestBody Employee employeeToAdd) {
        return this.employees.add(employeeToAdd);
    }

    // Deletes all employees in the hashset
    @DeleteMapping("/employees")
    boolean deleteAllEmployees() {
        this.employees = new HashSet<Employee>();
        return true;
    } 
}
