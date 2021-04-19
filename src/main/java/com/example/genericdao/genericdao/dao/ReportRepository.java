package com.example.genericdao.genericdao.dao;

import com.example.genericdao.genericdao.model.User;
import com.example.genericdao.genericdao.model.organization.AbstractOrganization;

import java.util.List;

public interface ReportRepository {
    Long getCountServiceRequestByEngineer(User engineer, AbstractOrganization sc_organization) ;
    Long getCountServiceRequestByClientOrganization(AbstractOrganization cl_organization, AbstractOrganization sc_organization);
    Long getCountAllServiceRequest(AbstractOrganization sc_organization);
    List<User> getAllUser();

}
