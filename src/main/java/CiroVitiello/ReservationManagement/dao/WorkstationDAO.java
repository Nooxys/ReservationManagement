package CiroVitiello.ReservationManagement.dao;

import CiroVitiello.ReservationManagement.entities.Workstation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkstationDAO extends JpaRepository<Workstation, Long> {
}
