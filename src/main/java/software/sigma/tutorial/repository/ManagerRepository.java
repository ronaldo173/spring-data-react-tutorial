package software.sigma.tutorial.repository;

import org.springframework.data.repository.Repository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import software.sigma.tutorial.model.Manager;

/**
 * Created by alexandr.efimov on 2/20/2017.
 */
@RepositoryRestResource(exported = false)
public interface ManagerRepository extends Repository<Manager, Long> {

    Manager save(Manager manager);

    Manager findByName(String name);
}
