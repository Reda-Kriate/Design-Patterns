package org.reda.boisson;

public class Latte extends Boisson{

    public Latte() {
        this.description = "Latte";
    }

    @Override
    public double cout() {
        return 14;
    }
}
