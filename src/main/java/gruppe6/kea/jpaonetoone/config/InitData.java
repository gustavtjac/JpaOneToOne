package gruppe6.kea.jpaonetoone.config;

import gruppe6.kea.jpaonetoone.Model.Employee;
import gruppe6.kea.jpaonetoone.Model.Gender;
import gruppe6.kea.jpaonetoone.Model.User;
import gruppe6.kea.jpaonetoone.Repositories.EmployeeRepository;
import gruppe6.kea.jpaonetoone.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;
    @Autowired
    EmployeeRepository employeeRepository;


    @Override
    public void run(String... args) throws Exception {
User us1 = new User();
us1.setEmail("gustavo@gay.dk");
us1.setPassword("1234");
userRepository.save(us1);

User us2 = new User();
us2.setEmail("victor@straight.com");
us2.setPassword("1234");
userRepository.save(us2);

User us3 = new User();
us3.setEmail("John@jonas.dk");
us3.setPassword("1234");
userRepository.save(us3);

Employee employee = new Employee();
employee.setBorn(LocalDateTime.now());
employee.setGender(Gender.MALE);
employee.setVegetarian(false);
employee.setName("Gustavo");
employee.setUser(us1);
employeeRepository.save(employee);

        Employee employee2 = new Employee();
        employee2.setBorn(LocalDateTime.now());
        employee2.setGender(Gender.FEMALE);
        employee2.setVegetarian(true);
        employee2.setName("victor");
        employee2.setUser(us2);
        employeeRepository.save(employee2);

        Employee employee3 = new Employee();
        employee3.setBorn(LocalDateTime.now());
        employee3.setGender(Gender.MALE);
        employee3.setVegetarian(false);
        employee3.setName("john-jonas");
        employee3.setUser(us3);
        employeeRepository.save(employee3);





    }
}
