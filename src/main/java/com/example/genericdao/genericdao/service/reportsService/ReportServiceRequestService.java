package com.example.genericdao.genericdao.service.reportsService;

import com.example.genericdao.genericdao.model.pagination.PageDto;
import com.example.genericdao.genericdao.reportsDTO.ServiceRequestInfo;

public interface ReportServiceRequestService {
    PageDto<ServiceRequestInfo> getPageAllServiceRequestInfo(int page, int size);
}
