package com.example.genericdao.genericdao.model.organization;


import com.example.genericdao.genericdao.model.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "organization")
public abstract class AbstractOrganization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "organization")
    private List<User> employees = new ArrayList<>();

    public void addNewEmployee(User employee) {
        employees.add(employee);
        employee.setOrganization(this);
    }

    public void removeEmployee(User employee) {
        employees.remove(employee);
        employee.setOrganization(null);
    }
}
