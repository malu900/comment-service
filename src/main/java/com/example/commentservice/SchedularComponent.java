//package com.example.commentservice;
//
//import com.example.commentservice.config.WelcomeConfiguration;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//@Component
//public class SchedularComponent {
//
//    final
//    WelcomeConfiguration welcomeConfiguration;
//
//    public SchedularComponent(WelcomeConfiguration welcomeConfiguration) {
//        this.welcomeConfiguration = welcomeConfiguration;
//    }
//    @Value("${message:NOT CONFIGMAP}")
//    private String message;
//    @Value("${welcome.message:NOT CONFIGMAP}")
//    private String testprop;
//    @Value("${spring.kafka.consumer.bootstrap-servers:NOT CONFIGMAP}")
//    private String bootstraps;
////    @GetMapping
////    public String welcome(){
////        System.out.println(message);
////        return message;
////    }
////    @GetMapping("test")
////    public String welcomee(){
////        System.out.println(testprop);
////        return message;
////    }
//
//    @Scheduled(fixedDelay = 50000)
//    public void schedule() {
//        System.out.print(message  + "    SYSTEM PROPERTIES HOLLAAAA");
//        System.out.print(bootstraps  + "    SYSTEM PROPERTIES HOLLAAAA");
//    }
//}
