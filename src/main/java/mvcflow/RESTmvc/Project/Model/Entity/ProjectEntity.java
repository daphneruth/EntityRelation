package mvcflow.RESTmvc.Project.Model.Entity;

import lombok.Data;

import mvcflow.RESTmvc.Employees.Model.Entity.EmployeeEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Data

@Table(name = "project")
public class ProjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer projectId;
    private String projectName;


    @JsonIgnore
    @ManyToMany(mappedBy = "assignedProjects")
    private Set<EmployeeEntity> employeeSet = new HashSet<>();
}