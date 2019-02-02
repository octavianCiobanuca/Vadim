package domain;

import service.dao.DAO;
import service.dao.impl.UserDAO;

import java.util.List;

public class UserApplication {
    private static DAO userDao;
    public static void main(String[] args) {
        userDao = new UserDAO();
        List<User> users = userDao.getAll();
        for(User user : users){
            System.out.println(user.toString());
        }
    }
}
