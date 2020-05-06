package base;

import base.User;
import base.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
@Controller
@RequestMapping("/register.htm")
public class UserController {

    @Autowired
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method=RequestMethod.POST)
    public  String processSubmit(@Valid @ModelAttribute("user") User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "registform";
        }else {
            userService.setUser(user);
            return "userAdded";
        }


    }
    @InitBinder
    public void customizeBinding(WebDataBinder binder) {
        System.out.println("initbinder..............");
        binder.registerCustomEditor(Double.TYPE,"salary", new CustomFormat());
        // NumberFormat.registerDoubleFormat(binder);
    }

    @RequestMapping(method=RequestMethod.GET)
    public String createNewUser(Model model){
        System.out.println("GET .....");
        //Can not put ref to user because User automatic bind in form using "user" not others
        model.addAttribute(new User());
        return "registform";
    }

  //Display User
    @RequestMapping(value = "/getUser",method = RequestMethod.GET,params = "userId")
    public String displayUser(@RequestParam("userId") Integer id,Model data){
        User user=userService.getUser(id);
        data.addAttribute("users",user);
        return "displayAll";
    }




}