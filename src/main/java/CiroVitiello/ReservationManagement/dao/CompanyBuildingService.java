package CiroVitiello.ReservationManagement.dao;

import CiroVitiello.ReservationManagement.entities.CompanyBuilding;
import CiroVitiello.ReservationManagement.exceptions.CompanyBuildingNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyBuildingService {
    @Autowired
    private CompanyBuildingDAO cbd;

    public void save(CompanyBuilding building){
if (!cbd.existsByNameAndCity(building.getName(), building.getCity())){
    cbd.save(building);
    System.out.println("Building saved!");
}else {
    throw  new RuntimeException("this building exist already!");}
    }

    public CompanyBuilding findById(long companyID){
        return cbd.findById(companyID).orElseThrow(() -> new CompanyBuildingNotFoundException(companyID));
    }

    public void findByIdAndUpdate(long companyID, CompanyBuilding updated){
     CompanyBuilding found = this.findById(companyID);
     found.setAdress(updated.getAdress());
     found.setCity(updated.getCity());
     found.setName(updated.getName());
     cbd.save(found);
        System.out.println("Building " + companyID + "updated!");
    }

    public void findByIdAndDelete(long companyID){
        CompanyBuilding found = this.findById(companyID);
        cbd.delete(found);
        System.out.println("Bulding " + companyID + "deleted!");
    }
}
