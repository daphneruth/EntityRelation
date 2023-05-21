package mvcflow.RESTmvc.Model.Repository;

import mvcflow.RESTmvc.Model.Entity.AddressEntity;
import mvcflow.RESTmvc.Model.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<AddressEntity, Integer> {

}
