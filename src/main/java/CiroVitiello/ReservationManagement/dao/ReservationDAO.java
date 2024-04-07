package CiroVitiello.ReservationManagement.dao;

import CiroVitiello.ReservationManagement.entities.Reservation;
import CiroVitiello.ReservationManagement.entities.User;
import CiroVitiello.ReservationManagement.entities.Workstation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservationDAO extends JpaRepository<Reservation, Long> {

    boolean existsByDateAndWorkstation(LocalDate date, Workstation workstation);

    boolean existsByUserAndDate(User user, LocalDate date);

}
