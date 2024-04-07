package CiroVitiello.ReservationManagement.dao;

import CiroVitiello.ReservationManagement.entities.CompanyBuilding;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyBuildingDAO extends JpaRepository<CompanyBuilding,Long> {

    boolean existsByNameAndCity(String name, String city);
}
