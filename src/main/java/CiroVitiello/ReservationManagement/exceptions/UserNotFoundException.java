package CiroVitiello.ReservationManagement.exceptions;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(long id){
        super("User " + id + "not found!");
    }
}
