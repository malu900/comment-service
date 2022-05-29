package com.example.commentservice.component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.index.Indexed;

import javax.persistence.Id;
import javax.persistence.Version;
import java.time.ZonedDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentEventModel {
    private String id;
    private String message;
    private String tweetid;
    private Date created;
}
