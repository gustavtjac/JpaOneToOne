package gruppe6.kea.jpaonetoone.Repositories;

import gruppe6.kea.jpaonetoone.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    List<Employee> findEmployeeByName(String name);
}
