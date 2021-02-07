package controllers;

import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import repo.UserRepo;
import service.UserServ;

import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
   // UserServ userServ=new UserServ();
    @Autowired
    UserRepo userRepo;

    @PostMapping("addUser")
    public String addUser(@RequestParam String name,
                          @RequestParam String password,
                          @RequestParam String phone,
                           @RequestParam Map<String, Object> model) {

        userRepo.save(new User(name,password,phone));

        Iterable<User>users=userRepo.findAll();
        model.put("users",users);

        return "main";
    }

}
