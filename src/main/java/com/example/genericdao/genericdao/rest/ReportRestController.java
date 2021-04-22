package com.example.genericdao.genericdao.rest;

import com.example.genericdao.genericdao.reportsDTO.ServiceRequestInfo;
import com.example.genericdao.genericdao.service.reports.ReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reportAPI")
public class ReportRestController {

    private final ReportService reportService;


    @GetMapping("/allServiceRequests")
    public ResponseEntity<?> getAllServiceRequests(@RequestParam("page") int page,  @RequestParam("size") int size) {

       final List<ServiceRequestInfo> sr_infos = reportService.getAllServiceRequests(Integer.valueOf(page).toString());
        return sr_infos != null
                ? new ResponseEntity<>(sr_infos, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }



}
