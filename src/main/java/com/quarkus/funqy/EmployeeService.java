package com.quarkus.funqy;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class EmployeeService {
    public List<Employee> getEmployees(){
        List<Employee> list = new ArrayList();

        Employee e = new Employee(1, "name", "thisis@mockmail.com", null);
        list.add(e);

        for(int i = 2; i < 100; i++){
            e = new Employee(i, "name", "thisis@mockmail.com", e);
            list.add(e);
        }

        return list;
    }
}
