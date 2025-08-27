package gruppe6.kea.jpaonetoone.Controller;


import gruppe6.kea.jpaonetoone.Model.Employee;
import gruppe6.kea.jpaonetoone.Repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeRestController {

    @Autowired
    EmployeeRepository employeeRepository;



    @GetMapping
    public List<Employee> getEmployees(){

        return employeeRepository.findAll();
    }


}
