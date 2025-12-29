package io.github.josewynder.springarchitecture;

import io.github.josewynder.springarchitecture.todos.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmailAccessConfiguration {

    @Autowired
    private AppProperties appProperties;

    //@Bean
    public MailSender mailSender() {
        return null;
    }
}
