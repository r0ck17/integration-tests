package by.javaguru.mapper;

import by.javaguru.dto.CreateUserDto;
import by.javaguru.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements Mapper<User, CreateUserDto> {

    @Override
    public CreateUserDto toDto(User user) {
        return CreateUserDto.builder()
                .email(user.getEmail())
                .name(user.getName())
                .build();
    }

    @Override
    public User toModel(CreateUserDto dto) {
        return User.builder()
                .email(dto.getEmail())
                .name(dto.getName())
                .build();
    }
}
