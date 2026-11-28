package ahmed.com.springboot.habittracker.Service.Service_Impl;

import ahmed.com.springboot.habittracker.CustomExceptions.EmailAlreadyExistsException;
import ahmed.com.springboot.habittracker.CustomExceptions.UserNameAlreadyExistsException;
import ahmed.com.springboot.habittracker.CustomExceptions.UserNotFoundException;
import ahmed.com.springboot.habittracker.Service.UserService;
import ahmed.com.springboot.habittracker.dto.request.UserDtoRequest;
import ahmed.com.springboot.habittracker.dto.request.UserUpdateRequestDto;
import ahmed.com.springboot.habittracker.dto.response.UserDtoResponse;
import ahmed.com.springboot.habittracker.mapper.UserMapper;
import ahmed.com.springboot.habittracker.model.entity.User;
import ahmed.com.springboot.habittracker.repository.User_Repo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService_Impl implements UserService {




    //todo _________________ Constructor_Injection  __________________

    private final User_Repo userRepo;
    private final UserMapper userMapper;




    //todo ___________________ Creat_New_User  ________________________
    @Transactional
    @Override
    public void creatUser(UserDtoRequest userDtoRequest) {

        validateUserUniqueness(userDtoRequest);

        User user = userMapper.toEntity(userDtoRequest);
        user.setPassword(userDtoRequest.getPassword());

        userRepo.save(user);
    }


    //todo __________________ Update_User _____________________
    @Override
    @Transactional
    public void updateUser(UserUpdateRequestDto userDtoRequest) {
        User currentUser = userRepo.findById(userDtoRequest.getId()).orElseThrow(UserNotFoundException::new);

        validateUpdateUniqueness(userDtoRequest, currentUser);

        userMapper.updateEntity(userDtoRequest, currentUser);
    }


    //todo ______________ Delete_UserBy_Id _____________________
    @Override
    @Transactional
    public void deleteUserBy_Id(Long id) {
        userRepo.delete(userRepo.findById(id).orElseThrow(UserNotFoundException::new));
    }


    //todo ________________ Get_UserBy_Id __________________
    @Override
    @Transactional(readOnly = true)
    public UserDtoResponse getUserBy_id(Long id) {

        User user = userRepo.findById(id).orElseThrow(UserNotFoundException::new);
        return userMapper.toDto(user);
    }




    //todo ____________________________________________________
    //todo _________________ Validation _______________________
    //todo ____________________________________________________

    private void validateUserUniqueness(UserDtoRequest request) {

        if (userRepo.existsByEmail(request.getEmail())) {
            throw new EmailAlreadyExistsException();
        }

        if (userRepo.existsByUserName(request.getUserName())) {
            throw new UserNameAlreadyExistsException();
        }
    }


    private void validateUpdateUniqueness(
            UserUpdateRequestDto request, User currentUser) {

        if (request.getUserName() != null &&
                userRepo.existsByUserNameAndIdNot(
                        request.getUserName(), currentUser.getId())) {

            throw new UserNameAlreadyExistsException();
        }
    }




}
