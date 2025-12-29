package io.github.josewynder.springarchitecture;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueExample {

    @Value("${app.config.variable}")
    private String variable;

    public void printVariable() {
        System.out.println(variable);
    }
}
