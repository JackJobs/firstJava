package api.mengkang.net.model;

import api.mengkang.net.dao.UserDao;
import api.mengkang.net.entity.User;

public class UserModel {

    public static User getUserInfoById(int id) {
        return UserDao.getById(id);
    }

    public static int insertUser(int age, int sex, String username) {
        return UserDao.add(new User(0, age, sex, username));
    }
}
