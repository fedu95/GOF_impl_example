package pl.vlados.spring.training.interfaces;

import org.springframework.stereotype.Component;
import pl.vlados.spring.training.entity.Car;

@Component("carBuilder")
public interface CarBuilder  {

     Car car = null;

    void buildBody();
    void buildEngine();
    void buildEngineSize();
    void paintColor();
    void setModel();
    void buildTurbine();
    Car createCar();
}
