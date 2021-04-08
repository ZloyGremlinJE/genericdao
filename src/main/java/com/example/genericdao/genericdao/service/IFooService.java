package com.example.genericdao.genericdao.service;

import com.example.genericdao.genericdao.model.Foo;

public interface IFooService {
    Foo retrieveByName(String name);
}

