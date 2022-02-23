package com.somosBooking.somosBack.users;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/usuarios/")
public class UserController {

private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUser(){
        return userService.getUsers();
    }

    @GetMapping(path = "{userName}-{userPassword}")
    public User login(@PathVariable("userName") String userName, @PathVariable("userPassword") String userPassword){
       return userService.login(userName, userPassword);
    }

    @PostMapping(path  = "{id}-{userName}-{userType}-{userMail}-{phone}-{password}")
    public void registerUser(@PathVariable("id") int id,
                             @PathVariable("userName") String userName,
                             @PathVariable("userType") Usertype userType,
                             @PathVariable("userMail") String userMail,
                             @PathVariable("phone") String phone,
                             @PathVariable("password") String password
                             ){
        userService.register(id, userName, userType, userMail, phone, password);

    }
}

