package by.javaguru.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateUserDto {
    
    private String email;
    private String name;
}
