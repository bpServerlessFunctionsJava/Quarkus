package com.quarkus.funqy;

import javax.persistence.*;

@Entity(name = "EmployeeQuarkus")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;

    public Employee() {
    }

    public Employee(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Employee(String name){
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
}
