package pl.vlados.spring.training.entity;


import org.springframework.stereotype.Component;
import pl.vlados.spring.training.interfaces.Strategy;
import pl.vlados.spring.training.starter_builder.CarEngineer;


import java.util.Observable;
import java.util.Observer;


@Component("client")
public class Client implements Observer {

        CarEngineer observable;
        String name;
        Strategy strategy;

    public Client(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public void update(Observable observable, Object arg) {

        this.observable = (CarEngineer) observable;
        strategy.privateNotify();
    }
}
