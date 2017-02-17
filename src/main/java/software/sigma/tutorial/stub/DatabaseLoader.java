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

    private final EmployeeRepository repository;

    @Autowired
    public DatabaseLoader(EmployeeRepository employeeRepository) {
        this.repository = employeeRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
       /* this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
        this.repository.save(new Employee("Bilbo", "Baggins", "burglar"));
        this.repository.save(new Employee("Gandalf", "the Grey", "wizard"));
        this.repository.save(new Employee("Samwise", "Gamgee", "gardener"));
        this.repository.save(new Employee("Meriadoc", "Brandybuck", "pony rider"));
        this.repository.save(new Employee("Peregrin", "Took", "pipe smoker"));*/
    }
}
