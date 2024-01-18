package com.smuraha.chatmassager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ChatMassagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChatMassagerApplication.class, args);
    }

}
