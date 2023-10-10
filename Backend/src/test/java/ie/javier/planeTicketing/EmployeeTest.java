package ie.javier.planeTicketing;

import java.util.ArrayList;
import org.junit.Test;

public class EmployeeTest {
    
    @Test
    public void all() {
        ArrayList<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee("Ms", "Faye", "Mcguire", "087 1234567", new Date(7, 12, 2000), new Date(12, 10, 2020), 24000));
        employees.add(new Employee("Mr", "Ben", "Carson", "086 1234567", new Date(20, 10, 1980), new Date(10, 10, 2012), 42000));
        employees.add(new Employee("Mr", "Mark", "Logan", "087 9876543", new Date(1, 1, 1994), new Date(2, 8, 2018), 28000));
    
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < employees.size(); j++) {
                Employee employee = employees.get(j);

                System.out.println(employee);

                if (employee.getSalary() < 30000 && i == 0) {
                    employee.incrementSalary(1000);
                }
            }
        }
    }
}
