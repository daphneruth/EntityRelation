package mvcflow.RESTmvc.Employees.Model.Service;

import mvcflow.RESTmvc.Employees.Model.Entity.EmployeeEntity;
import mvcflow.RESTmvc.Employees.Model.Repository.AddressRepository;
import mvcflow.RESTmvc.Employees.Model.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private  EmployeeRepository employeeRepository;

    @Autowired
    private AddressRepository  addressRepository;

    @Autowired
  public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
      this.employeeRepository = employeeRepository;
  }

    @Override
    public Integer saveEmployee(EmployeeEntity employee) {
        EmployeeEntity savedEmployee = employeeRepository.save(employee);
        return savedEmployee.getId();
    }

    @Override
    public List<EmployeeEntity> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public EmployeeEntity getEmployeeById(Integer id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }

}









