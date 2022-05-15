package com.trp.io.maveric.notification.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "application_event")
public class ApplicationEvent {

    @DynamoDBHashKey(attributeName = "applicationEventId")
    private String id;
    @DynamoDBAttribute
    private VendorEvent vendorEventJson;
    @DynamoDBAttribute
    private String vendorEventTimeStamp;
    @DynamoDBAttribute
    private VendorEvent eventDispatchJson;
    @DynamoDBAttribute
    private String eventDispatchTimeStamp;
    @DynamoDBAttribute
    private Integer retry;
}
