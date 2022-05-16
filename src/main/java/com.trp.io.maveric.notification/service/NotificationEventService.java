package com.trp.io.maveric.notification.service;

import com.trp.io.maveric.notification.entity.ApplicationEvent;
import com.trp.io.maveric.notification.entity.VendorEvent;
import com.trp.io.maveric.notification.repository.ApplicationEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationEventService {

    @Autowired
    private ApplicationEventRepository repository;

    public VendorEvent addApplicationEvent(VendorEvent vendorEvent) {
        repository.addApplicationEvent(convertVendorEventToApplicationEvent(vendorEvent));
        return vendorEvent;
    }

    private ApplicationEvent convertVendorEventToApplicationEvent(VendorEvent vendorEvent)
    {
        ApplicationEvent applicationEvent = new ApplicationEvent();
        applicationEvent.setVendorEventJson(vendorEvent);
        applicationEvent.setVendorEventTimeStamp(System.currentTimeMillis());
        applicationEvent.setEventDispatchJson(vendorEvent);
        applicationEvent.setEventDispatchTimeStamp(System.currentTimeMillis());
        return applicationEvent;
    }
}
