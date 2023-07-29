package PP_SpringBoot3.service;

import PP_SpringBoot3.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long id);

    void addUser(User user);

    void removeUser(Long id);

    void editUser(User user);
}
