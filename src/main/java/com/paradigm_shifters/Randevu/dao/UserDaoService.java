package com.paradigm_shifters.Randevu.dao;

import com.paradigm_shifters.Randevu.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();
    private static int usersCount = 3;

    //static block
    static {
        users.add(new User(1, "Dany", new Date()));
        users.add(new User(2, "Eve", new Date()));
        users.add(new User(3, "John", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        if(user.getId() == null)
            user.setId(++usersCount);
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        for (User user:users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
