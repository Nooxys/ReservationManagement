package CiroVitiello.ReservationManagement.entities;

import CiroVitiello.ReservationManagement.enums.WorkstationType;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Workstation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;

    private String description;
    @Enumerated(EnumType.STRING)
    private WorkstationType workstationType;
    private int maxOccupants;
    @ManyToOne
    @JoinColumn(name = "building_id")
    private CompanyBuilding companyBuilding;
    @OneToMany(mappedBy = "workstation")
    private List<Reservation> reservationList;

    public Workstation(String description, WorkstationType workstationType, int maxOccupants, CompanyBuilding companyBuilding) {
        this.description = description;
        this.workstationType = workstationType;
        this.maxOccupants = maxOccupants;
        this.companyBuilding = companyBuilding;
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", workstationType=" + workstationType +
                ", occupants=" + maxOccupants +
                ", companyBuilding=" + companyBuilding +
                '}';
    }
}
