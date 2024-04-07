package CiroVitiello.ReservationManagement.dao;

import CiroVitiello.ReservationManagement.entities.Workstation;
import CiroVitiello.ReservationManagement.enums.WorkstationType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkstationDAO extends JpaRepository<Workstation, Long> {

    @Query("SELECT w FROM Workstation w WHERE w.workstationType = :workstationType AND w.companyBuilding.city = :city")
    List<Workstation> filterWorkstationByTypeAndCity(WorkstationType workstationType, String city);


}
