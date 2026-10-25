package org.reda.decorator;

import org.reda.boisson.Boisson;

public class Noisette extends DecoratorBoisson{

    public Noisette(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return boisson.cout() + 1.7;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " Au Noisette";
    }
}
