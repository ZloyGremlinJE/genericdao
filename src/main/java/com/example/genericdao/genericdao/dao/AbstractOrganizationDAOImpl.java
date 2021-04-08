package com.example.genericdao.genericdao.dao;


import com.example.genericdao.genericdao.model.organization.AbstractOrganization;
import org.springframework.stereotype.Repository;

@Repository
public class AbstractOrganizationDAOImpl extends AbstractJpaDAO<AbstractOrganization> implements AbstractOrganizationDAO {
    public AbstractOrganizationDAOImpl() {
        super();
        setClazz(AbstractOrganization.class);
    }

}
