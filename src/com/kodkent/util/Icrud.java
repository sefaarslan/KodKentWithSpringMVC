package com.kodkent.util;

import java.util.List;


public interface Icrud<T> {


	public boolean save(T t);
    public boolean delete(T t);
    public List<T> list(T t);   
    public T find(int id, T t);
    public List<T> search(String column,String value,T t);
    public List<T> search(T t);
}
