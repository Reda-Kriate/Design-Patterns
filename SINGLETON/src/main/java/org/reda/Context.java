package org.reda;


public class Context {

    //Pour l'implementation par defaut
    Strategy strategy = new StrategyImplDefault();

    public Context() {
    }
    public void perform(){
        strategy.apply();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
