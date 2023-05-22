package mvcflow.RESTmvc.Project.Contoller;

import mvcflow.RESTmvc.Project.Model.Entity.ProjectEntity;
import mvcflow.RESTmvc.Project.Model.Entity.ProjectEntity;
import mvcflow.RESTmvc.Project.Model.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/project")

public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping("/save")
    public ResponseEntity createProject(@RequestBody ProjectEntity project) {
        Integer id = projectService.saveProject(project);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping(value = {"/getProjects", "/{projectId}"})
    public List<ProjectEntity> getProjects(@PathVariable(required = false) Integer id) {
        ProjectEntity project = projectService.getProjectById(id);
        return (List<ProjectEntity>) new ResponseEntity<>(project, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{projectId}")
    public ResponseEntity removeProject(@PathVariable Integer projectId) {
        projectService.deleteProject(projectId);
        return new ResponseEntity(HttpStatus.OK);
    }
}
