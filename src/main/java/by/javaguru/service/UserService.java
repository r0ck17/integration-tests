package by.javaguru.service;

import by.javaguru.dto.CreateUserDto;
import by.javaguru.entity.User;
import by.javaguru.exception.UserNotCreatedException;
import by.javaguru.mapper.UserMapper;
import by.javaguru.repository.UserRepository;
import by.javaguru.validator.UserValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserValidator validator;
    private final UserMapper mapper;

    public User save(CreateUserDto userDto) {
        if (validator.isValid(userDto)) {
            User user = mapper.toModel(userDto);
            return userRepository.save(user);
        } else {
            throw new UserNotCreatedException("User not saved");
        }
    }
}
