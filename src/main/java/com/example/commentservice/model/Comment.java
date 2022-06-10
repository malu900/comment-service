package com.example.commentservice.model;


import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Date;

@Document
@Data
//@JsonSerialize
public class Comment {

    @Id private String id;
    private String message;
    private String tweetid;
    private String userId;
    @Indexed
    @CreatedDate private Date created = new Date();

    public Comment(String message) {
        this.message = message;
    }
    public Comment() {}
}
