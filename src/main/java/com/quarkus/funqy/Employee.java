package com.quarkus.funqy;

import javax.persistence.*;

@Entity(name = "EmployeeQuarkus")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    @ManyToOne
    @JoinColumn(name = "supervisorId")
    private Employee supervisor;

    public Employee() {
    }

    public Employee(int id, String name, String email, Employee supervisor) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.supervisor = supervisor;
    }

    public Employee(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }
}
