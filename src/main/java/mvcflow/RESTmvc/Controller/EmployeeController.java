package mvcflow.RESTmvc.Controller;


import io.swagger.annotations.Api;
import mvcflow.RESTmvc.Model.Entity.EmployeeEntity;
import mvcflow.RESTmvc.Model.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;




import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/employeeDetails")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping( "/saveEmployee")
    public ResponseEntity<String> saveEmployee( @RequestBody EmployeeEntity employee) {
        System.out.println(employee.getLastName());
        Integer id = employeeService.saveEmployee(employee);
        return new ResponseEntity<>("Employee with ID '" + id + "' has been saved", HttpStatus.OK);
    }

    @GetMapping("/employeeList")
    public ResponseEntity<List<EmployeeEntity>> getAllEmployees() {
        List<EmployeeEntity> employeeList = employeeService.getAllEmployees();
        return new ResponseEntity<>(employeeList, HttpStatus.OK);
    }

    @GetMapping("/getEmployeeById/{id}")
    public ResponseEntity<EmployeeEntity> getEmployeeById(@PathVariable("id") Integer id) {
        EmployeeEntity employee = employeeService.getEmployeeById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PutMapping("/updateEmployee/{id}")
    public ResponseEntity<String> updateEmployee(@PathVariable("id") Integer id, @RequestBody EmployeeEntity employee) {
        EmployeeEntity employeeFromDb = employeeService.getEmployeeById(id);
        employeeFromDb.setFirstName(employee.getFirstName());
        employeeFromDb.setLastName(employee.getLastName());
        Integer updatedId = employeeService.saveEmployee(employeeFromDb);
        return new ResponseEntity<>("Employee with ID '" + updatedId + "' has been updated", HttpStatus.OK);
    }

    @DeleteMapping("deleteEmployee/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") Integer id) {
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>("Employee with ID '" + id + "' has been deleted", HttpStatus.OK);
    }
}

