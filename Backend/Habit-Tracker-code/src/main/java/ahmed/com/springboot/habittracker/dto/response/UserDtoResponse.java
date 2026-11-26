package ahmed.com.springboot.habittracker.dto.response;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDtoResponse {


    private String fullName;

    private String userName;

    private String profilePicture;

    private String country;


}
