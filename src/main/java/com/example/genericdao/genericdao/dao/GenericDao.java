package com.example.genericdao.genericdao.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<T extends Serializable> {

    void setClazz(Class< T > clazzToSet);

    T findOne(final long id);

    List<T> findAll();

    T create(final T entity);

    T update(final T entity);

    void delete(final T entity);

    void deleteById(final long entityId);
}
