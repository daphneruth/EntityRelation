package mvcflow.RESTmvc.Project.Model.Service;


import mvcflow.RESTmvc.Project.Model.Entity.ProjectEntity;

import java.util.List;

public interface ProjectService {
    public Integer saveProject(ProjectEntity project);

    public List<ProjectEntity> getAllProjects();

    public ProjectEntity getProjectById(Integer id);

    public void deleteProject(Integer id);
}
