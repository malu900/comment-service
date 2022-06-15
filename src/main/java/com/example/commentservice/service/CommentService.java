package com.example.commentservice.service;


import com.example.commentservice.component.CommentEventModel;
import com.example.commentservice.model.Comment;
import com.example.commentservice.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;
    private final MongoTemplate mongoTemplate;
    private final MongoOperations mongoOperations;
    private final KafkaTemplate<String, CommentEventModel> kafkaTemplate;

    public Comment createComment(Comment comment) {
        Comment newComment = mongoTemplate.save(comment, "comment");
        CommentEventModel commentEventModel = new CommentEventModel(newComment.getId(), newComment.getMessage(), newComment.getTweetid(), newComment.getCreated(), newComment.getUserId());
        kafkaTemplate.send("topicTwo", commentEventModel);
        return mongoTemplate.save(comment, "comment");

    }

    public Optional<Comment> getComment(String id) {
        return commentRepository.findById(id);
    }


    public Comment updateComment(Comment comment) {
        Optional<Comment> c = commentRepository.getCommentById(comment.getId());
        if(c.isEmpty()) return null;
        Comment updateComment = c.get();
        updateComment.setId(comment.getId());
        updateComment.setMessage(comment.getMessage());
        updateComment.setCreated(comment.getCreated());
        updateComment.setTweetid(comment.getTweetid());
        updateComment.setUserId(comment.getUserId());
        return commentRepository.save(updateComment);
    }

    @KafkaListener(topics = "sentimentPython", groupId = "group_id")
    void getMessage(String message) {
        System.out.println(message);
    }

//        commentRepository.findOne(Query.query(Criteria.where("id").is(comment.getId())), Comment.class);
//        Query query = new Query();
//        query.addCriteria(Criteria.where("id").is(comment.getId()));
//        Comment comment1 = commentRepository.findOne(query, Comment.class);
//    @Autowired
//    private final RabbitTemplate rabbitTemplate;
//
//
//    @Value("${spring.rabbitmqcomment.exchange}")
//    private String exchangeComment;
//
//    @Value("${spring.rabbitmqcomment.routingkey}")
//    private String routingkeyComment;

//   public CommentService(CommentRepository commentRepository, RabbitTemplate rabbitTemplate)

//    public void deleteTweet(Long id) {
//        tweetRepository.deleteById(id);
//    }
//    public Comment updateTweet(Comment comment, String id) {
//        Optional<Comment> commentUpdate = commentRepository.findById(id);
////        if(tweetToUpdate.isEmpty()) return null;
////        Tweet _tweet  = tweetToUpdate.get();
////        _tweet.setDescription(tweet.getDescription());
////        return tweetRepository.save(_tweet);
//    }

//    public void sendCommentMessage(Long tweetId){
//        rabbitTemplate.convertAndSend(exchangeComment, routingkeyComment, tweetId);
//    }
}
