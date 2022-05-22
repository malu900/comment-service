package com.example.commentservice.model;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
//import org.hibernate.annotations.CreationTimestamp;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;
//import java.util.Date;

@Document
@Data
//@JsonSerialize
public class Comment {

    @Version private Long version;
    @Id private String id;
    private String message;
    private Long tweetid;
    @Indexed @CreatedDate private Date created = new Date();

    public Comment(String message) {
        this.message = message;
    }
    public Comment() {}
}
//@Entity
//@Data
//public class Comment {
//    @Id
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
//    private Long id;
//    private String comment;
//    private Long tweetId;
//    @CreationTimestamp
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date created;
//}
