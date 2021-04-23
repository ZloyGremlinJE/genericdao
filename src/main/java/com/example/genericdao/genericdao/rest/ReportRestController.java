package com.example.genericdao.genericdao.rest;

import com.example.genericdao.genericdao.model.pagination.PageDto;
import com.example.genericdao.genericdao.reportsDTO.ServiceRequestInfo;
import com.example.genericdao.genericdao.service.abstracts.ReportServiceRequestService;
import com.example.genericdao.genericdao.service.reports.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reportAPI")
public class ReportRestController {
    private static final int MAX_ITEMS_ON_PAGE = 100;

    private final ReportService reportService;


    private final ReportServiceRequestService serviceRequestService;


    @Autowired
    public ReportRestController(ReportService reportService, ReportServiceRequestService serviceRequestService) {
        this.reportService = reportService;
        this.serviceRequestService = serviceRequestService;
    }


    @GetMapping("/serviceRequestsInfo")
    public ResponseEntity<?> getServiceRequestsInfo(@RequestParam("page") int page,  @RequestParam("size") int size){
        if (page <= 0 || size <= 0 || size > MAX_ITEMS_ON_PAGE) {
            return ResponseEntity.badRequest().body("Номер страницы и размер должны быть " +
                    "положительными. Максимальное количество записей на странице " + MAX_ITEMS_ON_PAGE);
        }
        PageDto<ServiceRequestInfo,Object> resultPage = serviceRequestService.getPageAllServiceRequestInfo(page, size);

        return  ResponseEntity.ok(resultPage);
    }



    @GetMapping("/allServiceRequests")
    public ResponseEntity<?> getAllServiceRequests(@RequestParam("page") int page,  @RequestParam("size") int size) {

       final List<ServiceRequestInfo> sr_infos = reportService.getAllServiceRequests(Integer.valueOf(page).toString());
        return sr_infos != null
                ? new ResponseEntity<>(sr_infos, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }



}
