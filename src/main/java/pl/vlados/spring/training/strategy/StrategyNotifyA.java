package pl.vlados.spring.training.strategy;


import pl.vlados.spring.training.interfaces.Strategy;

public class StrategyNotifyA implements Strategy {


    public void privateNotify() {

        System.out.println("StrategyA");

    }
}
