package org.reda;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(Observable observable) {
        if(observable instanceof ObservableImpl obs){
            int state = obs.getState();
            System.out.println("-----------Observer 1-----------");
            System.out.println("New state : " + state);
            System.out.println("Tendency : "+ Math.sqrt(state)*Math.cos(state));
            System.out.println("-----------Observer 1-----------");
        }

    }
}
