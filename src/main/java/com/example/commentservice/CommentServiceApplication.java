package com.example.commentservice;

import com.example.commentservice.model.Comment;
import com.example.commentservice.repository.CommentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableMongoAuditing
public class CommentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommentServiceApplication.class, args);
    }
//
    @Bean
    CommandLineRunner runner(CommentRepository repository, MongoTemplate mongoTemplate) {
        return args -> {
          Comment comment = new Comment("description");

//            Query query = new Query();
//            query.addCriteria(Criteria.where("message").exists(true));
//            List<Comment> commentList = mongoTemplate.find(query, Comment.class);
//            if(commentList.size() > 1) {
//                System.out.println("TRUEEEEE");
//            }

          repository.insert(comment);
        };


    }
//    @Autowired
//    private DiscoveryClient discoveryClient;

}
