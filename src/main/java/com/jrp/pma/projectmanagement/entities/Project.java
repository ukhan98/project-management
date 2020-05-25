package com.jrp.pma.projectmanagement.entities;

import javax.persistence.*;
import java.util.List;

@Entity //annotation used to tell database, this is the pojo identifier
//@Table(name="user")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long projectId;

//    @Column( name = "project_name")
    private String name;

//    @Column( name = "project_stage")
    private String stage; //NotStarted, Completed, InProgress

//    @Column( name = "project_description")
    private String description;


    @OneToMany(mappedBy = "theProject" )
    private List<Employee> employees;

    public Project(){

    }

    public Project(String name, String stage, String description) {

        this.name = name;
        this.stage = stage;
        this.description = description;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
