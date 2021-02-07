package repo;

import models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
    User findByName(String userFullName);

    User findByPhone(String phone);
}
