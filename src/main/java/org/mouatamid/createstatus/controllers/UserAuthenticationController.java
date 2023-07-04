package org.mouatamid.createstatus.controllers;

import org.mouatamid.createstatus.models.User;
import org.mouatamid.createstatus.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user")
public class UserAuthenticationController {
    @Autowired
    UserService userService;

    //Create account
    @PostMapping
    public @ResponseBody
    HttpStatus addNewUser(@RequestParam String username,
                          @RequestParam String email,
                          @RequestParam String firstName,
                          @RequestParam String lastName,
                          @RequestParam String password){

        User userToBeAdd = new User(username,email,firstName,lastName,password);
        return userService.createUser(userToBeAdd) ? HttpStatus.CREATED: HttpStatus.EXPECTATION_FAILED;
    }
    //Login
    @GetMapping
    public @ResponseBody String loginUser(@RequestParam String username, @RequestParam String password){
        return userService.loginUser(username, password) ? "Login successfully!" : "Login failed!";
    }
}
