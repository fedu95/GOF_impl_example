package pl.vlados.spring.training.builder;

import org.springframework.stereotype.Component;
import pl.vlados.spring.training.entity.Car;
import pl.vlados.spring.training.interfaces.CarBuilder;


import javax.annotation.Resource;


@Component("tuningBmw")
public class TuningBmwCarBuilder implements CarBuilder {

    @Resource(name = "bmwCarBuilder")
    CarBuilder carBuilder;


    public void buildBody() {
        carBuilder.buildBody();

    }

    public void buildEngine() {
        carBuilder.buildEngine();
    }

    public void buildEngineSize() {
        carBuilder.buildEngineSize();
    }

    public void paintColor() {
        carBuilder.paintColor();
    }

    public void setModel() {
        carBuilder.setModel();
    }

    public void buildTurbine() {
        carBuilder.createCar().setTurbine(true);
        System.out.println("build_Turbine");
    }

    public Car createCar() {
        return carBuilder.createCar();
    }
}
