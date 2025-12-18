package io.github.josewynder.springarchitecture.automaker.configuration;

import io.github.josewynder.springarchitecture.automaker.Engine;
import io.github.josewynder.springarchitecture.automaker.EngineType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutomakerConfiguration {

    @Bean
    public Engine engine() {
        var engine = new Engine();
        engine.setHorsePower(120);
        engine.setCylinders(4);
        engine.setModel("XPTO-0");
        engine.setLiterage(2.0);
        engine.setEngineType(EngineType.ASPIRED);
        return engine;
    }
}
