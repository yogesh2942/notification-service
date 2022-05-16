package com.trp.io.maveric.notification.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@DynamoDBDocument
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VendorEvent implements Serializable {

    @DynamoDBAttribute
    private String id;
    @DynamoDBAttribute
    private String entity;
    @DynamoDBAttribute
    private String subEntity;
    @DynamoDBAttribute
    private String loadType;
}
