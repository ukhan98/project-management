package com.jrp.pma.projectmanagement;

import com.jrp.pma.projectmanagement.dao.EmployeeRepository;
import com.jrp.pma.projectmanagement.dao.ProjectRepository;
import com.jrp.pma.projectmanagement.entities.Employee;
import com.jrp.pma.projectmanagement.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjectManagementApplication {

    @Autowired
    EmployeeRepository employeeRepo;

    @Autowired
    ProjectRepository projectRepo;

    public static void main(String[] args) {
        SpringApplication.run(ProjectManagementApplication.class, args);
    }


//    @Bean
//    CommandLineRunner runner() {
//        return args -> {
//            Employee emp1 = new Employee("John", "Warton", "warton@gmail.com");
//            Employee emp2 = new Employee("Mike", "Lanister", "lanister@gmail.com");
//            Employee emp3 = new Employee("Steve", "Reeves", "Reeves@gmail.com");
//
//            Employee emp4 = new Employee("Ronald", "Connor", "connor@gmail.com");
//            Employee emp5 = new Employee("Jim", "Salvator", "Sal@gmail.com");
//            Employee emp6 = new Employee("Peter", "Henley", "henley@gmail.com");
//
//            Employee emp7 = new Employee("Richard", "Carson", "carson@gmail.com");
//            Employee emp8 = new Employee("Honor", "Miles", "miles@gmail.com");
//            Employee emp9 = new Employee("Tony", "Roggers", "roggers@gmail.com");
//
//
//            Project pro1 = new Project("Large Production Deploy", "NOTSTARTED", "This requires all hands on deck for"
//                    + "the final deployment of the software into production");
//            Project pro2 = new Project("New Employee Budget",  "COMPLETED", "Decide on a new employee bonus budget"
//                    + "for the year and figureout who will be promoted");
//            Project pro3 = new Project("Office Reconstruction", "INPROGRESS", "The office building in Monroe has "
//                    + "been damaged due to hurricane in the region. This needs to be reconstructed");
//            Project pro4 = new Project("Improve Intranet Security", "INPROGRESS", "With the recent data hack, the office"
//                    + "security needs to be improved and proper security team needs to be hired for "
//                    + "implementation");
//
//
//            // save projects in database
//
//            projectRepo.save(pro1);
//            projectRepo.save(pro2);
//            projectRepo.save(pro3);
//            projectRepo.save(pro4);
//
//
//
//
//            // save employees in database
//
//            employeeRepo.save(emp1);
//            employeeRepo.save(emp2);
//            employeeRepo.save(emp3);
//            employeeRepo.save(emp4);
//            employeeRepo.save(emp5);
//            employeeRepo.save(emp6);
//            employeeRepo.save(emp7);
//            employeeRepo.save(emp8);
//            employeeRepo.save(emp9);
//
//
//            emp1.setTheProject(pro1);
//            emp2.setTheProject(pro1);
//            emp3.setTheProject(pro2);
//            emp4.setTheProject(pro3);
//
//            employeeRepo.save(emp1);
//            employeeRepo.save(emp2);
//            employeeRepo.save(emp3);
//            employeeRepo.save(emp4);
//
//
//        };
//    }
}
