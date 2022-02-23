package com.somosBooking.somosBack.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {

    ArrayList<User> userList = new ArrayList<User>();


    public UserService() {

        userList.add(new User(
                0,
                "Ruravi",
                Usertype.Adiministrator,
                "Joseruravi@hotmail.com",
                "3310611788",
                "ruravi1234"
        ));

        userList.add(new User(
                1,
                "Juan",
                Usertype.Band,
                "juan@hotmail.com",
                "33106765788",
                "juan123"
        ));

        userList.add(new User(
                2,
                "Pedro",
                Usertype.Normal,
                "pedro@hotmail.com",
                "3356741788",
                "pedro123"
        ));

    }

    List<User> getUsers(){
        return userList;
    }

    public User login(String userName, String userPassword) {

        for(User user : userList){
            if(Objects.equals(user.userName, userName) && Objects.equals(user.password, userPassword)){
                return user;
            }


        }

        return null;
    }

    public void register(User user){
        userList.add(user);
    }
}
