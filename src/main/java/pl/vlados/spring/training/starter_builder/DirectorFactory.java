package pl.vlados.spring.training.starter_builder;



import pl.vlados.spring.training.builder.FactoryBuilder;
import pl.vlados.spring.training.entity.Factory;

/**
 * Created by User on 29.01.2017.
 */
public class DirectorFactory {

    FactoryBuilder factoryBuilder;

    public void setFactoryBuilder(FactoryBuilder factoryBuilder) {
        this.factoryBuilder = factoryBuilder;
    }

        public Factory getFactory(){

            factoryBuilder.buildFactoryName();
            return factoryBuilder.buildFactory();

        }
}
