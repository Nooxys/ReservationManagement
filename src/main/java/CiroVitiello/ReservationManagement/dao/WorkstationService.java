package CiroVitiello.ReservationManagement.dao;

import CiroVitiello.ReservationManagement.entities.User;
import CiroVitiello.ReservationManagement.entities.Workstation;
import CiroVitiello.ReservationManagement.enums.WorkstationType;
import CiroVitiello.ReservationManagement.exceptions.UserNotFoundException;
import CiroVitiello.ReservationManagement.exceptions.WorkstationNotFound;
import org.hibernate.jdbc.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkstationService {
    @Autowired
    private WorkstationDAO workstationDAO;

    public void save(Workstation workstation){
        workstationDAO.save(workstation);
        System.out.println("Workstation saved!");
    }

    public Workstation findById(long workID){
        return workstationDAO.findById(workID).orElseThrow(() -> new WorkstationNotFound(workID));
    }

    public void findByIdAndUpdate(long workId, Workstation updated){
        Workstation found = this.findById(workId);
        found.setMaxOccupants(updated.getMaxOccupants());
        found.setDescription(updated.getDescription());
        found.setCompanyBuilding(updated.getCompanyBuilding());
        found.setWorkstationType(updated.getWorkstationType());
        workstationDAO.save(found);
        System.out.println("Workstation " + workId + "updated!");
    }

    public void findByIdAndDelete(long workID){
        Workstation found = this.findById(workID);
        workstationDAO.delete(found);
        System.out.println(" User " + workID + "deleted!");
    }

    public List<Workstation> filterWorkstationByTypeAndCity(WorkstationType workstation, String city){
        return workstationDAO.filterWorkstationByTypeAndCity(workstation, city);
    }
}
