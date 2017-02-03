package pl.vlados.spring.training.builder;


import pl.vlados.spring.training.entity.Factory;

public class AutoFactoryBuilder extends FactoryBuilder {


    public AutoFactoryBuilder(Factory factory) {
        super(factory);
    }

    public void buildFactoryName() {
        factory.setFactoryName("Auto factory");
    }

}
