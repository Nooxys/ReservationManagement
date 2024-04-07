package CiroVitiello.ReservationManagement.entities;


import CiroVitiello.ReservationManagement.dao.CompanyBuildingService;
import CiroVitiello.ReservationManagement.enums.WorkstationType;
import org.hibernate.jdbc.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("application.properties")
public class AppConfig {

    @Autowired
    private CompanyBuildingService cbs;

    // USER BEANS

    @Bean(name = "marco")
    public User getUser1(){
        return  new User("Marco95", "Marco Bianchi", "marco.bianchi95@gmail.com");
    }

    @Bean(name = "giovanni")
    public User getUser2(){
        return  new User("GiovanniSuper", "Giovanni Verdi", "super.giovanni@gmail.com");
    }

    @Bean(name = "ciro")
    public User getUser3(){
        return  new User("Noxys", "Ciro Vitiello", "Notmyrealemail@gmail.com");
    }

    @Bean(name = "venissa")
    public User getUser4(){
        return  new User("shibaInu2000", "Venissa Gobbi", "theRealSuzu@gmail.com");
    }

    @Bean(name = "manfredi")
    public User getUser5(){
        return  new User("manfredi.montemaggi", "Manfredi Montemaggi", "manfre_montemaggi@gmail.com");
    }

    // COMPANY BUILDING BEANS

    @Bean(name = "tecnocasa")
    public CompanyBuilding getCBuilding1(){
        return new CompanyBuilding("Tecnocasa", "via Garibaldi","Rimini");
    }

    @Bean(name = "hightech")
    public CompanyBuilding getCBuilding2(){
        return new CompanyBuilding("HighTech", "via Genova","Milano");
    }

    @Bean(name = "futuredevs")
    public CompanyBuilding getCBuilding3(){
        return new CompanyBuilding("FutureDevs", "via Santa Giustina","Trento");
    }

    @Bean(name = "lowtech")
    public CompanyBuilding getCBuilding4(){
        return new CompanyBuilding("LowTech", "via Fantasia","Venezia");
    }

    @Bean(name = "endingpoint")
    public CompanyBuilding getCBuilding5(){
        return new CompanyBuilding("EndingPoint", "via Maggiore ","Napoli");
    }

    // WORKSTATION BEANS

    @Bean
    public Workstation getWorkstation1(){
        return new Workstation("try1", WorkstationType.OPENSPACE,50, cbs.findById(1));
    }

    @Bean
    public Workstation getWorkstation2(){
        return new Workstation("try2", WorkstationType.MEETING_ROOM,10, cbs.findById(1));
    }

    @Bean
    public Workstation getWorkstation3(){
        return new Workstation("try3", WorkstationType.PRIVATE,10, cbs.findById(2));
    }

    @Bean
    public Workstation getWorkstation4(){
        return new Workstation("try4", WorkstationType.OPENSPACE,100, cbs.findById(3));
    }

    @Bean
    public Workstation getWorkstation5(){
        return new Workstation("try5", WorkstationType.PRIVATE,10, cbs.findById(4));
    }

    @Bean
    public Workstation getWorkstation6(){
        return new Workstation("try6", WorkstationType.OPENSPACE,150, cbs.findById(4));
    }

    @Bean
    public Workstation getWorkstation7(){
        return new Workstation("try7", WorkstationType.MEETING_ROOM,50, cbs.findById(5));
    }

    @Bean
    public Workstation getWorkstation8(){
        return new Workstation("try8", WorkstationType.PRIVATE,6, cbs.findById(3));
    }

    @Bean
    public Workstation getWorkstation9(){
        return new Workstation("try9", WorkstationType.MEETING_ROOM,25, cbs.findById(5));
    }

    @Bean(name = "workstationList")
    List<Workstation> getWorkstationList(){
        List<Workstation> workstationList = new ArrayList<>();
        workstationList.add(getWorkstation1());
        workstationList.add(getWorkstation2());
        workstationList.add(getWorkstation3());
        workstationList.add(getWorkstation4());
        workstationList.add(getWorkstation5());
        workstationList.add(getWorkstation6());
        workstationList.add(getWorkstation7());
        workstationList.add(getWorkstation8());
        workstationList.add(getWorkstation9());
        return  workstationList;
    }

}
