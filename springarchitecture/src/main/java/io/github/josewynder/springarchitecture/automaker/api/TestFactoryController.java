package io.github.josewynder.springarchitecture.automaker.api;

import io.github.josewynder.springarchitecture.automaker.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestFactoryController {

    @Autowired
    private Engine engine;

    @PostMapping
    public CarStatus startCar(@RequestBody Key key) {
        var car = new HondaHRV(engine);
        return car.ignite(key);
    }
}
