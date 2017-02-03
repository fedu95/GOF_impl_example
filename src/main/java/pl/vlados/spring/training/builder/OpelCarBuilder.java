package pl.vlados.spring.training.builder;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import pl.vlados.spring.training.entity.Car;
import pl.vlados.spring.training.interfaces.CarBuilder;


import javax.annotation.Resource;


@Component("opelCarBuilder")
public class OpelCarBuilder implements CarBuilder {

    @Resource(name = "car")
    Car car;

    @Value("Sedan")
    String body;

    @Value("DIESEL")
    String engine;

    @Value("2.2")
    double EngineSize;
    @Value("Kremowy")
    String color;

    @Value("OPEL VECTRA C")
    String model;




    public void buildBody() {

        car.setBody(body);

    }

    public void buildEngine() {

        car.setEngine(engine);

    }

    public void buildEngineSize() {

        car.setEngine_size(EngineSize);

    }

    public void paintColor() {

        car.setColor(color);

    }

    public void setModel() {

        car.setModel(model);

    }

    public Car createCar() {

        return car;
    }

    public void buildTurbine() {

    }

    public void buildTurbine(boolean turbo) {
        car.setTurbine(turbo);
    }
}
