package software.sigma.tutorial.stub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import software.sigma.tutorial.model.Employee;
import software.sigma.tutorial.repository.EmployeeRepository;

import java.util.Arrays;

/**
 * Created by alexandr.efimov on 2/14/2017.
 */
@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public DatabaseLoader(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("ARGUMENTS: " + Arrays.toString(strings));
        Employee employee = new Employee("Kvothe", "Arliden", "Main character in the Kingkiller Chronicle");
        System.out.println("Add: " + employee);
        //TODO here add employee on start of app, remove it after tests
//        employeeRepository.save(employee);
    }
}
