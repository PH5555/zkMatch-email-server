package com.zkrypto.email;

import com.zkrypto.email.dto.EmailMessage;
import com.zkrypto.email.service.EmailService;
import com.zkrypto.email.utils.ReflectionUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class emailServiceTest {
    @Autowired
    EmailService emailService;

    @Test
    void 이메일_테스트() {
        EmailMessage emailMessage = new EmailMessage();
        ReflectionUtil.setter(emailMessage, "to", "lmkn5342@naver.com");
        ReflectionUtil.setter(emailMessage, "subject", "zkmatch");
        ReflectionUtil.setter(emailMessage, "message", "zkmatch");
        emailService.sendMail(emailMessage);
    }
}
