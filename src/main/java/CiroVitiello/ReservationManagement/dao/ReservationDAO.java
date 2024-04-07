package CiroVitiello.ReservationManagement.dao;

import CiroVitiello.ReservationManagement.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationDAO extends JpaRepository<Reservation, Long> {
}
