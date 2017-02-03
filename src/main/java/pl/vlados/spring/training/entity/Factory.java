package pl.vlados.spring.training.entity;


/**
 * Created by User on 28.01.2017.
 */
public class Factory {

    private String factoryName;

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public Factory() {

    }

    @Override
    public String toString() {
        return "Factory{" +
                "factoryName='" + factoryName + '\'' +
                '}';
    }
}
