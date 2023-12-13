package by.javaguru.validator;

import by.javaguru.dto.CreateUserDto;
import org.springframework.stereotype.Component;

@Component
public class UserValidator implements Validator<CreateUserDto> {

    @Override
    public boolean isValid(CreateUserDto user) {
        // Упрощенный вариант
        if (user.getEmail() == null || user.getName() == null) {
            return false;
        }

        return true;
    }
}
