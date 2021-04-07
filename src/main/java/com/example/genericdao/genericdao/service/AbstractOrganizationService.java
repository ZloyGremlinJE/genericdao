package com.example.genericdao.genericdao.service;

import com.example.genericdao.genericdao.model.organization.AbstractOrganization;

import java.util.List;

public interface AbstractOrganizationService {
    AbstractOrganization findOne(long id);

    List<AbstractOrganization> findAll();

    void create(AbstractOrganization entity);

    AbstractOrganization update(AbstractOrganization entity);

    void delete(AbstractOrganization entity);

    void deleteById(long entityId);
}
