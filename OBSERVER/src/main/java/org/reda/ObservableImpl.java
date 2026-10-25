package org.reda;

import java.util.ArrayList;
import java.util.List;


public class ObservableImpl implements Observable {
    int state;
    List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
//            observer.update(state); // Méthode PUSH
            observer.update(this); // Méthode POP (PULL)
        }
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    public int getState() {
        return state;
    }
}
