package org.mouatamid.createstatus.controllers;

import org.mouatamid.createstatus.models.Status;
import org.mouatamid.createstatus.models.User;
import org.mouatamid.createstatus.services.StatusManipulationService;
import org.mouatamid.createstatus.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    @PutMapping
    public @ResponseBody String updateStatus(@RequestParam Integer id, @RequestParam String content){
        Status status = statusManipulationService.findStatus(id);
        if (status != null){
            status.setContent(content);
            statusManipulationService.updateStatus(status);
            return status.toString();
        }
        else {
            return "Couldn't update the status !";
        }
    }
    @DeleteMapping
    public @ResponseBody
    HttpStatus deleteStatus(@RequestParam Integer id){
        Status statusToBeDeleted = statusManipulationService.findStatus(id);
        Boolean result = statusManipulationService.deleteStatus(statusToBeDeleted);
        return result ? HttpStatus.OK : HttpStatus.NOT_FOUND;
    }
}
