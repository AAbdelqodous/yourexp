package kw.yourexp.fixit_api.auth;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@Builder
public class RegistrationRequest {
    @NotEmpty(message = "First name can not be empty")
    @NotBlank(message = "First name can not be blank")
    private String firstname;
    @NotEmpty(message = "Last name can not be empty")
    @NotBlank(message = "Last name can not be blank")
    private String lastname;
    @Email(message = "Email is not well formatted")
    @NotEmpty(message = "Email can not be empty")
    @NotBlank(message = "Email can not be blank")
    private String email;
    @NotEmpty(message = "Password can not be empty")
    @NotBlank(message = "Password can not be blank")
    @Size(min = 8, message = "Password must at least be 8 characters")
    private String password;
}
