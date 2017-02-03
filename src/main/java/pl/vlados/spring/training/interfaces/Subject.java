package pl.vlados.spring.training.interfaces;

import java.util.Observer;

/**
 * Created by User on 30.01.2017.
 */
public interface Subject {


        public void registerObserver(Observer observer);
        public void removeObserver(Observer observer);
        public void notifyObservers(String msg);


}
