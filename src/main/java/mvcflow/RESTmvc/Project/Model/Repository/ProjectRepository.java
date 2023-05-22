package mvcflow.RESTmvc.Project.Model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import mvcflow.RESTmvc.Project.Model.Entity.ProjectEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<ProjectEntity, Integer> {

}