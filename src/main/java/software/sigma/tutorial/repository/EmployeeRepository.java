package software.sigma.tutorial.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import software.sigma.tutorial.model.Employee;

/**
 * Created by alexandr.efimov on 2/14/2017.
 */
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
}
