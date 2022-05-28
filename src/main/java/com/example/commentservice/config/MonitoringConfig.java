//package com.example.commentservice.config;
//
//
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.Collection;
//
//@Configuration
//class MonitoringConfig {
//
//    @Bean
//    SpringBootMetricsCollector springBootMetricsCollector(Collection<PublicMetrics> publicMetrics) {
//
//        SpringBootMetricsCollector springBootMetricsCollector = new SpringBootMetricsCollector(publicMetrics);
//        springBootMetricsCollector.register();
//
//        return springBootMetricsCollector;
//    }
//
//    @Bean
//    ServletRegistrationBean servletRegistrationBean() {
//        DefaultExports.initialize();
//        return new ServletRegistrationBean(new MetricsServlet(), "/prometheus");
//    }
//}
