package service.dao;

import domain.User;

import java.util.List;

public interface DAO<T> {
    public void save(T t);
    public User get(int n);
    public List<T> getAll();
    public void update(T t, String[] params);
    public void delete(T t);
}
