package CiroVitiello.ReservationManagement.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CompanyBuilding {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private long id;

    private String name;
    private String adress;
    private String city;

    public CompanyBuilding(String name, String adress, String city) {
        this.name = name;
        this.adress = adress;
        this.city = city;
    }
}
