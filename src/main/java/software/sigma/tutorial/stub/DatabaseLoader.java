package software.sigma.tutorial.stub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import software.sigma.tutorial.model.Employee;
import software.sigma.tutorial.model.Manager;
import software.sigma.tutorial.repository.EmployeeRepository;
import software.sigma.tutorial.repository.ManagerRepository;

/**
 * Created by alexandr.efimov on 2/14/2017.
 */
@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository repository;
    @Autowired
    private ManagerRepository managerRepository;

    @Autowired
    public DatabaseLoader(EmployeeRepository employeeRepository) {
        this.repository = employeeRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
/*        Manager greg = this.managerRepository.save(new Manager("greg", "turnquist",
                "ROLE_MANAGER"));
        Manager oliver = this.managerRepository.save(new Manager("oliver", "gierke",
                "ROLE_MANAGER"));

        SecurityContextHolder.getContext().setAuthentication(
                new UsernamePasswordAuthenticationToken("greg", "doesn't matter",
                        AuthorityUtils.createAuthorityList("ROLE_MANAGER")));

        this.repository.save(new Employee("Frodo", "Baggins", "ring bearer", greg));
        this.repository.save(new Employee("Bilbo", "Baggins", "burglar", greg));
        this.repository.save(new Employee("Gandalf", "the Grey", "wizard", greg));

        SecurityContextHolder.getContext().setAuthentication(
                new UsernamePasswordAuthenticationToken("oliver", "doesn't matter",
                        AuthorityUtils.createAuthorityList("ROLE_MANAGER")));

        this.repository.save(new Employee("Samwise", "Gamgee", "gardener", oliver));
        this.repository.save(new Employee("Merry", "Brandybuck", "pony rider", oliver));
        this.repository.save(new Employee("Peregrin", "Took", "pipe smoker", oliver));

        SecurityContextHolder.clearContext();*/
    }
}
