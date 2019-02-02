package service.dao.impl;

import domain.User;
import service.dao.DAO;

import java.util.ArrayList;
import java.util.List;

public class UserDAO implements DAO<User> {
    private List<User> users = new ArrayList<User>();//joaca rolul bazei de date

    public void save(User user) {
        users.add(user);
    }

    public User get(int i) {
        return users.get(i);
    }

    @Override
    public String toString() {
        return "UserDAO{" +
                "users=" + users +
                '}';
    }

    public UserDAO() {
        users.add(new User("Alin","ast@yahoo.com"));
        users.add(new User("Alin","ast@yahoo.com"));
        users.add(new User("Alin","ast@yahoo.com"));
        users.add(new User("Alin","ast@yahoo.com"));
    }

    public List<User> getAll() {
        return users;
    }

    public void update(User user, String[] params) {
        String name = params[0];
        String email = params[1];
        user.setName(name);
        user.setEmail(email);
    }

    public void delete(User user) {

    }
}
