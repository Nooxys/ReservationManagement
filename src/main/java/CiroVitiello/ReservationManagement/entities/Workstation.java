package CiroVitiello.ReservationManagement.entities;

import CiroVitiello.ReservationManagement.enums.WorkstationType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Workstation {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private long id;

    private String description;
    @Enumerated(EnumType.STRING)
    private WorkstationType workstationType;
    private int occupants;
    private CompanyBuilding companyBuilding;

    public Workstation(String description, WorkstationType workstationType, int occupants, CompanyBuilding companyBuilding) {
        this.description = description;
        this.workstationType = workstationType;
        this.occupants = occupants;
        this.companyBuilding = companyBuilding;
    }
}
