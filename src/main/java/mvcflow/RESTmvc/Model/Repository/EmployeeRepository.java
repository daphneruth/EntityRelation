package mvcflow.RESTmvc.Model.Repository;

import mvcflow.RESTmvc.Model.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

}
