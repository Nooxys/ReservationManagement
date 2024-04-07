package CiroVitiello.ReservationManagement.exceptions;

public class WorkstationNotFound extends  RuntimeException {
    public WorkstationNotFound(long id){
        super("the workstation " + id + "was not found!");
    }
}
