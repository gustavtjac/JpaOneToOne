package gruppe6.kea.jpaonetoone.Repositories;

import gruppe6.kea.jpaonetoone.Model.Employee;
import org.hibernate.JDBCException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.InvalidDataAccessApiUsageException;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeRepositoryTest {

    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    UserRepository userRepository;

    @Test
    void findEmployeeByName() {
        List<Employee> list = employeeRepository.findEmployeeByName("victor");
        assertFalse(list.isEmpty());

    }
    @Test
    void testDeleteUser() {
        List<Employee> list = employeeRepository.findEmployeeByName("victor");
        Employee employee = list.getFirst();
        assertEquals("victor",employee.getName());
        assertThrows(InvalidDataAccessApiUsageException.class  , () -> userRepository.delete(employee.getUser()));

    }


}