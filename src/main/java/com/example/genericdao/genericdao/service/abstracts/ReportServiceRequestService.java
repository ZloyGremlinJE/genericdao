package com.example.genericdao.genericdao.service.abstracts;

import com.example.genericdao.genericdao.model.pagination.PageDto;
import com.example.genericdao.genericdao.reportsDTO.ServiceRequestInfo;

public interface ReportServiceRequestService {
    PageDto<ServiceRequestInfo, Object> getPageAllServiceRequestInfo(int page, int size);
}
