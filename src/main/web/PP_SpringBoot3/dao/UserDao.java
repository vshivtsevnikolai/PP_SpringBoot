package PP_SpringBoot3.dao;

import PP_SpringBoot3.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    User getUserById(Long id);

    void addUser(User user);

    void removeUser(Long id);

    void editUser(User user);
}
