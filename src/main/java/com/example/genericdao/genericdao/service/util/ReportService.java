package com.example.genericdao.genericdao.service.util;

import com.example.genericdao.genericdao.model.User;
import com.example.genericdao.genericdao.model.organization.AbstractOrganization;
import com.example.genericdao.genericdao.model.reports.ServiceRequestInfo;

import java.util.List;

public interface ReportService {
    Long getCountServiceRequestByEngineer(User engineer, AbstractOrganization sc_organization) ;
    Long getCountServiceRequestByClientOrganization(AbstractOrganization cl_organization, AbstractOrganization sc_organization);
    Long getCountAllServiceRequest(AbstractOrganization sc_organization);
    List<ServiceRequestInfo> getAllServiceRequests();
}
