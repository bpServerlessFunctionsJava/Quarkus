package com.quarkus.funqy;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class PersonService {
    public List<Employee> getEmployees(){
        List<Employee> list = new ArrayList();

        List<String> items = new ArrayList() {{
            add("a");
            add("b");
            add("c");
            add("d");
            add("e");
            add("f");
            add("g");
            add("h");
        }};

        Employee e = new Employee(1, "name", "thisis@mockmail.com", null,items);
        list.add(e);

        for(int i = 2; i < 100; i++){
            e = new Employee(i, "name", "thisis@mockmail.com", e, items);
            list.add(e);
        }

        return list;
    }
}
