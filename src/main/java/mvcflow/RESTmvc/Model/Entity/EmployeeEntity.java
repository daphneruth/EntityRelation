package mvcflow.RESTmvc.Model.Entity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
@Entity
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String firstName;
    private String lastName;


    // Constructors, getters, and setters


//    public EmployeeEntity(Integer id, String firstName, String lastName) {
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//  }
//
//
//    //Getters and Setters
//
//    public int getId() {
//        return id;
//    }
//
//
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//}
//
//
//
}