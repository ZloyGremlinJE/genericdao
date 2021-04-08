package com.example.genericdao.genericdao.dao;

import com.example.genericdao.genericdao.model.organization.AbstractOrganization;

//@Repository
public class AbstractOrganizationDAOImpl extends AbstractJpaDAO<AbstractOrganization> implements AbstractOrganizationDAO{
    public AbstractOrganizationDAOImpl() {
        super();
        setClazz(AbstractOrganization.class);
    }
}
