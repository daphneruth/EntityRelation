package mvcflow.RESTmvc.Model.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.transaction.Transactional;

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

    @OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "fk_add_id")
    private AddressEntity Address;


    @OneToOne(optional = false)
    private AddressEntity addressEntity;

    public AddressEntity getAddressEntity() {
        return addressEntity;
    }

    public void setAddressEntity(AddressEntity addressEntity) {
        this.addressEntity = addressEntity;
    }
}