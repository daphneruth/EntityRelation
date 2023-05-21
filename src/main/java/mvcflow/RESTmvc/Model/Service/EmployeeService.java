package mvcflow.RESTmvc.Model.Service;

import mvcflow.RESTmvc.Model.Entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
 public Integer saveEmployee(EmployeeEntity employee);

 public List<EmployeeEntity> getAllEmployees();

 public EmployeeEntity getEmployeeById(Integer id);

 public void deleteEmployee(Integer id);
}
