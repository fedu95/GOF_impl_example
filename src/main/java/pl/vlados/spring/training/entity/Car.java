package pl.vlados.spring.training.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("car")
@Scope("prototype")
public class Car {

    private String body;
    private String engine;
    private double engine_size;
    private String color;
    private String model;
    private boolean turbine;

    public void setTurbine(boolean turbine) {
        this.turbine = turbine;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setEngine_size(double engine_size) {
        this.engine_size = engine_size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "body='" + body + '\'' +
                ", engine='" + engine + '\'' +
                ", engine_size=" + engine_size +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", turbine=" + turbine +
                '}';
    }
}
