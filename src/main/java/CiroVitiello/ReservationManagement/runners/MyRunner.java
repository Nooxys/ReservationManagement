package CiroVitiello.ReservationManagement.runners;

import CiroVitiello.ReservationManagement.ReservationManagementApplication;
import CiroVitiello.ReservationManagement.dao.CompanyBuildingService;
import CiroVitiello.ReservationManagement.dao.ReservationService;
import CiroVitiello.ReservationManagement.dao.UserService;
import CiroVitiello.ReservationManagement.dao.WorkstationService;
import CiroVitiello.ReservationManagement.entities.CompanyBuilding;
import CiroVitiello.ReservationManagement.entities.Reservation;
import CiroVitiello.ReservationManagement.entities.User;
import CiroVitiello.ReservationManagement.entities.Workstation;
import CiroVitiello.ReservationManagement.enums.WorkstationType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    private CompanyBuildingService cbs;
    @Autowired
    private WorkstationService wss;
    @Autowired
    private UserService us;
    @Autowired
    private ReservationService rs;


    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ReservationManagementApplication.class);

        // SAVE USERS

        User user1 = (User) ctx.getBean("marco");
        User user2 = (User) ctx.getBean("giovanni");
        User user3 = (User) ctx.getBean("ciro");
        User user4 = (User) ctx.getBean("venissa");
        User user5 = (User) ctx.getBean("manfredi");
//        us.save(user1);
//        us.save(user2);
//        us.save(user3);
//        us.save(user4);
//        us.save(user5);

        // SAVE COMPANY BUILDING

        CompanyBuilding cb1 = (CompanyBuilding) ctx.getBean("tecnocasa");
        CompanyBuilding cb2 = (CompanyBuilding) ctx.getBean("hightech");
        CompanyBuilding cb3 = (CompanyBuilding) ctx.getBean("futuredevs");
        CompanyBuilding cb4 = (CompanyBuilding) ctx.getBean("lowtech");
        CompanyBuilding cb5 = (CompanyBuilding) ctx.getBean("endingpoint");
//        cbs.save(cb1);
//        cbs.save(cb2);
//        cbs.save(cb3);
//        cbs.save(cb4);
//        cbs.save(cb5);


        // SAVE WORKSTATIONS

        List<Workstation> workstationList = (List<Workstation>) ctx.getBean("workstationList");
//        workstationList.forEach(workstation -> wss.save(workstation));

        // SAVE RESERVATIONS

//        for (int i = 0; i <25 ; i++) {
//            Random random = new Random();
//            try {
//                rs.save(new Reservation(LocalDate.of(2024,4, random.nextInt(1,31)), us.findById(random.nextInt(1,6)), wss.findById(random.nextInt(1,10)) ));
//            } catch (RuntimeException ex) {
//                System.out.println(ex.getMessage());
//            }
//
//        }

        // FILTER BY WORKSTATION TYPE AND CITY
        wss.filterWorkstationByTypeAndCity(WorkstationType.OPENSPACE, "Rimini").forEach(System.out::println);
    }
}
