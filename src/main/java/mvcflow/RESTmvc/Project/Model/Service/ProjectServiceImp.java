package mvcflow.RESTmvc.Project.Model.Service;

import mvcflow.RESTmvc.Project.Model.Entity.ProjectEntity;

import mvcflow.RESTmvc.Project.Model.Repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class ProjectServiceImp implements ProjectService{

    @Autowired
    private mvcflow.RESTmvc.Project.Model.Repository.ProjectRepository projectRepository;

    @Autowired
    public void ProjectServiceImpl (ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Integer saveProject(ProjectEntity project) {
        ProjectEntity savedProject = projectRepository.save(project);
        return  savedProject.getProjectId();
    }
    @Override
    public List<ProjectEntity> getAllProjects() {
        return projectRepository.findAll();
    }

    @Override
    public ProjectEntity getProjectById(Integer id) {
        return projectRepository.findById(id).orElse(null);
    }


    @Override
    public void deleteProject(Integer id) {
        projectRepository.deleteById(id);
    }

}


