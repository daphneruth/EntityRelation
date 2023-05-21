package mvcflow.RESTmvc.Model.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@Data
@Entity
@Transactional
@NoArgsConstructor
@Table(name = "employee_entity")
public class EmployeeEntity {

    @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    private String firstName;
    private String lastName;



//
//    @OneToOne(optional = false)
//    private AddressEntity addressEntity;

//    public AddressEntity getAddressEntity() {
//        return addressEntity;
//    }
//
//    public void setAddressEntity(AddressEntity addressEntity) {
//        this.addressEntity = addressEntity;
//    }


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "foregn_id", referencedColumnName = "id")
    private List <EmployeeEntity> employee;

}