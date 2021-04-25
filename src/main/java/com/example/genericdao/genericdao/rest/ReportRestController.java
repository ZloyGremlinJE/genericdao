package com.example.genericdao.genericdao.rest;

import com.example.genericdao.genericdao.model.pagination.PageDto;
import com.example.genericdao.genericdao.reportsDTO.ServiceRequestInfo;
import com.example.genericdao.genericdao.service.reportsService.ReportServiceRequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/reportAPI")
public class ReportRestController {
    private static final int MAX_ITEMS_ON_PAGE = 100;
    private final ReportServiceRequestService serviceRequestService;

    @GetMapping("/serviceRequestsInfo")
    public ResponseEntity<?> getServiceRequestsInfo(@RequestParam("page") int page,  @RequestParam("size") int size){
        if (page <= 0 || size <= 0 || size > MAX_ITEMS_ON_PAGE) {
            return ResponseEntity.badRequest().body("Номер страницы и размер должны быть " +
                    "положительными. Максимальное количество записей на странице " + MAX_ITEMS_ON_PAGE);
        }
        PageDto<ServiceRequestInfo> resultPage = serviceRequestService.getPageAllServiceRequestInfo(page, size);

        return  ResponseEntity.ok(resultPage);
    }
}
