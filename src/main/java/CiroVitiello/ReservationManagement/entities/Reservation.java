package CiroVitiello.ReservationManagement.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private long id;
    private User user;
    private Workstation workstation;
    private LocalDate Date;

    public Reservation(LocalDate date, User user, Workstation workstation) {
        Date = date;
        this.user = user;
        this.workstation = workstation;
    }
}
