package com.example.genericdao.genericdao.dao;


import com.example.genericdao.genericdao.model.ServiceRequest;

import java.util.List;

public interface ServiceRequestRepository {
    List<ServiceRequest> getAllServiceRequests();
    void saveServiceRequest(ServiceRequest request);
    void updateServiceRequest(ServiceRequest request);
    void deleteServiceRequest(ServiceRequest request);
    ServiceRequest getServiceRequestById(long id);
}
