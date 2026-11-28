package ahmed.com.springboot.habittracker.mapper;


import ahmed.com.springboot.habittracker.dto.request.UserDtoRequest;
import ahmed.com.springboot.habittracker.dto.request.UserUpdateRequestDto;
import ahmed.com.springboot.habittracker.dto.response.UserDtoResponse;
import ahmed.com.springboot.habittracker.model.entity.User;
import org.mapstruct.*;


@Mapper(componentModel = "spring" , unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {


    @Mapping(target = "password", ignore = true)
    User toEntity (UserDtoRequest userDtoRequest);

    UserDtoResponse toDto (User user);


    @BeanMapping(
            nullValuePropertyMappingStrategy =
                    NullValuePropertyMappingStrategy.IGNORE
    )
    void updateEntity(
            UserUpdateRequestDto request,
            @MappingTarget User user
    );
}
