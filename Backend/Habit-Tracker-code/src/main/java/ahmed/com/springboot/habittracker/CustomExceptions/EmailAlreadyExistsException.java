package ahmed.com.springboot.habittracker.CustomExceptions;

public class EmailAlreadyExistsException extends RuntimeException{

    public EmailAlreadyExistsException() {
        super("Email.already.exists");
    }
}
