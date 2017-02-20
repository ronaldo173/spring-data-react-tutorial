package software.sigma.tutorial.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import software.sigma.tutorial.model.Employee;
import software.sigma.tutorial.model.Manager;
import software.sigma.tutorial.repository.ManagerRepository;

/**
 * Created by alexandr.efimov on 2/20/2017.
 */
@Component
@RepositoryEventHandler(Employee.class)
public class SecurityEventHandler {

    @Autowired
    private ManagerRepository managerRepository;

    @HandleBeforeCreate
    public void applyUserInformationWithSecurityContext(Employee employee) {
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        Manager manager = managerRepository.findByName(name);

        if (manager == null) {
            manager = new Manager();
            manager.setName(name);
            manager.setRoles(new String[]{"ROLE_MANAGER"});
            manager = managerRepository.save(manager);
        }

        employee.setManager(manager);
    }

}
