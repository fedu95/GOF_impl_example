package pl.vlados.spring.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.vlados.spring.training.entity.Car;
import pl.vlados.spring.training.entity.Factory;
import pl.vlados.spring.training.starter_builder.CarEngineer;
import pl.vlados.spring.training.starter_builder.DirectorFactory;


import java.util.List;
import java.util.Observer;


public class Main {

    public List<Observer> observers;



    public Main(List<Observer> observers) {
        this.observers = observers;
    }

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        Main main = ctx.getBean(Main.class);

        DirectorFactory directorFactory = ctx.getBean(DirectorFactory.class);

        Factory factory = directorFactory.getFactory();

        CarEngineer carEngineer = (CarEngineer) ctx.getBean("carEngineer");

        for(Observer observer : main.observers)
        {
                carEngineer.addObserver(observer);
        }

        Car car = carEngineer.createCar();
        carEngineer.notifyObservers();

        System.out.println(car.toString());


        }


}
