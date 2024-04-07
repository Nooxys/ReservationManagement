package CiroVitiello.ReservationManagement.runners;

import CiroVitiello.ReservationManagement.ReservationManagementApplication;
import CiroVitiello.ReservationManagement.dao.CompanyBuildingService;
import CiroVitiello.ReservationManagement.dao.ReservationService;
import CiroVitiello.ReservationManagement.dao.UserService;
import CiroVitiello.ReservationManagement.dao.WorkstationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

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

    }
}
