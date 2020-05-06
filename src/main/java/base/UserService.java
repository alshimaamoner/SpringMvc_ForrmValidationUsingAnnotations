package base;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component
public class UserService {

    private User user;
    private int id;

    public void print(){
        System.out.println("user name :"+user.getName());
    }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public User getUser(Integer id) {
         if(user.getId()==id)
             return user;
         else
             return null;
    }
}