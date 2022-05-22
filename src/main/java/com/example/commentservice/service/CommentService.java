package com.example.commentservice.service;


import com.example.commentservice.model.Comment;
import com.example.commentservice.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommentService {
    @Autowired
    private final CommentRepository commentRepository;
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
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
//        this.rabbitTemplate = rabbitTemplate;
    }

    public Comment createComment(Comment comment) {
//        sendCommentMessage(comment.getTweetId());
        return commentRepository.save(comment);
    }
    public Optional<Comment> getComment(Long id) {
        return commentRepository.findById(id);
    }
//    public void deleteTweet(Long id) {
//        tweetRepository.deleteById(id);
//    }
//    public Tweet updateTweet(Tweet tweet, Long id) {
//        Optional<Tweet> tweetToUpdate = tweetRepository.findById(id);
//        if(tweetToUpdate.isEmpty()) return null;
//        Tweet _tweet  = tweetToUpdate.get();
//        _tweet.setDescription(tweet.getDescription());
//        return tweetRepository.save(_tweet);
//    }

//    public void sendCommentMessage(Long tweetId){
//        rabbitTemplate.convertAndSend(exchangeComment, routingkeyComment, tweetId);
//    }
}
