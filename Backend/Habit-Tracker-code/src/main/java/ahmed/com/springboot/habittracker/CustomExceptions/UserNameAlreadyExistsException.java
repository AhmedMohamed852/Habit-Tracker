package ahmed.com.springboot.habittracker.CustomExceptions;

public class UserNameAlreadyExistsException extends RuntimeException {


    public UserNameAlreadyExistsException() {
        super("UserName.already.exists");
    }
}
