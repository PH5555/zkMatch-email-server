package com.zkrypto.email.rabbitmq;

import com.zkrypto.email.dto.EmailMessage;
import com.zkrypto.email.rabbitmq.dto.SendMessage;
import com.zkrypto.email.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DirectListener {
    private final EmailService emailService;

    @RabbitListener(queues = "email.queue")
    public void getMessage(SendMessage sendMessage) {
        System.out.println("이메일 전송");
        emailService.sendMail(EmailMessage.from(sendMessage));
    }
}
