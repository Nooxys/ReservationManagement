package CiroVitiello.ReservationManagement.exceptions;

public class ReservationNotFoundException extends RuntimeException {
    public ReservationNotFoundException(long id){
        super("the reservation " + id + "was not found!");
    }
}
