package com.jrp.pma.projectmanagement.controllers;

import com.jrp.pma.projectmanagement.dao.EmployeeRepository;
import com.jrp.pma.projectmanagement.dao.ProjectRepository;
import com.jrp.pma.projectmanagement.entities.Employee;
import com.jrp.pma.projectmanagement.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    @Autowired //creates a anonymous class, initalizes and injects proRepo into this class to use crudrepo methods
    ProjectRepository proRepo;

    @Autowired
    EmployeeRepository employeeRepo;

    @GetMapping("/new")
    public String displayProjectForm(Model model){
        Project aProject = new Project();
        List<Employee> employees = employeeRepo.findAll();
        model.addAttribute("project", aProject);
        model.addAttribute("allEmployees", employees);
        return "new-project";
    }

    @PostMapping(value = "/save")
    public String createProject(Project project, @RequestParam List<Long> employees, Model model) {
        proRepo.save(project);

        Iterable<Employee> chosenEmployee = employeeRepo.findAllById(employees);

        for (Employee emp : chosenEmployee){
            emp.setTheProject(project);
            employeeRepo.save(emp);
        }

        //user a redirect to prevent duplicate submissions
        return "redirect:/projects/new";
    }

//    @PostMapping("/update/{id}")
//    public String updateUser(@PathVariable("projectId") long id, @Valid Project project,
//    BindingResult result, Model model) {
//    if (result.hasErrors()) {
//        project.setProjectId(id);
//        return "update-project";
//    }
//
//    proRepo.save(project);
//    model.addAttribute("projects", proRepo.findAll());
//    return "update-project";
//    }

}
