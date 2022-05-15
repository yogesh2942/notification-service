package com.trp.io.maveric.notification.controller;

import com.trp.io.maveric.notification.entity.ApplicationEvent;
import com.trp.io.maveric.notification.repository.ApplicationEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notification")
public class NotificationController {

    @Autowired
    private ApplicationEventRepository repository;

    @PostMapping("/savePerson")
    public ApplicationEvent saveApplicationEvent(@RequestBody ApplicationEvent applicationEvent) {
        return repository.addApplicationEvent(applicationEvent);
    }

    @GetMapping("/test")
    public String testApplication()
    {
        return "UP";
    }
}
