package com.lilawat.WebSocket.user;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter  // lombok annotations to generate getters for the fields
@Setter // lombok annotations to generate getters and setters for the fields
@Document  // this annotation is used to mark the class as a document in the mongo database
public class User {
    @Id //this annotation is used to mark the field as the primary key in the mongo database
    private String Nick_Name;
    private String Full_Name;
    private Status status;

}
