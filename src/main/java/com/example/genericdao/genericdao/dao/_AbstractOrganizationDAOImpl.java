package com.example.genericdao.genericdao.dao;


import com.example.genericdao.genericdao.model.organization.AbstractOrganization;
import org.springframework.stereotype.Repository;

@Repository
public class _AbstractOrganizationDAOImpl extends _AbstractJpaDAO<AbstractOrganization> implements _AbstractOrganizationDAO {
    public _AbstractOrganizationDAOImpl() {
        super();
        setClazz(AbstractOrganization.class);
    }

}
