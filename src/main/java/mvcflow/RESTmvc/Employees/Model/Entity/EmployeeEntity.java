package mvcflow.RESTmvc.Employees.Model.Entity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import mvcflow.RESTmvc.Project.Model.Entity.ProjectEntity;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

//Entity relation:One To One
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "foreign_id")
//    private AddressEntity address;


//
//  @OneToMany(cascade = CascadeType.ALL)
//   @JoinColumn(name = "foreign_id",referencedColumnName = "id")
//    private List<AddressEntity> address;


    @ManyToMany
    @JoinTable(

            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "project_id")
    )
    private Set<ProjectEntity> assignedProjects = new HashSet<>();
}
