package com.jrp.pma.projectmanagement.controllers;

import com.jrp.pma.projectmanagement.dao.EmployeeRepository;
import com.jrp.pma.projectmanagement.dao.ProjectRepository;
import com.jrp.pma.projectmanagement.entities.Employee;
import com.jrp.pma.projectmanagement.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    ProjectRepository projectRepo;

    @Autowired
    EmployeeRepository employeeRepo;

    @GetMapping("/")
    public String displayProjects(Model model){
        List<Project> projects = projectRepo.findAll();
        model.addAttribute("projects",projects);
        List<Employee> employees = employeeRepo.findAll();
        model.addAttribute("employees", employees);
        return "home";
    }

//    @GetMapping("/")
//    public String displayEmployees(Model model){
//        List<Employee> employees = employeeRepo.findAll();
//        model.addAttribute("employees", employees);
//        return "home";
//    }
}
