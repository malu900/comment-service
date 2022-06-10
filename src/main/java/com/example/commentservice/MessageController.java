//package com.example.commentservice;
//
//import com.example.commentservice.component.CommentEventModel;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("api/v1/messages")
//public class MessageController {
//
//
//    private final KafkaTemplate<String, CommentEventModel> kafkaTemplate;
//
//    public MessageController(KafkaTemplate<String, CommentEventModel> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }
//
//    @PostMapping
//    public void publish(@RequestBody MessageRequest request){
//        CommentEventModel event = new CommentEventModel();
//        event.setId(";ajsfsadfasfdsafsadff");
//        event.setTweetid("shejfafs");
//        event.setMessage("MY MESSAGE");
////        kafkaTemplate.send("topicTwo", event);
//        kafkaTemplate.send("topicTwo", event);
//    }
//
////    private KafkaTemplate<String, String> kafkaTemplate;
////
////    public MessageController(KafkaTemplate<String, String> kafkaTemplate) {
////        this.kafkaTemplate = kafkaTemplate;
////    }
////
////    @PostMapping
////    public void publish(@RequestBody MessageRequest request){
////        kafkaTemplate.send("topicOne", request.message());
////    }
//}
