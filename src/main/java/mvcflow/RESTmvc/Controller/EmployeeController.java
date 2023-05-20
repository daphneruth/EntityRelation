package mvcflow.RESTmvc.Controller;


import io.swagger.annotations.Api;
import mvcflow.RESTmvc.Model.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
@Api(tags = "Employee API")
public class EmployeeController {

 @Autowired
 private EmployeeService employeeService;

    @GetMapping ("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();


    }
}