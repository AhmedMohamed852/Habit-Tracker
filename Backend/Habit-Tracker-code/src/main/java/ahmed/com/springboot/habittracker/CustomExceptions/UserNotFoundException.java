package ahmed.com.springboot.habittracker.CustomExceptions;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(){
        super("User.NotFound.Exception");
    }
}
