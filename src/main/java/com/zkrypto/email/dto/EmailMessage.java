package com.zkrypto.email.dto;

import com.zkrypto.email.rabbitmq.dto.SendMessage;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class EmailMessage {
    private String to;
    private String subject;
    private String message;

    private EmailMessage(String to, String subject, String message) {
        this.to = to;
        this.subject = subject;
        this.message = message;
    }

    public static EmailMessage from(SendMessage sendMessage) {
        String subject = "[" + sendMessage.getPostTitle() + "] 채용 결과 알림";
        String message = sendMessage.getReceiverName() + "님은 " + sendMessage.getPostTitle() + "에 합격했습니다.";
        return new EmailMessage(sendMessage.getEmailAddress(), subject, message);
    }
}
