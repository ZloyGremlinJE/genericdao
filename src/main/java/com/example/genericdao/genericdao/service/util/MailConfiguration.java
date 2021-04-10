package com.example.genericdao.genericdao.service.util;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;



@RequiredArgsConstructor
public class MailConfiguration {

//    private final Environment env;
//
//    @Bean
//    public JavaMailSender getJavaMailSender() {
//        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
//        mailSender.setHost(env.getProperty("spring.mail.host"));
//        mailSender.setPort(getIntProperty("spring.mail.port"));
//        mailSender.setUsername(env.getProperty("spring.mail.username"));
//        mailSender.setPassword(env.getProperty("spring.mail.password"));
//        mailSender.setProtocol(env.getProperty("spring.mail.protocol"));
//
//       Properties props = mailSender.getJavaMailProperties();
//       mailSender.setJavaMailProperties();
//       props.put("mail.transport.protocol", env.getProperty("spring.mail.protocol"));
//        props.put("mail.smtp.auth", env.getProperty("spring.mail.smtp.auth"));
//        props.put("mail.smtp.starttls.enable", env.getProperty("spring.mail.smtp.starttls.enable"));
//        props.put("mail.debug", env.getProperty("spring.mail.debug"));

       // return mailSender;
   // }

//    private int getIntProperty(String propName) {
//        String propVal = env.getProperty(propName);
//        return Integer.parseInt(propVal);
//    }
}
