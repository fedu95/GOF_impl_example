package pl.vlados.spring.training.starter_builder;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import pl.vlados.spring.training.entity.Car;
import pl.vlados.spring.training.interfaces.CarBuilder;


import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

@Component("carEngineer")
@Scope("singleton")
public class CarEngineer extends Observable {

    @Resource(name = "tuningBmw")
    public CarBuilder carBuilder;

    public Observer observer;

    private ArrayList<Observer> observers = new ArrayList<Observer>();

    public Car createCar(){

        carBuilder.buildBody();
        carBuilder.setModel();
        carBuilder.paintColor();
        carBuilder.buildEngineSize();
        carBuilder.buildEngine();
        carBuilder.buildTurbine(

        );
        setChanged();


        return carBuilder.createCar();

    }


}
