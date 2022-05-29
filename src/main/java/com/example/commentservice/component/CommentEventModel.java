package com.example.commentservice.component;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.index.Indexed;

import javax.persistence.Id;
import javax.persistence.Version;
import java.time.ZonedDateTime;
import java.util.Date;

@Data
public class CommentEventModel {
    private String id;
    private String message;
    private String tweetid;
    private Date created;
}
