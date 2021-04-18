package com.example.genericdao.genericdao.service.util;

import com.example.genericdao.genericdao.dao.ReportRepository;
import com.example.genericdao.genericdao.model.User;
import com.example.genericdao.genericdao.model.organization.AbstractOrganization;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class ReportServiceImpl implements ReportService {

    private final ReportRepository reportRepository;

    @Override
    public Long getCountServiceRequestByEngineer(User engineer, AbstractOrganization sc_organization) {
        return reportRepository.getCountServiceRequestByEngineer(engineer, sc_organization);
    }

    @Override
    public Long getCountServiceRequestByClientOrganization(AbstractOrganization cl_organization, AbstractOrganization sc_organization) {
        return reportRepository.getCountServiceRequestByClientOrganization(cl_organization, sc_organization);
    }

    @Override
    public Long getCountAllServiceRequest(AbstractOrganization sc_organization) {
        return reportRepository.getCountAllServiceRequest(sc_organization);
    }
}
