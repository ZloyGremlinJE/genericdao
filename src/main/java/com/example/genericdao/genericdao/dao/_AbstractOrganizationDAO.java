package com.example.genericdao.genericdao.dao;

import com.example.genericdao.genericdao.model.User;
import com.example.genericdao.genericdao.model.organization.AbstractOrganization;

import java.util.List;

public interface _AbstractOrganizationDAO {
    AbstractOrganization findOne(long id);

    List<AbstractOrganization> findAll();

    void create(AbstractOrganization entity);

    AbstractOrganization update(AbstractOrganization entity);

    void deleteById(long entityId);
}
