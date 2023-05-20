package mvcflow.RESTmvc.Model.Service;

import mvcflow.RESTmvc.Model.Entity.EmployeeEntity;
import mvcflow.RESTmvc.Model.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class EmployeeService {
 private EmployeeRepository employeeRepository;

 @Autowired
 public EmployeeService(EmployeeRepository employeeRepository) {
  this.employeeRepository = employeeRepository;
 }

 public List<EmployeeEntity> getAllEmployees() {
  List<EmployeeEntity> all = employeeRepository.findAll();
  return all;
 }

}