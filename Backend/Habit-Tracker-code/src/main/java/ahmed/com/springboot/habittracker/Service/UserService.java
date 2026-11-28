package ahmed.com.springboot.habittracker.Service;

import ahmed.com.springboot.habittracker.dto.request.UserDtoRequest;
import ahmed.com.springboot.habittracker.dto.request.UserUpdateRequestDto;
import ahmed.com.springboot.habittracker.dto.response.UserDtoResponse;

public interface UserService {

    void creatUser(UserDtoRequest userDtoRequest);

    void updateUser(UserUpdateRequestDto userDtoRequest);


    void deleteUserBy_Id(Long  id);


    UserDtoResponse getUserBy_id(Long id);


}
