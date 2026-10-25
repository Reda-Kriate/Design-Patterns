package org.reda.boisson;

public class Machiatto extends Boisson{

    public Machiatto() {
        this.description = "Machiatto";
    }

    @Override
    public double cout() {
        return 16;
    }
}
