package com.example.genericdao.genericdao.model;


import com.example.genericdao.genericdao.model.organization.AbstractOrganization;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;


    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE
            , CascadeType.REFRESH, CascadeType.DETACH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id")
    private AbstractOrganization organization;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "client_employee")
    private Collection<ServiceRequest> serviceRequest;

    public Collection<ServiceRequest> getServiceRequest() {
        return serviceRequest;
    }

    public void setServiceRequest(Collection<ServiceRequest> serviceRequest) {
        this.serviceRequest = serviceRequest;
    }
}
