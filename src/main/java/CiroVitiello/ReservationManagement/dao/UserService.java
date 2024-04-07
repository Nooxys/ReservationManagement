package CiroVitiello.ReservationManagement.dao;


import CiroVitiello.ReservationManagement.entities.User;
import CiroVitiello.ReservationManagement.exceptions.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;


    public User findById(long userID){
        return userDAO.findById(userID).orElseThrow(() -> new UserNotFoundException(userID));
    }

    public void findByIdAndUpdate(long UserId, User updated){
        User found = this.findById(UserId);
        found.setCompleteName(updated.getCompleteName());
        found.setEmail(updated.getEmail());
        found.setUsername(updated.getUsername());
        userDAO.save(found);
        System.out.println("User " + UserId + "updated!");
    }

    public void findByIdAndDelete(long userId){
        User found = this.findById(userId);
        userDAO.delete(found);
        System.out.println(" User " + userId + "deleted!");
    }
}
