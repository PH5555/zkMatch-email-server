package com.zkrypto.email.dto;

import lombok.Getter;

@Getter
public class EmailMessage {
    private String to;
    private String subject;
    private String message;
}
