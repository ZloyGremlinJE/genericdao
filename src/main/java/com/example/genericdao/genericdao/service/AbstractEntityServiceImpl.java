package com.example.genericdao.genericdao.service;

import com.example.genericdao.genericdao.dao.AbstractEntityDAO;

import java.util.List;

public class AbstractEntityServiceImpl<T> implements AbstractEntityService<T> {
    private final AbstractEntityDAO<T> abstractEntityDAO;

    public AbstractEntityServiceImpl(AbstractEntityDAO<T> abstractEntityDAO) {
        this.abstractEntityDAO = abstractEntityDAO;
    }

    @Override
    public T findById(Long id) {
        return abstractEntityDAO.findById(id);
    }

    @Override
    public List findAll() {
        return abstractEntityDAO.findAll();
    }

    @Override
    public void remove(T entity) {
        abstractEntityDAO.remove(entity);
    }

    @Override
    public void removeById(Long id) {
        abstractEntityDAO.removeById(id);
    }

    @Override
    public Boolean isExistById(Long id) {
        return abstractEntityDAO.isExistById(id);
    }

    @Override
    public void save(T entity) {
        abstractEntityDAO.save(entity);
    }

    @Override
    public T update(T entity) {
        return abstractEntityDAO.update(entity);
    }
}
