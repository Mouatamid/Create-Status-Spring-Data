package org.mouatamid.createstatus.controllers;

import org.mouatamid.createstatus.models.Status;
import org.mouatamid.createstatus.models.User;
import org.mouatamid.createstatus.services.StatusManipulationService;
import org.mouatamid.createstatus.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/status")
public class StatusManipulationController {
    @Autowired
    StatusManipulationService statusManipulationService;
    @Autowired
    UserService userService;

    @PostMapping
    public @ResponseBody
    String createStatus(@RequestParam String title,
                        @RequestParam String content,
                        @RequestParam String username){
        User user = userService.findUserByUsername(username);
        Status status = new Status(title,content,user);
        return statusManipulationService.createStatus(status) ? status.toString() : "Cannot create status !";
    }
}
