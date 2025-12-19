package io.github.josewynder.springarchitecture.todos;

import org.springframework.stereotype.Component;

@Component
public class MailSender {

        public void send(String message) {
            System.out.println("Sending email to " + message);
        }
}
