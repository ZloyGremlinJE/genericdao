package com.example.genericdao.genericdao.service.abstracts;

import com.example.genericdao.genericdao.model.pagination.PageDto;
import com.example.genericdao.genericdao.reportsDTO.ServiceRequestInfo;
import com.example.genericdao.genericdao.service.pagination.PaginationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ReportServiceRequestServiceImpl implements ReportServiceRequestService {

    private final PaginationService<ServiceRequestInfo,Object> paginationService;

    @Autowired
    public ReportServiceRequestServiceImpl(PaginationService<ServiceRequestInfo,Object> paginationService)  {
        this.paginationService = paginationService;
    }


    @Override
    public PageDto<ServiceRequestInfo, Object> getPageAllServiceRequestInfo(int page, int size) {
        return paginationService.getPageDto("PaginationServiceRequestInfo",setPaginationParameters(page, size));
    }


    private Map<String, Object> setPaginationParameters(int page, int size) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("page", page);
        parameters.put("size", size);
        return parameters;
    }


}
