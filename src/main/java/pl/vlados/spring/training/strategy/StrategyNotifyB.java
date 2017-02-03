package pl.vlados.spring.training.strategy;


import pl.vlados.spring.training.interfaces.Strategy;

public class StrategyNotifyB implements Strategy {

    public void privateNotify() {


        System.out.println("StrategyB");

    }
}
