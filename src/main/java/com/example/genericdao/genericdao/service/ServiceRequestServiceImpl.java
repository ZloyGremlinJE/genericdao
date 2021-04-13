package com.example.genericdao.genericdao.service;


import com.example.genericdao.genericdao.dao.ServiceRequestRepository;
import com.example.genericdao.genericdao.model.ServiceRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ServiceRequestServiceImpl implements ServiceRequestService {

    private final ServiceRequestRepository requestRepository;

    @Autowired
    public ServiceRequestServiceImpl(ServiceRequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    @Override
    public List<ServiceRequest> getAllServiceRequests() {
        return requestRepository.getAllServiceRequests();
    }

    @Override
    public void saveServiceRequest(ServiceRequest request) {
        requestRepository.saveServiceRequest(request);
    }

    @Override
    public void updateServiceRequest(ServiceRequest request) {
        requestRepository.updateServiceRequest(request);
    }

    @Override
    public void deleteServiceRequest(ServiceRequest request) {
        requestRepository.deleteServiceRequest(request);
    }

    @Override
    public ServiceRequest getServiceRequestById(long id) {
        return requestRepository.getServiceRequestById(id);
    }
}
