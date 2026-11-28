package ahmed.com.springboot.habittracker.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDtoRequest {



    @NotBlank(message = "your.name.must.not.be.blank")
    private String fullName;

    @NotBlank(message = "your.userName.must.not.be.blank")
    private String userName;

    @NotBlank(message = "your.email.must.not.be.blank")
    @Email(message = "your.email.must.be.valid")
    private String email;

    @NotBlank(message = "your.password.must.not.be.blank")
    @Size(min = 8, message = "error.user.password.tooShort")
    private String password;


}