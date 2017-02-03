package pl.vlados.spring.training.builder;


import org.springframework.stereotype.Component;
import pl.vlados.spring.training.entity.Car;
import pl.vlados.spring.training.interfaces.CarBuilder;


import javax.annotation.Resource;

@Component("bmwCarBuilder")
public class BmwCarBuilder implements CarBuilder {

    @Resource(name = "car")
    Car car;


    public void buildBody() {

        car.setBody("Combi");

    }

    public void buildEngine() {

        car.setEngine("Fuel");

    }

    public void buildEngineSize() {

        car.setEngine_size(1.8);

    }

    public void paintColor() {

        car.setColor("Black");

    }

    public void setModel() {

        car.setModel("BMW e60 3 series");

    }

    public void buildTurbine() {
        car.setTurbine(false);

    }


    public Car createCar() {
        return this.car;
    }


}
