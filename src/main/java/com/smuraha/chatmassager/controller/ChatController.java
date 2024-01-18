package com.smuraha.chatmassager.controller;

import com.smuraha.chatmassager.model.Message;
import com.smuraha.chatmassager.model.OutputMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class ChatController {

    @MessageMapping("/chat2")
    @SendTo("/topic/messages")
    public String send(String message) throws Exception {

        final String time = new SimpleDateFormat("HH:mm").format(new Date());
        return message+" "+time;
    }
    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public OutputMessage send2(Message message) throws Exception {

        final String time = new SimpleDateFormat("HH:mm").format(new Date());
        return new OutputMessage(message.getFrom(),message.getText(),time);
    }

}
