package com.example.genericdao.genericdao.service;

import com.example.genericdao.genericdao.dao.AbstractOrganizationDAO;
import com.example.genericdao.genericdao.dao._AbstractOrganizationDAO;
import com.example.genericdao.genericdao.model.organization.AbstractOrganization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AbstractOrganizationServiceImpl implements AbstractOrganizationService {

    private AbstractOrganizationDAO organizationDAO;

    @Autowired
    public AbstractOrganizationServiceImpl(AbstractOrganizationDAO organizationDAO) {
        this.organizationDAO = organizationDAO;
    }

    @Override
    public AbstractOrganization findOne(long id) {
        return organizationDAO.findById(id);
    }

    @Override
    public List<AbstractOrganization> findAll() {
        return organizationDAO.findAll();
    }

    @Override
    public void create(AbstractOrganization entity) {
        organizationDAO.save(entity);
    }

    @Override
    public AbstractOrganization update(AbstractOrganization entity) {
        return organizationDAO.update(entity);
    }

    @Override
    public void deleteById(long entityId) {
        organizationDAO.removeById(entityId);

    }
}
