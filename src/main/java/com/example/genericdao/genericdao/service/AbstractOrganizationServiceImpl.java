package com.example.genericdao.genericdao.service;

import com.example.genericdao.genericdao.dao.AbstractOrganizationDAO;
import com.example.genericdao.genericdao.model.organization.AbstractOrganization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class AbstractOrganizationServiceImpl extends AbstractEntityServiceImpl<AbstractOrganization> implements AbstractOrganizationService {

    private final AbstractOrganizationDAO organizationDAO;

    @Autowired
    public AbstractOrganizationServiceImpl(AbstractOrganizationDAO organizationDAO) {
        super(organizationDAO);
        this.organizationDAO = organizationDAO;
    }


}
