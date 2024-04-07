package CiroVitiello.ReservationManagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private long id;

    private String username;
    private String completeName;
    private String email;
    @OneToMany(mappedBy = "user")
    private List<Reservation> reservationList;

    public User(String username, String completeName, String email) {
        this.username = username;
        this.completeName = completeName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", completeName='" + completeName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
