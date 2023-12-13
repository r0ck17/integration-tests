package by.javaguru.integration.service;

import by.javaguru.annotation.IT;
import by.javaguru.dto.CreateUserDto;
import by.javaguru.entity.User;
import by.javaguru.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.TestConstructor;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@IT
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
public class UserServiceIT {

    @Autowired
    private UserService userService;

    @Test
    void saveUser() {
        CreateUserDto userDto = CreateUserDto.builder()
                .name("ivan")
                .email("ivan@mail.ru")
                .build();

        User savedUser = userService.save(userDto);

        assertNotNull(savedUser);
        assertNotNull(savedUser.getId());
    }
}
