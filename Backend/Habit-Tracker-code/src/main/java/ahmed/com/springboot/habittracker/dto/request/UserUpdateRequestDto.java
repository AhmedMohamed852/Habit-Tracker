package ahmed.com.springboot.habittracker.dto.request;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserUpdateRequestDto {

    private Long id;
    private String fullName;

    private String userName;

    private String profilePicture;

    private String country;
}
