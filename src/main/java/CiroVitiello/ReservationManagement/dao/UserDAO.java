package CiroVitiello.ReservationManagement.dao;

import CiroVitiello.ReservationManagement.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Long> {
    boolean existsByCompleteNameAndEmail(String name, String email);
}
