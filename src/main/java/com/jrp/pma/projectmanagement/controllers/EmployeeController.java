package com.jrp.pma.projectmanagement.controllers;

import com.jrp.pma.projectmanagement.dao.EmployeeRepository;
import com.jrp.pma.projectmanagement.entities.Employee;
import com.jrp.pma.projectmanagement.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepo;

    @GetMapping("/new")
    public String displayEmployeeForm(Model model){
        Employee aEmployee = new Employee();
        model.addAttribute("employee", aEmployee);
        return "new-employee";
    }

    @PostMapping(value = "/save")
    public String createEmployee(Employee employee, Model model) {
        employeeRepo.save(employee);
        //user a redirect to prevent duplicate submissions
        return "redirect:/employees/new";
    }

//    @GetMapping("/edit/{employeeId}")
//    public String showUpdateForm(@PathVariable("employeeId") long employeeId, Model model) {
//        Employee editEmployee = employeeRepo.findById(employeeId)
//                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + employeeId));
//
//        model.addAttribute("employee", editEmployee);
//        return "update-employee";
//    }
}
