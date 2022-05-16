package com.trp.io.maveric.notification.controller;

import com.trp.io.maveric.notification.entity.VendorEvent;
import com.trp.io.maveric.notification.service.NotificationEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notification")
public class NotificationController {

    @Autowired
    private NotificationEventService service;

    @PostMapping("/savePerson")
    public VendorEvent saveApplicationEvent(@RequestBody VendorEvent vendorEvent) {
        return service.addApplicationEvent(vendorEvent);
    }

    @GetMapping("/test")
    public String testApplication()
    {
        return "Status is UP";
    }
}
