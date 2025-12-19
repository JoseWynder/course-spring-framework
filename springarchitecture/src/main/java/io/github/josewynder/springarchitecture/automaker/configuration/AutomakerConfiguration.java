package io.github.josewynder.springarchitecture.automaker.configuration;

import io.github.josewynder.springarchitecture.automaker.Engine;
import io.github.josewynder.springarchitecture.automaker.EngineType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AutomakerConfiguration {

    @Primary
    @Bean(name = "aspiredEngine")
    @Scope("singleton")
    public Engine aspiredEngine() {
        var engine = new Engine();
        engine.setHorsePower(120);
        engine.setCylinders(4);
        engine.setModel("XPTO-0");
        engine.setLiterage(2.0);
        engine.setEngineType(EngineType.ASPIRED);
        return engine;
    }

    @Bean(name = "electricEngine")
    public Engine electricEngine() {
        var engine = new Engine();
        engine.setHorsePower(110);
        engine.setCylinders(3);
        engine.setModel("TH-40");
        engine.setLiterage(1.4);
        engine.setEngineType(EngineType.ELECTRIC);
        return engine;
    }

    @Bean(name = "turboEngine")
    public Engine turboEngine() {
        var engine = new Engine();
        engine.setHorsePower(180);
        engine.setCylinders(4);
        engine.setModel("XPTO-01");
        engine.setLiterage(1.5);
        engine.setEngineType(EngineType.TURBO);
        return engine;
    }
}
