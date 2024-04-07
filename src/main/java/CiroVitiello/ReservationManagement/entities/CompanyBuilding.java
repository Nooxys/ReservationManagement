package CiroVitiello.ReservationManagement.entities;

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
public class CompanyBuilding {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;

    private String name;
    private String adress;
    private String city;
    @OneToMany(mappedBy = "companyBuilding")
    private List<Workstation> workstations;

    public CompanyBuilding(String name, String adress, String city) {
        this.name = name;
        this.adress = adress;
        this.city = city;
    }

    @Override
    public String toString() {
        return "CompanyBuilding{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
