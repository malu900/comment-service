package com.example.commentservice.repository;



import com.example.commentservice.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface CommentRepository extends MongoRepository<Comment, String> {
}
