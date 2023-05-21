package mvcflow.RESTmvc.Model.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name = "address_details")

public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id")
    private Long addressId;

    private String street;
    private String city;
    private String state;


}
