package com.trp.io.maveric.notification.repository;

import com.trp.io.maveric.notification.entity.ApplicationEvent;
import org.springframework.stereotype.Repository;

@Repository
public class ApplicationEventRepository {

    public void addApplicationEvent(ApplicationEvent applicationEvent) {
        //Save the Event in DynamoDB
        //mapper.save(applicationEvent);
    }

}
