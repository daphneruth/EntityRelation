package mvcflow.RESTmvc.Model.Service;

import mvcflow.RESTmvc.Controller.Employee;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

 private List <Employee> employees = Arrays.asList(
         new Employee ("Daphne", "Ruth"),
         new Employee ("Chebet", "Sang"),
         new Employee("John", "mualuko")
 );
 public List <Employee> getAllEmployees(){
  return employees;
 }

}
