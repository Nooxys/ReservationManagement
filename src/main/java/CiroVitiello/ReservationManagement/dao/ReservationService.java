package CiroVitiello.ReservationManagement.dao;


import CiroVitiello.ReservationManagement.entities.Reservation;
import CiroVitiello.ReservationManagement.exceptions.ReservationNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    @Autowired
    private ReservationDAO reservationDAO;

    public void save(Reservation reservation) {
        if (!reservationDAO.existsByUserAndDate(reservation.getUser(), reservation.getDate()) &&
                !reservationDAO.existsByDateAndWorkstation(reservation.getDate(), reservation.getWorkstation())) {
            reservationDAO.save(reservation);
            System.out.println("Reservation saved!");
        } else {
            throw new RuntimeException("this Reservation exist already!");
        }
    }


    public Reservation findById(long resID) {
        return reservationDAO.findById(resID).orElseThrow(() -> new ReservationNotFoundException(resID));
    }

    public void findByIdAndUpdate(long resIdID, Reservation updated) {
        Reservation found = this.findById(resIdID);
        found.setDate(updated.getDate());
        found.setUser(updated.getUser());
        found.setWorkstation(updated.getWorkstation());
        reservationDAO.save(found);
        System.out.println("Reservation " + resIdID + "updated!");
    }

    public void findByIdAndDelete(long resID) {
        Reservation found = this.findById(resID);
        reservationDAO.delete(found);
        System.out.println(" Reservation " + resID + "deleted!");
    }
}
