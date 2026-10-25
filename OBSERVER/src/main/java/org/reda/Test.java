package org.reda;

public class Test {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        Observer obs1 = new ObserverImpl1();
        Observer obs2 = new ObserverImpl2();

        observable.subscribe(obs1);
        observable.subscribe(obs2);

        observable.setState(13);
        observable.setState(8);
        observable.setState(28);
    }
}
