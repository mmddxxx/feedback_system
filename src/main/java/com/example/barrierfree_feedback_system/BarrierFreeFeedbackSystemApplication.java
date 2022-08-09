package com.example.barrierfree_feedback_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;
//import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.example.barrierfree_feedback_system.mapper.dao")
//@EnableScheduling
public class BarrierFreeFeedbackSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(BarrierFreeFeedbackSystemApplication.class, args);
    }

}
