package org.reda;

public class StrategyImplDefault implements Strategy{
    @Override
    public void apply() {
        System.out.println("!!!!!!!!!!-> strategy par defaut <-!!!!!!!!!!");
    }
}
