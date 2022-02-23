package com.somosBooking.somosBack.users;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;


@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
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
/*
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
    */


    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public void registerUser(@RequestBody User user){
        userService.register(user);
    }
}

