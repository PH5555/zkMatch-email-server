package com.zkrypto.email.rabbitmq.dto;

import lombok.Getter;

@Getter
public class SendMessage {
    private String emailAddress;
    private String receiverName;
    private String postTitle;

    public SendMessage(String emailAddress, String receiverName, String postTitle) {
        this.emailAddress = emailAddress;
        this.receiverName = receiverName;
        this.postTitle = postTitle;
    }
}