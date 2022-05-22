package com.example.commentservice.model;


import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String comment;
    private Long tweetId;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
}
