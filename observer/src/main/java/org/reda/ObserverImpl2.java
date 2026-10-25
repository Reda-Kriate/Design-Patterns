package org.reda;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {
    List<Double> history = new ArrayList<>();

    @Override
    public void update(Observable observable) {
        if (observable instanceof ObservableImpl obs){
            int state = obs.getState();
            System.out.println("***********Observer 2**********");
            history.add((double) state);
            double sum = 0;
            for(int i = 0 ; i < history.size() ; i++){
                sum+= history.get(i);
            }
            System.out.println("Average state : " + sum / history.size());
            System.out.println("***********Observer 2**********");
        }
    }
}
