package service;

import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.UserRepo;

@Service
public class UserServ {
    @Autowired
    private UserRepo userRepo;

    public boolean addUser(User user) {
        User userFromDbByName = userRepo.findByName(user.getUser_name());
        User userFromDbByPhone = userRepo.findByPhone(user.getUser_phone().toString());

        if (userFromDbByName != null) {
            if (userFromDbByPhone != null) {
                return false;
            }
        }

//        user.setActive(true);
//        user.setRoles(Collections.singleton(Role.USER));
//        user.setActivationCode(UUID.randomUUID().toString());
//        user.setPassword(passwordEncoder.encode(user.getPassword()));

        userRepo.save(user);

        return true;
    }

}
