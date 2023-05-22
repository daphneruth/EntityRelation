package mvcflow.RESTmvc.Model.Entity;
import com.fasterxml.jackson.annotation.JsonProperty;
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

    @Column(nullable = false)


    private String firstName;

    @Column(nullable = false)

    private String lastName;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "foreign_id")
    private AddressEntity address;



//  @OneToMany(cascade = CascadeType.ALL)
//   @JoinColumn(name = "foreign_id",referencedColumnName = "id")
//    private List<AddressEntity> address;
}
