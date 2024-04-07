package CiroVitiello.ReservationManagement.exceptions;

public class CompanyBuildingNotFoundException extends  RuntimeException{
    public CompanyBuildingNotFoundException(long id){
        super("the building " + id + "was not found!");
    }
}
