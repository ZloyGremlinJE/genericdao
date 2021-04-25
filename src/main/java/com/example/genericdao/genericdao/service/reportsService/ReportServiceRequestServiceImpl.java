package com.example.genericdao.genericdao.service.reportsService;

import com.example.genericdao.genericdao.model.pagination.PageDto;
import com.example.genericdao.genericdao.reportsDTO.ServiceRequestInfo;
import com.example.genericdao.genericdao.service.pagination.PaginationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@RequiredArgsConstructor
@Service
public class ReportServiceRequestServiceImpl implements ReportServiceRequestService {

    private final PaginationService<ServiceRequestInfo,Object> paginationService;


    @Override
    public PageDto<ServiceRequestInfo> getPageAllServiceRequestInfo(int page, int size) {
        return paginationService.getPageDto("PaginationServiceRequestInfoDao",setPaginationParameters(page, size));
    }


    private Map<String, Object> setPaginationParameters(int page, int size) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("page", page);
        parameters.put("size", size);
        return parameters;
    }


}
