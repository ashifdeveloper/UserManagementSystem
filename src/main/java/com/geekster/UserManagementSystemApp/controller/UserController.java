package com.geekster.UserManagementSystemApp.controller;

import com.geekster.UserManagementSystemApp.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
public class UserController {
    private List<User> userInfo;

    public UserController() {
        userInfo = new ArrayList<>();
    }


    @PostMapping("addUser")
    public String addUser(@RequestBody User user) {
        userInfo.add(user);
        return "user Added";
    }

    @GetMapping("getAllUser")
    public List<User> getAllUser() {
        return userInfo;
    }


    @GetMapping("getUser/{userId}")
    public List<User> getUser(@PathVariable Integer userId) {
        List<User> userIdInfo = new ArrayList<>();


        for (User info : userInfo) {

            if (info.getUserId().equals(userId)) {
                userIdInfo.add(info);


            }
        }
        return userIdInfo;

    }
    @PutMapping("updateUserInfo/{userId}")
    public String updateUserInfo(@PathVariable Integer userId, @RequestBody User updateUser) {
        for (User info : userInfo) {
            if (info.getUserId().equals(userId)) {
                info.setName(updateUser.getName());
                info.setUserName(updateUser.getUserName());
                info.setAddress(updateUser.getAddress());
                info.setPhoneNumber(updateUser.getPhoneNumber());
                return "User updated for UserId " + userId;
            }
        }
        return "User not found for userId: " + userId;
    }
    @DeleteMapping("deleteUser/{userId}")
    public String deleteUser(@PathVariable Integer userId){
        for(User user : userInfo){
            if(user.getUserId().equals(userId)){
                userInfo.remove(user);
                return "User deleted for userId" + userId;
            }
        }
        return "user:" + userId + "not deleted as it does not exist";
    }

    }


