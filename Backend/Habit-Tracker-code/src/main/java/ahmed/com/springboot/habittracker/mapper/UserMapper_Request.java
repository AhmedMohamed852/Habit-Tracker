package ahmed.com.springboot.habittracker.mapper;


import ahmed.com.springboot.habittracker.dto.request.UserDtoRequest;
import ahmed.com.springboot.habittracker.dto.response.UserDtoResponse;
import ahmed.com.springboot.habittracker.model.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel = "spring" , unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper_Request {


    @Mapping(target = "password", ignore = true)
    User To_userReq_Entity (UserDtoRequest userDtoRequest);

    UserDtoResponse To_usrDtoRes (User user);
}
