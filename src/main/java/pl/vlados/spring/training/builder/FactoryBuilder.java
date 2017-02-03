package pl.vlados.spring.training.builder;


import pl.vlados.spring.training.entity.Factory;

public abstract class FactoryBuilder  {

    Factory factory;

    public FactoryBuilder(Factory factory){this.factory = factory;}

    public  abstract void buildFactoryName();

    public Factory buildFactory(){

        return factory;

        }

}
