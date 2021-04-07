package com.example.genericdao.genericdao.service;

import com.example.genericdao.genericdao.dao.AbstractOrganizationDAO;
import com.example.genericdao.genericdao.model.organization.AbstractOrganization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class AbstractOrganizationServiceImpl implements AbstractOrganizationService {
    @Autowired
    AbstractOrganizationDAO dao;

    @Override
    public AbstractOrganization findOne(long id) {
        return dao.findOne(id);
    }

    @Override
    public List<AbstractOrganization> findAll() {
        return dao.findAll();
    }

    @Override
    public void create(AbstractOrganization entity) {
        dao.create(entity);
    }

    @Override
    public AbstractOrganization update(AbstractOrganization entity) {
        return dao.update(entity);
    }

    @Override
    public void delete(AbstractOrganization entity) {
        dao.delete(entity);
    }

    @Override
    public void deleteById(long entityId) {
        dao.deleteById(entityId);
    }
}
