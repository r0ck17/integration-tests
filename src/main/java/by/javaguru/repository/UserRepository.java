package by.javaguru.repository;

import by.javaguru.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    // Заглушка по ТЗ
    public User save(User user) {
        Long randomId = (long) (Math.random() * 100);
        user.setId(randomId);
        return user;
    }
}
