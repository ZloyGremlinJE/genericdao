package com.example.genericdao.genericdao.service;


import com.example.genericdao.genericdao.model.ServiceRequest;

import java.util.List;

public interface ServiceRequestService {
    List<ServiceRequest> getAllServiceRequests();
    void saveServiceRequest(ServiceRequest request);
    void updateServiceRequest(ServiceRequest request);
    void deleteServiceRequest(ServiceRequest request);
    ServiceRequest getServiceRequestById(long id);
}
