package com.example.commentservice.controller;


import com.example.commentservice.model.Comment;
import com.example.commentservice.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/comment")
public class CommentController {
    private final CommentService commentService;

    @PostMapping
    public ResponseEntity<?> postComment(@RequestBody Comment params) {
        System.out.println(params);
        Comment comment = commentService.createComment(params);
        if(comment == null) return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        return ResponseEntity.status(HttpStatus.CREATED).body(comment);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getTweetById(@PathVariable String id) {
        Optional<Comment> comment = commentService.getComment(id);
        if (comment.isEmpty()) return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
        return ResponseEntity.ok().body(comment);
    }

    @PutMapping
    public ResponseEntity<?> updateComment(Comment params) {
        System.out.println(params);
        Comment comment = commentService.createComment(params);
        if(comment == null) return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        return ResponseEntity.status(HttpStatus.CREATED).body(comment);
    }
}
