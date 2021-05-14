package com.example.genericdao.genericdao;

public class Key {
    String key;

    Key(String key)
    {
        this.key = key;
    }

    @Override
    public int hashCode()
    {
        return key.charAt(0);
    }

    @Override
    public boolean equals(Object obj)
    {
        return key.equals(obj);
    }
}
