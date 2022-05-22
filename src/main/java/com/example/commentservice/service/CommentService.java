package com.example.commentservice.service;


import com.example.commentservice.model.Comment;
import com.example.commentservice.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;
    private final MongoTemplate mongoTemplate;
    private final MongoOperations mongoOperations;

    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);
    }
    public Comment getComment(String id) {
        Comment comment = mongoTemplate.findOne(Query.query(Criteria.where("id").is(id)), Comment.class);

        return comment;
    }


//    public Comment updateComment(Comment comment) {
////        commentRepository.findOne(Query.query(Criteria.where("id").is(comment.getId())), Comment.class);
////        Query query = new Query();
////        query.addCriteria(Criteria.where("id").is(comment.getId()));
////        Comment comment1 = commentRepository.findOne(query, Comment.class);
//        return commentRepository.save(comment);
//    }
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
