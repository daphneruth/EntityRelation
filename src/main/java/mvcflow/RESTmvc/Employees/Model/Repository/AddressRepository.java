package mvcflow.RESTmvc.Employees.Model.Repository;

import mvcflow.RESTmvc.Employees.Model.Entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<AddressEntity, Integer> {

}
